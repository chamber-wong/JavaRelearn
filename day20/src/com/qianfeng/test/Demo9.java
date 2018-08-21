package com.qianfeng.test;

import java.awt.event.MouseWheelEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 文件:File类,用来操作文件和路径(目录)
 * 
 * 创建文件
 * 创建路径
 * 创建多路径
 * 
 * 判断是否是文件
 * 判断是否是路径
 * 判断是否是隐藏
 * 
 * 获取根目录
 * 获取指定目录下的文件(文件夹)
 */
public class Demo9 {
	public static void main(String[] args) throws IOException {
		//1.创建File对象
		//a.通过完整的路径实现
		File file1 = new File("G:\\JavaSE\\qianfeng\\day20\\src\\com\\qianfeng\\test\\Demo8.java");
		//b.通过父目录子目录
		File file2 = new File("G:","JavaSE\\qianfeng\\day20\\src\\com\\qianfeng\\test\\Demo8.java");
		//c.先得到父目录的file对象,再去拼接整个的目录
		File file3 = new File("G:\\JavaSE\\qianfeng\\day20");
		File file4 = new File(file3, "src\\com\\qianfeng\\test\\Demo8.java");
	
		//2.创建文件
		File file5 = new File("G:\\JavaSE\\qianfeng\\day20\\temp5.txt");
		file5.createNewFile();
		
		//3.创建路径:通过mkdir()或mkdirs()只能创建路径,不能创建文件
		File file6 = new File("G:\\JavaSE\\qianfeng\\day20\\temp6\\t\\o\\k");
		//只能创建单层目录
//		file6.mkdir();
		//创建多层目录
		file6.mkdirs();
		
		//4.判断是否是文件
		System.out.println(file3.isFile());//false
		System.out.println(file5.isFile());//true
		
		//5. 判断是否是路径
		System.out.println(file3.isDirectory());//true
		System.out.println(file5.isDirectory());//false
		
		//6. 是否隐藏
		System.out.println(file1.isHidden());//false
		
		//7.获取文件的最后修改时间
		long date = file5.lastModified();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = simpleDateFormat.format(new Date(date));
		System.out.println(time);
	}
}
