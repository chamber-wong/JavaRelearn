package com.qianfeng.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Date;
import java.util.prefs.BackingStoreException;

/*
 * 转换流:从字节流到字符流
 * 场景:要让字符缓冲流的readLine(),newLine()服务于字节流
 * 
 * InputStreamReader:输入转换流
 * OutputStreamWriter:输出转换流
 */
public class Demo6 {
	public static void main(String[] args) throws IOException {
		//实现功能:实现从键盘接收数据,在将数据显示在控制台,要求使用readLine(),newLine()
		/*
		 * 分析:是从键盘直接接收数据----System.in
		 * 		是将数据显示在控制台----System.out
		 * 
		 * 所以要先将字节流换成转换流,再通过转换流得到字符缓冲流
		 */
		//获取字符缓冲流,
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
		
		InputStreamReader inputStreamReader = new InputStreamReader(System.in,"");
		
		//读写
		String data = null;
		while ((data = bufferedReader.readLine()) != null) {
			bufferedWriter.write(data);
			bufferedWriter.newLine();
			
			bufferedWriter.flush();
			
			if (data.equals("over")) {
				break;
			}
		}
		
		bufferedWriter.close();
		bufferedReader.close();
	}
}
