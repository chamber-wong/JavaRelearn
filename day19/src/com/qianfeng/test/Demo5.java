package com.qianfeng.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 一次读多个字符: read(数组)
 */
public class Demo5 {
	public static void main(String[] args) throws IOException {
		//1.创建对象并关联文件
		FileReader fileReader = new FileReader("temp2.txt");
		
		//2.一次读多个字符: read(数组)
		/*
		 * 数组是临时存放数据的地方,我们会将读到的字符放到临时数组中,数组的大小决定了我们一次可以读到的字符个数.
		 * 一般这个数组的大小<=1kb
		 * 返回值代表本次读到的真实的字符个数,如果返回值是-1代表读完了.
		 */
		char[] arr = new char[2];
		int num = 0;
//		num =  fileReader.read(arr);
//		System.out.println(new String(arr)+"   num:"+num);
//		num =  fileReader.read(arr);
//		System.out.println(new String(arr)+"   num:"+num);
//		num =  fileReader.read(arr);
//		System.out.println(new String(arr,0,num)+"   num:"+num);
//		num =  fileReader.read(arr);
//		System.out.println(new String(arr)+"   num:"+num);//-1  代表读完了
		
		while ((num =  fileReader.read(arr)) != -1) {
			System.out.println(new String(arr,0,num)+"   num:"+num);
		}
		
		//3.关闭流
		fileReader.close();
	}
}
