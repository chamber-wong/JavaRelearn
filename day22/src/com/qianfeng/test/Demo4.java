package com.qianfeng.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		//服务器端:接收数据
		/*
		 * 1.创建socket对象,并绑定端口号
		 * 2.创建包对象,创建空数组,准备接收传来的数据
		 * 3.接收数据
		 * 4.关闭相关的对象
		 */
		
		 //* 1.创建socket对象,并绑定端口号
		DatagramSocket datagramSocket = new DatagramSocket(20000);
		 //* 2.创建包对象,创建空数组,准备接收传来的数据
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		 //* 3.接收数据--当服务器运行起来,这个方法会一直处于监听状态
		datagramSocket.receive(datagramPacket);
		
		//将数据从包中取出
		byte[] data = datagramPacket.getData();
		System.out.println(new String(data));//打印接收的数据
		 //* 4.关闭相关的对象
		datagramSocket.close();
	}
}
