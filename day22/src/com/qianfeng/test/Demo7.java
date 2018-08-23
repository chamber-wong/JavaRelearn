package com.qianfeng.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.channels.SocketChannel;

/*
 * TCP:
 * 客户端
 * 在客户端与服务器端通信的时候,对于客户端既要进行输入又要进行输出,所以在Socket对象的内部就内置了输入流和输出流,
 * 当进行数据传输的时候,将数据放入socke对象的内部,将socket对象传到服务器端,相当于在客户端与服务器端建立了一个通道,
 * 两端使用同一个socket对象.
 */
public class Demo7 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		//1.创建Socket对象并绑定服务器的地址和端口
		Socket socket = new Socket(InetAddress.getLocalHost(), 22000);
		
		//2.准备数据
		String data = "BigData1712,你好";
		
		//3.获取socket内部的输出流
		OutputStream outputStream = socket.getOutputStream();
		
		//4.将数据写入网络
		outputStream.write(data.getBytes());
		
		//接收从服务器传回的数据
        InputStream inputStream = socket.getInputStream();
		
		//将内容写到控制台
		byte[] arr = new byte[1023];
		int num = inputStream.read(arr);
		System.out.println(new String(arr,0,num));
		
		//5.关闭资源
		socket.close();
	}
}
