package com.qianfeng.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * format:格式转化器
 * DateFormat:日期格式转化器
 */
public class Demo3 {
	public static void main(String[] args) {
		//1.使用系统默认提供的格式--DateFormt--有限的四种格式:short,long,full,default
		//第一个参数是设置日期的格式    第二个是设置时间的格式
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		String date = dateFormat.format(new Date());
		System.out.println(date);
		//2.使用自定义的格式--SimpleDateFormat
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//HH表示24时  hh表示12时
		String date1 = simpleDateFormat.format(new Date());
		System.out.println(date1);
	}
}
