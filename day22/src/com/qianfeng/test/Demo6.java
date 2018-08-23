package com.qianfeng.test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/*
 * 服务器端
 */
public class Demo6 {
	public static void main(String[] args) throws IOException {
		DatagramSocket datagramSocket = new  DatagramSocket(20020);
		
		//不断接数据的过程
		while (true) {
			byte[] buf = new byte[100];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			
			datagramSocket.receive(packet);
			
			//进行数据的打印
			String data = new String(packet.getData()).trim();
			System.out.println(data);
			
			//手动结束的方法:当客户端输入over的时候结束
			if (data.equals("over")) {
				break;
			}
		}
		
		datagramSocket.close();
		
	}
}
