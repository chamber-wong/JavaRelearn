package com.qianfeng.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * 客户端
 */
public class Test1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(), 8888);

		// 准备数据
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

		BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(socket.getInputStream()));

		System.out.println("请输入:");
		String data = null;
		while ((data = bufferedReader.readLine()) != null) {
			bufferedWriter.write(data);
			bufferedWriter.newLine();
			bufferedWriter.flush();

			if (data.trim().equals("over")) {
				break;
			}

			String string = bufferedReader2.readLine();
			System.out.println("转换后的字符串为:" + string);
			System.out.println("请输入:");
		}

		bufferedReader.close();
		bufferedReader2.close();
		bufferedWriter.close();
		socket.close();
	}
}
