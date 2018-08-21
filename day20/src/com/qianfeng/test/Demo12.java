package com.qianfeng.test;

public class Demo12 {
	public static void main(String[] args) {
		//递归实例一:求1-60之间所有偶数的积与奇数的积的差
		
		System.out.println(run());
		System.out.println(jiJi);
		System.out.println(ouJi);
	}
	
	static int ouJi = 1;
	static int jiJi = 1;
	static int num = 1;
	
	public static int run() {
		
		if (num % 2 == 0) {
			ouJi *= num;
		}else {
			jiJi *= num;
		}
		
		if (num++ == 10) {
			return ouJi-jiJi;
		}
		return run();
	}
}
