package homework;

import java.util.ArrayList;
import java.util.Random;

public class HomeWork3 {
	static ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		random();
		int sum = sum();
		System.out.println("所有元素的和为:"+sum);
	}
	public static void random() {
		Random r = new Random();
		for (int i = 0; i < 20; i++) {
			int random1 = r.nextInt(20)+10;
			System.out.println("生成的随机数为:"+random1);
			list.add(random1);
		}
	}
	public static int sum() {
		int sum = 0;
		for (Integer integer : list) {
			sum += integer;
		}
		return sum;
	}
}
