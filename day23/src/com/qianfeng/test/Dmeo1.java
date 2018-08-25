package com.qianfeng.test;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Dmeo1 {
	public static void main(String[] args) {
		/*
		 * URL:统一资源定位器 :可以获取当前网址每个部分的内容,还可以通过他实现网络的访问
		 * 
		 * URI:统一资源定位符
		 */
		String string = "http://www.fuckbaudu.com";
		try {
			//获取URL对象
			URL url = new URL(string);
			
			//获取各部分内容
			System.out.println(url.getProtocol());//协议
			System.out.println(url.getHost());//域名/ip
			System.out.println(url.getFile());//获取的是文件的路径和查询的部分,如果二者都没有则返回空,有谁可以显示谁
			System.out.println(url.getPath());//获取的文件路径,没有则返回空
			System.out.println(url.getPort());//获取当前网址的显示端口,如果没有返回-1
			System.out.println(url.getDefaultPort());//获取当晚网址的默认端口
			
			//操作当前的网址,对网址进行访问
			//URLConnection:代表应用程序和URL之间的通信链接.,此类的实例可用于读取和写入URL引用的资源
			String string2 = "https://www.baidu.com";
			URL url2 = new URL(string2);
			//获取当前URLConnection类的一个实例对象,相当于在客户端与服务器建立了一个通道,与服务器建立了连接
			URLConnection connection = url2.openConnection();
			
			//获取内部的输入流
			InputStream inputStream = connection.getInputStream();
			
			//读取数据
			byte[] arr = new byte[1024];
			inputStream.read(arr);
			System.out.println("header:"+connection.getHeaderFields());
			System.out.println(new String(arr));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
