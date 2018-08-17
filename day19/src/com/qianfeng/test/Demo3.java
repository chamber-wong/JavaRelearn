package com.qianfeng.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 实例:从文件中读出内容,并显示存在控制台
 * @author 弄风
 *
 */
public class Demo3 {
	public static void main(String[] args) throws IOException {
		//1.创建对象并关联文件
		FileReader fileReader = new FileReader("temp2.txt");
		
		//2.读操作
		/*
		 * read():读取一个字符
		 * read(数组):读取多个符,将督导的多个字符会临时存储到数组中
		 */
//		int i = fileReader.read();
		int num;
		while ((num = fileReader.read()) != -1) {
			System.out.println((char)num);
		}
		
		//关流
		fileReader.close();
	}
}
