package day2homeworkOther;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入一个正整数:");
		int a = sca.nextInt();
		int sum = 0;
		for(;;) {
			if(a>=1) {
				sum += a%10;
				a /= 10;
			}else {
				break;
			}
		}
		System.out.println("这个正整数各位数字的和为:"+sum);
		sca.close();
	}

}
