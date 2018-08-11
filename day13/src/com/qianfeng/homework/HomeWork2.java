package com.qianfeng.homework;

import java.util.Scanner;

/**
 * 首先询问顾客是否是会员（1代表是0代表不是），
 * 再请用户输入购物金额。非会员购物统一打九折；
 * 会员如果购物200元以下打8折，如果购物上200则可以打七五折;
 * 使用嵌套if输出最后用户实际需要支付的钱数
 * 
 * @author 弄风
 *
 */
public class HomeWork2 {
	public static void main(String[] args) {
		int pay;
		Scanner scanner = new Scanner(System.in);
		System.out.println("您是否会员(1代表是0代表不是):");
		int isVip = scanner.nextInt();
		System.out.println("请输入购物金额:");
		int money = scanner.nextInt();
		if (isVip == 1) {
			if (money<200) {
				pay = (int) (money*0.8);
			}else {
				pay = (int) (money*0.75);
			}
		}else {
			pay = (int) (money*0.9);
		}
		System.out.println("您实际需要支付:"+pay+"元");
		scanner.close();
	}
}
