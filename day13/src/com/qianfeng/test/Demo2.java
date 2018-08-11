package com.qianfeng.test;

import java.util.Enumeration;
import java.util.Vector;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * Vector:了解
		 * 遍历的时候使用的是枚举器
		 */
		Vector vector = new Vector<>();
		vector.add("java1");
		vector.add("java2");
		vector.add("java3");
		vector.add("java4");
		
		//遍历--枚举器
		//获取枚举器
		Enumeration enumeration = vector.elements();
		//遍历
		while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			System.out.println(object);
		}
		
	}
}
