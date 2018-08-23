package com.qianfeng.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 服务器端
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("服务器正在等待接收数据....");
		Socket socket = serverSocket.accept();

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		
		String data = null;
		while((data = bufferedReader.readLine()) != null) {
			
			if (data.trim().equals("over")) {
				break;
			}
			
			System.out.println("服务器接收到数据并且将其转:"+data.toUpperCase());
			
			bufferedWriter.write(data.toUpperCase());
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
		
		
		socket.close();
		serverSocket.close();
		bufferedReader.close();
		bufferedWriter.close();
	}
}
