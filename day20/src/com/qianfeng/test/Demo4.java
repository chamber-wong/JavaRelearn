package com.qianfeng.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		// 1. 创建输入流对象
		FileInputStream fileInputStream = new FileInputStream("icon_wechat.png");
		FileOutputStream fileOutputStream = new FileOutputStream("icon_wechat(copy).png");
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
		// 2. 读
		int num;
		while ((num = bufferedInputStream.read()) != -1) {
			bufferedOutputStream.write(num);// 对应的默认字符集为utf8
		}
		// 3. 关流
		fileInputStream.close();
		fileOutputStream.close();
		bufferedOutputStream.close();
		bufferedInputStream.close();
	}
}
