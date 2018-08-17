package com.qianfeng.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Demo5 {
	StringBuilder stringBuilder = new StringBuilder();
	public static void main(String[] args) {
		String path = "temp1.txt";
		Demo5 demo5 = new Demo5();
		
		try {
			demo5.reader(path);
			demo5.write("temp2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void reader(String path) throws IOException {
		FileReader fileReader = new FileReader(path);
		int num;
		while ((num = fileReader.read()) != -1) {
			stringBuilder.append((char)num);
		}
		fileReader.close();
	}
	public void write(String path) throws IOException {
		FileWriter fileWriter = new FileWriter(path);
		fileWriter.write(stringBuilder.toString().toCharArray());
		fileWriter.close();
	}
}

