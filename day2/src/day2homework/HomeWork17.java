package day2homework;

import java.util.Scanner;

public class HomeWork17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner out = new Scanner(System.in);
		System.out.print("������һ����Ҫ���������:");
		int a = out.nextInt();
		int q =0;
		for(int i = 2;i<a ;i++) {
			if( a%i==0 ) {
				q = 1;
				break;
			}
		}
		if(q == 0) {
			System.out.println(a+"��һ������");
		}else {
			System.out.println(a+"����һ������");
		}
		out.close();
	}

}
