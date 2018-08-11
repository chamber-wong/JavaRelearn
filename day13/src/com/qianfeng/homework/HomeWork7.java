package com.qianfeng.homework;

import java.math.BigDecimal;
import java.util.Scanner;

public class HomeWork7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个小数:");
		String num = scanner.next();
		System.out.println("请再次输入一个小数:");
		String num2 = scanner.next();
		BigDecimal bigDecimal1 = new BigDecimal(num);
		BigDecimal bigDecimal2 = new BigDecimal(num2);

		int a = bigDecimal1.intValue();
		int b = bigDecimal2.intValue();
		

		BigDecimal decimal = new BigDecimal(Integer.toString(a));
		BigDecimal decimal2 = new BigDecimal(Integer.toString(b));

		// 获得小数位
		BigDecimal i1 = bigDecimal1.subtract(decimal);
		BigDecimal i2 = bigDecimal2.subtract(decimal2);
		double d1 = i1.doubleValue();
		double d2 = i2.doubleValue();

		if ((a + b) > 10) {
			if ((d1 + d2) > 1.0) {
				System.out.println("这两个数的小数部分大于1.0");
			} else {
				System.out.println("这两个数的小数部分小于1.0");
			}
		} else {
			if ((d1 - d2) > 0.0) {
				System.out.println("这两个数的小数部分的差大于0.0");
			} else {
				System.out.println("这两个数的小数部分的差小于0.0");
			}
		}
	}
}
