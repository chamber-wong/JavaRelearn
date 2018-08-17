package controller;

import model.Player;
import model.Poker;

public class Logic {
	public void allot(Player p1, Player p2, Player p3, Poker poker) {

		// 洗牌
		poker.shuffle();

		// 选取地主
		int landlordIndex = poker.getLandlordPoker();
		System.out.println("地主牌是:[" + poker.getLinkedList().get(landlordIndex) + "]");
		System.out.println("---------------------------------------");
		Player landlordPlayer;
		if (landlordIndex % 3 == 0) {
			p1.setLandlord(true);
			landlordPlayer = p1;
		} else if (landlordIndex % 3 == 1) {
			p2.setLandlord(true);
			landlordPlayer = p2;
		} else {
			p3.setLandlord(true);
			landlordPlayer = p3;
		}

		// 发取普通牌
		for (int i = 0; i < 51; i++) {
			int flat = i % 3;
			String pString = poker.dealPoker();
			if (flat == 0) {
				p1.addPoker(pString);
			} else if (flat == 1) {
				p2.addPoker(pString);
			} else {
				p3.addPoker(pString);
			}
		}

		// 展示最后三张牌
		System.out.println("底牌是:" + poker.toString());
		System.out.println("---------------------------------------");

		// 把最后三张牌发给地主
		for (int i = 0; i < 3; i++) {
			landlordPlayer.addPoker(poker.dealPoker());
		}

		// 展示所有人的牌:
		System.out.println(p1.toString());
		System.out.println("---------------------------------------");
		System.out.println(p2.toString());
		System.out.println("---------------------------------------");
		System.out.println(p3.toString());
		System.out.println("---------------------------------------");
	}

}
