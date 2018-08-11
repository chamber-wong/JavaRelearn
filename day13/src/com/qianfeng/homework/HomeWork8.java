package com.qianfeng.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HomeWork8 {
	public static void main(String[] args) {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		Date date = new Date();
		String format = sFormat.format(date);
		System.out.println(format);
	}
}
