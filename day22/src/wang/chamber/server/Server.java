package wang.chamber.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Arrays;

public class Server {
	public static void main(String[] args) throws IOException {
		 //* 1.创建socket对象,并绑定端口号
		DatagramSocket datagramSocket = new DatagramSocket(20000);
		 //* 2.创建包对象,创建空数组,准备接收传来的数据
		byte[] buf = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
		 //* 3.接收数据--当服务器运行起来,这个方法会一直处于监听状态
		datagramSocket.receive(datagramPacket);

		//将数据从包中取出
		byte[] data = datagramPacket.getData();
		
		String info = new String(data);
		String[] strings = info.split(",");
		
		System.out.println(Arrays.toString(strings));
		String massage = strings[0];
		String name = strings[1];
		String address = strings[2];
		int port = Integer.parseInt(strings[3].trim());
		
		String data1 = name + " 说:" + massage;
		System.out.println(data1);
		DatagramPacket datagramPacket2 = new DatagramPacket(data1.getBytes(),data1.getBytes().length,InetAddress.getByName(address),port);
		datagramSocket.send(datagramPacket2);
		
		 //* 4.关闭相关的对象
		datagramSocket.close();
	}
}
