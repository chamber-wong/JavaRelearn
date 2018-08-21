package com.qianfeng.test;

import java.io.File;

public class Demo10 {
	public static void main(String[] args) {
		 //获取根目录----获取的是当前主机的根目录
		File[] files = File.listRoots();
		for (File file : files) {
			System.out.println(file);
		}
		
		//获取指定目录下的文件(文件夹)	,不包括子目录,特点:这里只得到了文件夹或文件的名字,没有全路径
		File file = new File("G:\\JavaSE\\qianfeng\\day20");
		String[] string = file.list();
		for (String string2 : string) {
			System.out.println("String:"+string2);
		}
		
		//获取当前目录下的文件或文件夹的全路径
		File[] files2 = file.listFiles();
		for (File file2 : files2) {
			System.out.println("全路径:"+file2);
		}
 	}
}
