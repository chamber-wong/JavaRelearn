package com.qianfeng.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * format:��ʽת����
 * DateFormat:���ڸ�ʽת����
 */
public class Demo3 {
	public static void main(String[] args) {
		//1.ʹ��ϵͳĬ���ṩ�ĸ�ʽ--DateFormt--���޵����ָ�ʽ:short,long,full,default
		//��һ���������������ڵĸ�ʽ    �ڶ���������ʱ��ĸ�ʽ
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		String date = dateFormat.format(new Date());
		System.out.println(date);
		//2.ʹ���Զ���ĸ�ʽ--SimpleDateFormat
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//HH��ʾ24ʱ  hh��ʾ12ʱ
		String date1 = simpleDateFormat.format(new Date());
		System.out.println(date1);
	}
}
