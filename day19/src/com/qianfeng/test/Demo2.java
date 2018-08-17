package com.qianfeng.test;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件的续写 FileWirter(String file ,boolean value) 当value为true时,不会讲原来的内容删掉,接着往下写
 * 
 * @author 弄风
 *
 */
public class Demo2 {
	public static void main(String[] args) {

		FileWriter fileWriter = null;
		// 创建刘对象并关联文件--支持续写
		try {
			fileWriter = new FileWriter("temp2.txt", true);

			// 2.写
			fileWriter.write("bingbing");

			// 3.刷新
			fileWriter.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fileWriter != null) {
				// 4.关闭
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
