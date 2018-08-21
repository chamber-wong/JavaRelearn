package com.qianfeng.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 实例:从文件中读取内容,并显示在控制台---FileReader
 */
public class Demo4 {
	public static void main(String[] args) throws IOException {
		//1.创建对象并关联文件
		FileReader fileReader = new FileReader("temp2.txt");
		
		//2.读操作
		/*
		 * read():一个字符一个字符的读
		 * read(数组):一次可以读多个字符,将读到的多个字符会临时存储到数组中.
		 */
		//read():一个字符一个字符的读
		//a:将当前的字符读出   b:将当前的指针后移一个字符
		int num = 0;
		while ((num = fileReader.read()) != -1) {
			System.out.println((char)num);
		}
		
		//关流
		fileReader.close();
	}
}
