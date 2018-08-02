package day2homeworkOther;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入要计算的值:");
		int n = sca.nextInt();
		int sum = 0;
		for(int i = n;i>=1;i--) {
			sum += i;
		}
		System.out.println("计算结果为:"+sum);
		sca.close();
	}

}
