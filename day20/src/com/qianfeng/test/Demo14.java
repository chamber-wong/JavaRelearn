package com.qianfeng.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Demo14 {
	public static void main(String[] args) throws IOException {
		/*
		 * 打印流:
		 * 字节打印流:PrintStream:除了拥有输出流的特点之外,还有打印的功能.
		 * 字符打印流:PrintWriter:
		 * 
		 * 字节打印流支持的设备:
		 * 1.File类型的文件
		 * 2.字符串类型的文件
		 * 3.字节输出流
		 */
		
//		1.File类型的文件
		PrintStream printStream1 = new PrintStream(new File("G:\\JavaSE\\qianfeng\\day20\\temp1.txt"));
//		2.字符串类型的文件
		PrintStream printStream2 = new PrintStream("temp1.txt");//如果文件不存在则自动创建
//		3.字节输出流
		PrintStream printStream3 = new PrintStream(new FileOutputStream("temp1.txt"));
		
		//讲解print()
		PrintStream printStream4 = new PrintStream(new FileOutputStream("temp6.txt"));
		printStream4.write(97);//a  00000000 00000000 00000000 01100001  在打印的时候,将前面的三个字节去掉了
		printStream4.write(353);//a  00000000 00000000 00000000 01100001  在打印的时候,将前面的三个字节去掉了
		
		printStream4.print(353);//进行了自动转换
		printStream4.write(String.valueOf(353).getBytes());
		
		printStream1.close();
		printStream2.close();
		printStream3.close();
		printStream4.close();
		
	}
}
