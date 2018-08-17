package com.qianfeng.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * 一次读多个字符
 * 
 * @author 弄风
 *
 */
public class Demo4 {
	public static void main(String[] args) throws IOException {
		// 1.创建对象并关联文件
		FileReader fileReader = new FileReader("temp2.txt");
		
		//2.一次读多个字符:read(数组)
		/*
		 * 数组是临时存放数据数据的地方,我们会将独到的字符放到临时数组中,数组的大小决定了我们一次可以读到的字符个数
		 * 一般大小<=1kb
		 * 返回值代表本次读到的真实的字符个数,如果返回值是-1代表读完了
		 * 
		 */
		char[] arr = new char[9];
		int num = fileReader.read(arr);
		num = fileReader.read();
		System.out.println(Arrays.toString(arr));
		
		//3.关闭流
		fileReader.close();
	}
}
