package day2homeworkOther;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入一个数字:");
		int a = sca.nextInt();
		System.out.println("请输入要相加的个数:");
		int b = sca.nextInt();
		int sum = 0;
		int c = a;
		for(int i = 0;i < b;i++) {
			if(i < b-1)
				System.out.print(a+"+");
			else 
				System.out.print(a);
			
			sum += a;
			a = a*10 +c;
		}
		System.out.println("="+sum);
		sca.close();
	}

}
