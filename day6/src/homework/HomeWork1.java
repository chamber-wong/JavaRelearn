package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个int值:");
		int num = scanner.nextInt();
		System.out.println("反转后的值为:"+reverseIne(num));
		scanner.close();
	}
	//将int反转
	public static int reverseIne(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		while(num >= 1 ) {
			list.add(num%10);
			num /= 10;
		}
		Collections.reverse(list);
		num = 0;
		int temp = 1;
		for (Integer integer : list) {
			num += temp*integer;
			temp *= 10;
		}
		return num;
		
	}
}
