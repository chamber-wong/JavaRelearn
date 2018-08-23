package wang.chamber.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;



public class Client {
	String name;            
	InetAddress inetAddress;
	int port;               
	
	public static void main(String[] args) throws IOException {
		Thread thread = new Thread(new Monitor());
		thread.start();
		Client client = new Client();
		client.init();

		DatagramSocket datagramSocket = new DatagramSocket();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		String data = null;
		while ((data = bufferedReader.readLine()) != null) {
			data += ","+client.name+","+InetAddress.getLocalHost().getHostAddress()+","+8888;
			
			DatagramPacket datagramPacket = new DatagramPacket(data.getBytes(), data.getBytes().length, client.inetAddress, client.port);
			
			datagramSocket.send(datagramPacket);
		}

		datagramSocket.close();
	}
	
	public void init() throws UnknownHostException {
		System.out.println("******欢迎进入多人聊天室******");
		System.out.println("请注册----->>:");
		System.out.println("请输入姓名:");
		Scanner scanner = new Scanner(System.in);
//		socketInfo.setName(scanner.nextLine().trim());
		name = scanner.nextLine().trim();
		System.out.println("请输入服务器地址:");
//		socketInfo.setInetAddress(InetAddress.getByName(scanner.nextLine().trim()));
		inetAddress = InetAddress.getByName(scanner.nextLine().trim());
		System.out.println("请输入服务器端口号:");
//		socketInfo.setPort(scanner.nextInt());
		port = scanner.nextInt();
		System.out.println("欢迎"+name+"加入聊天室!!");
	}
	
}
class Monitor implements Runnable{

	public void run() {
		 //* 1.创建socket对象,并绑定端口号
		DatagramSocket datagramSocket;
		try {
			datagramSocket = new DatagramSocket(8888);
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
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
