package com.qianfeng.fansheDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo {
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		/*
		 * 运行笔记本 使用鼠标 使用键盘
		 * 
		 * 总结:通过反射可以在不改变功能类(Demo)的前提下,实现新增功能的添加,我们只需要创建对应的工具类,(UPan,Mouse)
		 * 再通过一个配置文件简单的配置即可
		 * 
		 */
//		// 创建鼠标
//		Mouse mouse = new Mouse();
//		// 创建键盘
//		KeyBoard keyBoard = new KeyBoard();
//		// 创建笔记本
//		NoteBook noteBook = new NoteBook();
//
//		noteBook.useUSB(mouse);
//		noteBook.useUSB(keyBoard);

		//利用反射实现在不改变当前类的代码的前提下,实现新增功能的添加
		//读取config.properties的内容
		Properties properties = new Properties();
		
		//创建字符输入流
		FileInputStream fileInputStream = new FileInputStream("src/com/qianfeng/fansheDemo/cofig.properties");
		
		//将数据加载到properties对象内部
		properties.load(fileInputStream);
		
		//properties.size():获取的是键值对的个数
		for (int i = 0; i < properties.size(); i++) {
			String key = "usb"+i;
			String value = properties.getProperty(key);
			
			//获取字节码问价对象
			Class<?> class1 = Class.forName(value);
			
			//创建实力对象
			USB usb =(USB) class1.newInstance();
			usb.open();
			usb.close();
		}
		
	}
}
