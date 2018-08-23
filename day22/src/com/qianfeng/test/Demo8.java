package com.qianfeng.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务器端:

 */
public class Demo8 {
	public static void main(String[] args) throws IOException {
		//1.创建ServerSocket对象并绑定接口
		ServerSocket serverSocket  = new ServerSocket(22000);
		
		//2.接收套接字的连接,保证客户端与服务器端使用同一个socket对象---一直处于监听的状态
		Socket socket =  serverSocket.accept();
		
		//3.获取输入流
		InputStream inputStream = socket.getInputStream();
		
		//4.将内容写到控制台
		byte[] arr = new byte[1023];
		int num = inputStream.read(arr);
		System.out.println(new String(arr,0,num));
		
		//实现将服务器的数据写回客户端
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("你好,BigData1712".getBytes());
		
		//5.关闭资源
		serverSocket.close();
	}
}
