package homework;

import java.util.Scanner;

public class HomeWork5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数字:");
		int num = scanner.nextInt();
		printAB(num);
		scanner.close();
	}
	public static void printAB(int num) {
		for(int i = 1;i < num+1; i++) {
			for(int i1 = num-i;i1>=0;i1--) {
				System.out.print(" ");
			}
			for (int j = i; j >0; j--) {
				System.out.print("A");
			}
			for(int k = num-i;k>0;k--) {
				System.out.print("B");
			}
			System.out.println();
		}
	}
}
