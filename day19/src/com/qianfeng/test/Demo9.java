package com.qianfeng.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用缓冲流实现文件的复制
 * 将Demo8的内容复制到temp5.txt
 */
public class Demo9 {
	public static void main(String[] args) throws IOException {
		//创建字符写出流
		//使用字符缓冲流实现写出
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temp5.txt"));
		//1.创建字符读入流
		//2.创建字符缓冲读入流
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/qianfeng/test/Demo8.java"));
			
		//读写
		String data  = null;
		while ((data = bufferedReader.readLine()) != null) {
			bufferedWriter.write(data);
			bufferedWriter.newLine();
		}
		//关闭流
		bufferedReader.close();
		bufferedWriter.close();
	}
}
