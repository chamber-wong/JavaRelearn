package com.qianfeng.homework;

/**
 * 随机生成一个1到13的整数，如果生成的是1到10之间的数，就输出“电脑出了一张几”，比如产生了一个5就输出“电脑出了一张5”，如果生成的是11就输出“电脑出了一张J”，如果生成的是12就输出“电脑出了一张Q”，如果生成是13就输出“电脑出了一张K”
 * 
 * @author 弄风
 *
 */
public class HomeWork4 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*12+1);
		if (num<=10) {
			System.out.println("电脑出了一张"+num);
		}else if (num == 11) {
			System.out.println("电脑出了一张J");
		}else if (num == 12) {
			System.out.println("电脑出了一张Q");
		}else if (num == 13) {
			System.out.println("电脑出了一张K");
		}
	}
}
