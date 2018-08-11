package homework;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class HomeWork1 {
	public static void main(String[] args) {
		System.out.println(homework2());
		homework3();
		homework4();
		circleArea(1);
		homework6();
		homework7();
		
		
	}
	public static int homework1(int a) {
		Integer integer = new Integer(a);
		int i = integer;
		return i;
	}
	public static boolean homework2() {
		Character character = new Character('a');
		Character character2 = new Character('a');
		boolean b = (character.equals(character2));
		return b;
	}
	public static void homework3() {
		Boolean boolean1 = new Boolean(true);
		Boolean boolean2 = new Boolean(false);
		
		Boolean boolean3 = new Boolean("true");
		Boolean boolean4 = new Boolean("false");
		
		
		System.out.println(boolean1);
		System.out.println(boolean2);
		System.out.println(boolean3);
		System.out.println(boolean4);
	}
	public static void homework4() {
		int sum = 0;
		for(int i= 0;i<6;i++) {
			int r = (int)(Math.random()*14) +2;
			System.out.println(r*2);
			
			sum += r;
		}
		System.out.println("和为:"+sum);
	}
	public static void circleArea(double r) {
		System.out.printf("%.5f\n", r*r*3.14);
	}
	public static void homework6() {
		Random random = new Random(13);
		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextInt(8999)+1000);
		}
	}
	public static void homework7() {
		StringBuilder stringBuilder = new StringBuilder("hello");
		stringBuilder.append(" world");
		System.out.println(stringBuilder);
		
		ArrayList list = new ArrayList();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			
		}
		
	}
}
