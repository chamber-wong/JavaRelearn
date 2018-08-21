package com.qianfeng.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 字节流
 * @author 弄风
 *
 */
public class Demo2 {

	public static void main(String[] args) throws IOException {
//		fileWrite();
		fileWrite3();
	}

	/**
	 * 实现写
	 * 
	 * @throws IOException
	 */
	public static void fileWrite() throws IOException {
		// 1.创建输出流对象并关联文件
		FileOutputStream fileOutputStream = new FileOutputStream("temp1.txt");
		// 2. 写---因为使用的是字节流,所以不能直接传输字符,要进行编码
		fileOutputStream.write("孙燕姿".getBytes());// 对应的默认字符集为utf8
	}

	/**
	 * 实现读1:一个字节一个字节的读
	 * 
	 * @throws IOException
	 */
	public static void fileWrite1() throws IOException {
		// 1. 创建输入流对象
		FileInputStream fileInputStream = new FileInputStream("temp1.txt");
		// 2. 读
		int num;
		while ((num = fileInputStream.read()) != -1) {
			System.out.print((char) num);
		}
		// 3. 关流
		fileInputStream.close();
	}

	/**
	 * 实现读2:一次读取多个字节
	 * 
	 * @throws IOException
	 */
	public static void fileWrite2() throws IOException {
		// 1. 创建输入流对象
		FileInputStream fileInputStream = new FileInputStream("temp1.txt");
		// 2. 读
		byte[] arr = new byte[3];
		int num;
		while ((num = fileInputStream.read(arr)) != -1) {
			System.out.print(new String(arr, 0, num));
		}
		// 3. 关流
		fileInputStream.close();
	}

	/**
	 * 实现读3:一次读取全部字节
	 * 
	 * @throws IOException
	 */
	public static void fileWrite3() throws IOException {
		// 1. 创建输入流对象
		FileInputStream fileInputStream = new FileInputStream("temp1.txt");
		// 2. 获取所有的字节数
		// 注意:如果文本的字节数太大不建议使用
		int length = fileInputStream.available();
		// 3. 读
		byte[] arr = new byte[length];
		fileInputStream.read(arr);
		System.out.println(new String(arr));
		// 4. 关流
		fileInputStream.close();
	}
}
