package model;

import java.util.LinkedList;
import java.util.Random;

/**
 * 扑克牌类
 * 
 * @author 弄风
 *
 */
public class Poker {
	private LinkedList<String> linkedList;

	/**
	 * 当创建扑克牌对象的时候获取一整副牌
	 */
	public Poker() {
		super();
		init();
	}

	/**
	 * 发牌
	 * @return
	 */
	public String dealPoker() {
		return linkedList.pollFirst();
	}

	/**
	 * 获取到一副有顺序的牌,存到linkedList中
	 */
	private void init() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Middle Joker");
		linkedList.add("Big Joker");

		for (int i = 0; i < 4; i++) {
			String color = "";
			switch (i) {
			case 0:
				color = "Spade ";// 黑桃
				break;
			case 1:
				color = "Heart ";// 红桃
				break;
			case 2:
				color = "Club ";// 梅花
				break;
			case 3:
				color = "Diamond ";// 方片
				break;

			}
			for (int j = 1; j <= 13; j++) {
				String num = "";
				switch (j) {
				case 11:
					num = "Jack";
					break;
				case 12:
					num = "Queen";
					break;
				case 13:
					num = "King";
					break;
				case 1:
					num = "Ace";
					break;

				default:
					num = j + "";
					break;
				}
				linkedList.add(color + num);
			}
		}
		this.linkedList = linkedList;
	}

	/**
	 * 根据有顺序的一副牌,洗牌
	 * 
	 * @return
	 */
	public void shuffle() {
		LinkedList<String> randomList = new LinkedList<>();
		Random random = new Random();
		while (linkedList.size() != 0) {
			int index = random.nextInt(linkedList.size());
			randomList.add(linkedList.remove(index));
		}
		this.linkedList = randomList;
	}

	/**
	 * 获取地主牌 随机抽取一张牌当做地主牌 随机生成一个1-51数
	 */
	public int getLandlordPoker() {
		Random random = new Random();
		int index = random.nextInt(51);
		return index;
	}

	/**
	 * 重写toString方法
	 */
	public String toString() {
		return linkedList.toString();
	}

	/**
	 * 获取整副牌
	 * @return
	 */
	public LinkedList<String> getLinkedList() {
		return linkedList;
	}
}
