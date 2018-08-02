package day2homeworkOther;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int a = sca.nextInt();
		int sum = 1;
		while(a>0) {
			sum *= a;
			a--;
		}
		System.out.println("这个数的阶乘为:"+ sum);
		sca.close();
	}

}
