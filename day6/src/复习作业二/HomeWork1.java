package 复习作业二;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//4.1
//		System.out.println("请输入两个数:");
//		twoNum(scanner.nextInt(), scanner.nextInt());
		
		//4.2
//		略
		
		//4.3
//		shengXUString(scanner.next());
		
		//4.6
//		getCharType(scanner.next().charAt(0));
		
		//4.11
		nextSecendTime(scanner.next());
		
		
		
	}
	/**
	 * 4.1
	 * @param num1
	 * @param num2
	 */
	public static void twoNum(int num1,int num2) {
		int max = num1 > num2 ? num1 : num2;
		int min = num1 < num2 ? num1 : num2;
		System.out.println("从小到大排序后输出"+min+"-->"+max);
	}
	/**
	 * 4.2略
	 * @param num1
	 * @param num2
	 * @param num3
	 */
	public static void threeNum(int num1,int num2,int num3) {
		//略
	}
	/**
	 * 4.3
	 * @param str
	 */
	public static void shengXUString(String str) {
		char[] cs = str.toCharArray();
		for (int i = 0; i < cs.length-1; i++) {
			for (int j = 0; j < cs.length-i-1; j++) {
				if (cs[j] > cs[j+1]) {
					char temp = cs[j];
					cs[j] = cs[j+1];
					cs[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(cs));
	}
	/**
	 * 4.6
	 * @param c
	 */
	public static void getCharType(char c) {
		if (c>=48 && c<=57) {
			System.out.println("这个字符是数字");
		}else if (c>=65 && c<=90) {
			System.out.println("这个字符是大写字母");
		}else if (c>= 97 && c<=122) {
			System.out.println("这个字符是小写字母");
		}else {
			System.out.println("这个字符是其他字符");
		}
	}
	public static void nextSecendTime(String str) {
		String[] strings = str.split(":");
		System.out.println(Arrays.toString(strings));
		Integer num = Integer.parseInt(strings[2]) + 1;
		System.out.println(strings[0]+":"+strings[1]+":"+num.toString());
	}
}
