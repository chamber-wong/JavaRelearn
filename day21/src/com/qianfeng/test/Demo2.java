package com.qianfeng.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		/*
		 * Properties:实质上是一个Map集合,存储的是属性,属性以键值对的形式存在.键值对内部的键值必须是字符串,不需要泛型
		 * 
		 * 为什么要在这里将Properties?
		 * 因为使用与流结合
		 * 
		 * 优点:
		 * 1.以键值对的形式存储数据
		 * 2.内部针对属性的存储封装了大量的专有方法:load,store,list
		 */
		
		//fun1();
		//fun2();
		fun3();
		
	}
	//1.Properties的基础
	public static void fun1() {
		//创建Properties对象
		Properties properties = new Properties();
		
		//存储
		properties.setProperty("01", "java");
		properties.setProperty("02", "html");
		
		//取值
		System.out.println(properties.getProperty("01"));
		
		//里面放的是所有的key
		Set<String> set = properties.stringPropertyNames();
		//遍历
		//第一种方式
		for (String string : set) {
			System.out.println("增强for循环:"+string+"   value:"+properties.getProperty(string));
		}
		
		//第二种方式:迭代器
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println("迭代器:"+string+"   value:"+properties.getProperty(string));
		}
		
		//注意点:一:当key不存在的时候,value返回的是后面的默认值
		String value = properties.getProperty("05", "iOS");
		System.out.println("value:"+value);
		
		//注意点二:跟Map一样,key是唯一的,同一个key后面的值会覆盖前面的值.
		properties.setProperty("01", "python");
		System.out.println(properties.getProperty("01"));
	}
	//2.获取系统的属性集合
	public static void fun2() {
		Properties properties = System.getProperties();
		
		//遍历属性集合
		Set<String> set = properties.stringPropertyNames();
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = (String) iterator.next();
			System.out.println("key:"+key+"   value:"+properties.getProperty(key));
		}
		
		//改变内部的值
		properties.setProperty("file.encoding", "GBK");
		System.out.println(properties.getProperty("file.encoding"));//GBK
		
		//在获取一遍
		Properties properties1 = System.getProperties();
		//原理:会先到内存中找属性集合的对象,如果有,直接使用.如果没有,会重新初始化一个新的对象,并获取属性集合.
		System.out.println(properties1.getProperty("file.encoding"));//GBK
		
		//直接将内容打印到控制台
		properties.list(System.out);
	}
	//3.模拟系统的属性集合操作
	public static void fun3() throws IOException {
		//创建属性集合对象
		Properties properties = new Properties();
		
		//创建输入流--temp1.txt模拟的系统的属性集合文件
		FileReader fileReader = new FileReader("temp1.txt");
		
		//将输入流的内容存储到属性集合文件中--通过load方法实现
		properties.load(fileReader);
		
		//实现打印到控制台
		properties.list(System.out);
		
		//更改内容
		properties.setProperty("01", "buxiakele");
		
		//将内容写回磁盘,创建写出流
		FileWriter fileWriter = new FileWriter("temp1.txt");
		
		//开始写回--第二个参数是注释说明
		properties.store(fileWriter, "dajiael");
		
		//关闭流
		fileReader.close();
		fileWriter.close();
	}
}








