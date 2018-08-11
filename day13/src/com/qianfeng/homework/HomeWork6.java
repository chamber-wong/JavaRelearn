package com.qianfeng.homework;

import java.util.Random;

public class HomeWork6 {
	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(13) + 1;
		int flower = random.nextInt(4);
		
		if (num<=10) {
			System.out.println("电脑出了一张"+flowerColor(flower)+num );
		}else if (num == 11) {
			System.out.println("电脑出了一张"+flowerColor(flower)+"J");
		}else if (num == 12) {
			System.out.println("电脑出了一张"+flowerColor(flower)+"Q");
		}else if (num == 13) {
			System.out.println("电脑出了一张"+flowerColor(flower)+"K");
		}

	}

	public static String flowerColor(int flower) {
		switch (flower) {
		case 0:
			return "黑桃";
		case 1:
			return "红桃";
		case 2:
			return "梅花";
		case 3:
			return "方块";
		default:
			return "错误";
		}
	}
}
