package day2homeworkOther;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("������һ��������");
		int a = sca.nextInt();
		int sum = 1;
		while(a>0) {
			sum *= a;
			a--;
		}
		System.out.println("������Ľ׳�Ϊ:"+ sum);
		sca.close();
	}

}
