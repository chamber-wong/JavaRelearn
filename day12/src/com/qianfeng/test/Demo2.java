package com.qianfeng.test;

import java.util.Date;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * Date:日期类
		 * Data:数据类:表示的都是二进制的数据
		 */
		//当前的时间
		Date date = new Date();
		System.out.println(date);
		
		//long型的数据
		long time = System.currentTimeMillis();//获取的当前的时间,单位是毫秒
		System.out.println(time);
		
		//实现时间的转换
		//long型的转成date型
		Date date2 = new Date(time);
		System.out.println(date2);
		
		//从date型到long型
		System.out.println(date2.getTime());
	}
}
