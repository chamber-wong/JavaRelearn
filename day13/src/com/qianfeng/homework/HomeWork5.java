package com.qianfeng.homework;

import java.util.Random;
import java.util.Scanner;

public class HomeWork5 {
	public static void main(String[] args) {
		while(true) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入剪刀石头或布(1,剪刀 2,石头 3,布):");
		int userNum = scanner.nextInt();
		Random random = new Random();
		int num = random.nextInt(3)+1;
		if (num == 1) {
			System.out.println("电脑出的是剪刀");
			if (userNum == 1) {
				System.out.println("平局");
			}else if (userNum == 2) {
				System.out.println("你赢了");
			}else if (userNum == 3) {
				System.out.println("你输了");
			}
		}else if(num == 2){
			System.out.println("电脑出的是石头");
			if (userNum == 1) {
				System.out.println("你输了");
			}else if (userNum == 2) {
				System.out.println("平局");
			}else if (userNum == 3) {
				System.out.println("你赢了");
			}
		}else if(num == 3){
			System.out.println("电脑出的是布");
			if (userNum == 1) {
				System.out.println("你赢了");
			}else if (userNum == 2) {
				System.out.println("你输了");
			}else if (userNum == 3) {
				System.out.println("平局");
			}
		}
		}
	}
}
