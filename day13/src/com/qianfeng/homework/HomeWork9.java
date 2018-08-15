package com.qianfeng.homework;

public class HomeWork9 {
	public static void main(String[] args) {
		long a = System.currentTimeMillis();
		System.out.println(a);
		String string = "A";
		for(int i = 0;i<10000;i++) {
			 string += "A";
		}
		long b = System.currentTimeMillis();
		System.out.println(b);
		System.out.println("String为:"+string.length());
		System.out.println("差值为:"+(b-a));
		
		long a1 = System.currentTimeMillis();
		System.out.println(a1);
		StringBuilder stringBuilder = new StringBuilder("A");
		for(int i = 0;i<10000;i++) {
			 stringBuilder.append("A");
		}
		long b1 = System.currentTimeMillis();
		System.out.println(b1);
		System.out.println("StringBuilder为:"+stringBuilder.length());
		System.out.println("差值为:"+(b1-a1));
	}
}
