package com.qianfeng.test;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 文件的续写   FileWirter(Stirng file,boolean value)
 * 当value为true时,不会将原来的内容删除掉,接着往下写
 */
public class Demo3 {
	public static void main(String[] args) {
		//1.创建流对象并关联文件--支持续写
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("temp2.txt", true);
			
			//2.写
			fileWriter.write("chenchen");
			
			//3.刷新
			fileWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//4.关闭
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
