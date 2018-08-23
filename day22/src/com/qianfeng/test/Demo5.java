package com.qianfeng.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/*
 * 随时发随时收--使用UDP完成
 * 
 * 客户端
 */
public class Demo5 {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket();
		
		//获取字符缓冲流实现从键盘接收数据
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String data = null;
		while ((data = bufferedReader.readLine()) != null) {
			DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length, InetAddress.getLocalHost(), 20020);
			
			//发送
			datagramSocket.send(packet);
			
			if (data.equals("over")) {
				break;
			}
		}
		
		datagramSocket.close();
	}
}
