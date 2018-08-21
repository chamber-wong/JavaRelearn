package com.qianfeng.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 使用字节流读取图片
 * 
 * @author 弄风
 *
 */
public class Demo3 {
	public static void main(String[] args) throws IOException {
		// 1. 创建输入流对象
		FileInputStream fileInputStream = new FileInputStream("icon_wechat.png");
		FileOutputStream fileOutputStream = new FileOutputStream("icon_wechat(copy).png");
		// 2. 读
		int num;
		while ((num = fileInputStream.read()) != -1) {
//			System.out.print((char) num);
			fileOutputStream.write(num);// 对应的默认字符集为utf8
		}
		// 3. 关流
		fileInputStream.close();
		fileOutputStream.close();
	}

}
