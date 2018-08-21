package wang.chambert.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HomeWork3 {
	public static void main(String[] args) throws IOException {
		// 创建字符写出流
		// 使用字符缓冲流实现写出
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("temp10.txt",true));
		// 1.创建字符读入流
		// 2.创建字符缓冲读入流
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/qianfeng/test/Demo8.java"));
		BufferedReader bufferedReader1 = new BufferedReader(new FileReader("src/com/qianfeng/test/Demo7.java"));
		BufferedReader bufferedReader2 = new BufferedReader(new FileReader("src/com/qianfeng/test/Demo6.java"));

		// 读写
		String data = null;
		while ((data = bufferedReader.readLine()) != null ) {
			bufferedWriter.write(data);
			bufferedWriter.newLine();
		}
		while ((data = bufferedReader1.readLine()) != null ) {
			bufferedWriter.write(data);
			bufferedWriter.newLine();
		}
		while ((data = bufferedReader2.readLine()) != null ) {
			bufferedWriter.write(data);
			bufferedWriter.newLine();
		}
		// 关闭流
		bufferedReader.close();
		bufferedReader1.close();
		bufferedReader2.close();
		bufferedWriter.close();
	}
}
