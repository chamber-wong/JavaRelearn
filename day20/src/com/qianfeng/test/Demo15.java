package com.qianfeng.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Demo15 {
	public static void main(String[] args) throws IOException {
		/*
		 * PrintWriter:字符打印流
		 * 支持的设备:
		 * 1.File类型的文件
		 * 2.String类型的文件
		 * 3.字节流对象
		 * 4.字符流对象
		 */
		
		//从键盘输入数据
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		//从内存到控制台
		PrintWriter printWriter = new PrintWriter(System.out);
		
		//进行读写
		String data = null;
		while ((data = bufferedReader.readLine()) != null) {
			printWriter.println(data);
			printWriter.flush();
		}
		
		bufferedReader.close();
		printWriter.close();
		
	}
}
