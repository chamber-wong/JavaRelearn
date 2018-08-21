package com.qianfeng.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Demo7 {
	public static void main(String[] args) throws IOException {
		/*
		 * 设备之间数据传输的总结 
		 * 输入源:键盘 输出源:控制台
		 * 
		 * 输入源:键盘 输出源:文件
		 * 
		 * 输入源:文件 输出源:控制台
		 * 
		 * 输入源:文件 输出源:文件
		 */

		// 将键盘作为输入源
		BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(System.in));
		// 将文件作为输入源
		BufferedReader bufferedReader2 = new BufferedReader(new FileReader("temp1.txt"));
		// 将控制台作为输出源
		BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(System.out));
		// 将文件作为输出源
		BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter("temp2.txt"));

		// 读入
//		 * 输入源:键盘
//		 * 输出源:控制台
		String data = null;
		while ((data = bufferedReader1.readLine()) != null) {
			bufferedWriter1.write(data);
			bufferedWriter1.newLine();
			bufferedWriter1.flush();
		}
//		 * 输入源:键盘
//		 * 输出源:文件
		while ((data = bufferedReader1.readLine()) != null) {
			bufferedWriter2.write(data);
			bufferedWriter2.newLine();
			bufferedWriter2.flush();
		}
//		 * 输入源:文件
//		 * 输出源:控制台
		while ((data = bufferedReader2.readLine()) != null) {
			bufferedWriter1.write(data);
			bufferedWriter1.newLine();
			bufferedWriter1.flush();
		}
//		 * 输入源:文件
//		 * 输出源:文件
		while ((data = bufferedReader2.readLine()) != null) {
			bufferedWriter2.write(data);
			bufferedWriter2.newLine();
			bufferedWriter2.flush();
		}
		
		
		bufferedReader1.close();
		bufferedReader2.close();
		bufferedWriter1.close();
		bufferedWriter2.close();
	}

}
