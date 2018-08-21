package com.qianfeng.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Demo8 {
	public static void main(String[] args) throws IOException {
		/*
		 * 更换输入源,输出源----这里是临时更换,只能在当前程序中使用更换后的输入源输出源,如果在其他程序在会自动变回原来的输入源输出源
		 * 
		 * 实例:实现从键盘----控制台 更新成 从文件到文件
		 */
		
		//将System.in对应的输入源从键盘更换成了文件
		System.setIn(new FileInputStream("temp1.txt"));
		//将System.out对应的输出源从控制台更换成了文件
		System.setOut(new PrintStream("temp4.txt"));
		
		//进行读写操作
		BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(System.out));

		String data = null;
		while ((data = bufferedReader1.readLine()) != null) {
			bufferedWriter1.write(data);
			bufferedWriter1.newLine();
			bufferedWriter1.flush();
		}
		
		bufferedReader1.close();
		bufferedWriter1.close();
	}
}
