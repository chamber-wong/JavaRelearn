package com.qianfeng.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * D:\workspace\BigData1712N20\src\com\qianfeng\test\Demo1.java:绝对路径
 * BigData1712N20\src\com\qianfeng\test\Demo1.java:相对路径
 * 
 * 相对路径:从路径中间的某个部位开始一直到当前的文件
 * 绝对路径:一个文件的完整路径,从根目录开始到当前的文件
 * 
 * 补充知识:
 * \代表转义字符      \t:制表符     \n换行符    \\:表示普通的\
 * 在代表路径的时候,\\与/是一个意思.
 */

public class Demo6 {
	public static void main(String[] args) throws IOException {
		/*
		 * 实例:完成文件的复制
		 */
		//1.创建对象并关联文件
		FileReader fileReader = new FileReader("D:\\workspace/BigData1712N20\\src\\com\\qianfeng\\test/Demo1.java");
		FileWriter fileWriter = new FileWriter("temp3.txt");
		
		//读写
		int num;
		while ((num = fileReader.read()) != -1) {
			fileWriter.write(num);//会自动转成字符
		}
		
		fileReader.close();
		fileWriter.close();
	}
}
