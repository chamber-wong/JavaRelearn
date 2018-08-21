package com.qianfeng.test;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/*
 * LineNumberReader:是BufferedReader的子类,不能读.但是可以提高效率,特有功能:设置行号,获取行号
 */
public class Demo10 {
	public static void main(String[] args) throws IOException {
		//1.创建缓冲流
		LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("temp5.txt"));
		
		//设置行号:默认从0开始设置,从1开始计数
		lineNumberReader.setLineNumber(10);
		
		String data = null;
		while ((data = lineNumberReader.readLine()) != null) {
			System.out.print(lineNumberReader.getLineNumber());//获取行号
			System.out.print(data);
			System.out.println();
		}
		
		//关闭流
		lineNumberReader.close();
	}
}
