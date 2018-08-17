package com.qianfeng.test;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 实例:研究字符流
 * 以磁盘的数据存储为例,将数据写入文件
 * 分析:操作的是文件,所以使用字符流
 * 	是将数据从内存放入磁盘,所以是字符写出流
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		//1.创建FileWriter类的对象,并关联文件
		/*
		 * 注意点:1.关联文件的特点:如果之前不存在,程序会自动创建一个,如果存在,会将之前的文件的内容覆盖掉
		 * 2.如果只写名字没有写路径,默认的路径就是当前的工程
		 * 3.
		 */
		FileWriter fileWriter = new FileWriter("temp1.txt");
		
		//2.调用写入方法
		//在执行write方法时,数据被临时放到了流对象的内部数组中,这个数组是一个字节数组,会默认去查编码表
		fileWriter.write("yanzi");
		fileWriter.write("yanzi1");
		
		//3.刷新-将临时数组的内容写入磁盘
//		fileWriter.flush();
		
		//4.关闭流--两个功能:1.关闭流2.刷新
		//流使用完毕后一定要关闭
		fileWriter.close();
		
		//当流关闭以后不能再进行操作否则会报错
	}
}
