package day2homework;

import java.util.Scanner;

public class HomeWork18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner out = new Scanner(System.in);
		System.out.print("请输入一个8位数:");
		int n = out.nextInt();
		int sum = 0 ;
		while (n != 0) {
		    sum = sum + n%10;
		    n = n/10;
		}
		System.out.println("这个整数所有位的数值加在一起的值为:" + sum);
		out.close();
	}

}
