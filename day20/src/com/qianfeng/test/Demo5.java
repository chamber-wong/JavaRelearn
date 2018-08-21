package com.qianfeng.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo5 {
	public static void main(String[] args) throws IOException {
		//标准输入流 	 出发点:键盘  	目的地:内存
		InputStream inputStream = System.in;//这里可以直接得到标准输入流对象,并已经绑定了键盘,直接可以从键盘接收数据
											//注意点:标准输入流是一个字节流
		OutputStream outputStream = System.out;
//		int num = inputStream.read();//是一个阻塞式的方法,会一直等待用户输入
//		System.out.println((char)num);
		
		/*
		 * 实例:从键盘不断接收字节的程序
		 * 要求:一行一行的接收
		 */
		myReadLine(inputStream);
		
		inputStream.close();
	}
	
	public static String myReadLine(InputStream inputStream) throws IOException {
		StringBuilder stringBuilder = new StringBuilder();
		while (true) {
			
			int num = inputStream.read();
			if (num == '\r') {
				continue;
			}else if (num == '\n') {
				System.out.println(stringBuilder.toString());
				//当输入over的时候认为是结束
				if (stringBuilder.toString().contains("over")) {
					break;
				}
				stringBuilder.delete(0, stringBuilder.length());
			}else {
				stringBuilder.append((char)num);
			}
			
			
		}
		return null;
	}
}
