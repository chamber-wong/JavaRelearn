package com.qianfeng.homework;

import java.util.Scanner;
/**
 * .现在有一个银行保险柜，有两道密码。想拿到里面的钱必须两次输入的密码都要正确。如果第一道密码都不正确，那直接把你拦在外面；如果第一道密码输入正确，才能有权输入第二道密码。只有当第二道密码也输入正确，才能拿到钱！
(第一道密码666666，第二道密码888888)(嵌套if）
 * @author 弄风
 *
 */
public class HomeWork3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入第一道密码:");
		int password1 = scanner.nextInt();
		if (password1 == 666666) {
			System.out.println("请输入第二道密码:");
			int password2 = scanner.nextInt();
			if (password2 == 888888) {
				System.out.println("给你500万");
			}
		}else {
			System.out.println("输入错误,想拿钱是不可能的!");
		}
	}
}
