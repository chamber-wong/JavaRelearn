package test;

import java.util.ArrayList;
import java.util.Collections;

import controller.Logic;
import model.Player;
import model.Poker;

public class Test {
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Poker poker = new Poker();

		Logic logic = new Logic();
		logic.allot(p1, p2, p3, poker);
//		
//		ArrayList<String> list = new ArrayList<>();
//		list.add("1");
//		list.add("2");
//		list.add("3");
//		list.add("4");
//		list.add("5");
//		list.add("6");
//		list.add("7");
//		list.add("8");
//		list.add("9");
//		System.out.println(list);
//		Collections.shuffle(list);
//		System.out.println(list );
	}
}
