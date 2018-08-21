package com.qianfeng.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//window下的换行是:\r\n     linux/Unix    \n
public class Demo7 {
	public static void main(String[] args) throws IOException {
		/*
		 * 字符缓冲流:(字符缓冲区)
		 * 定义:为了提高读写的能力,本身没有读写的能力,要想进行读写就必须借助于字符流实现.
		 * 
		 * 可以将缓冲流类比于催化剂或者高速的小车
		 * 
		 * 字符缓冲流分类:
		 * 字符缓冲读入流:BufferedReader   没有读的能力
		 * 字符缓冲写出流:BufferedWriter   没有写的能力
		 */
		
		//创建字符写出流
		FileWriter fileWriter = new FileWriter("temp4.txt");
		
		//使用字符缓冲流实现写出
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		//写的操作
		bufferedWriter.write("bingbing");
		//bufferedWriter.write("\r\n");//window下的换行
		bufferedWriter.newLine();//换行,可以实现跨平台
		bufferedWriter.write("chenchen");
		
		//关闭缓冲流---1.关闭内部的写出流  2.刷新   3.将自己关闭
		bufferedWriter.close();
	}
}	
