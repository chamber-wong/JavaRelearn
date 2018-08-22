package com.qianfeng.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class Demo3{
	/*
	 * ������:�Ѷ��������������һ���ԵĴ�ӡ(����)---�ֽ���
	 */
	public static void main(String[] args) throws IOException {
		//��������������
		FileInputStream fileInputStream1 = new FileInputStream("src\\com\\qianfeng\\test\\Demo2.java");
		FileInputStream fileInputStream2 = new FileInputStream("src\\com\\qianfeng\\test\\Demo2.java");
		FileInputStream fileInputStream3 = new FileInputStream("src\\com\\qianfeng\\test\\Demo1.java");
		
		//����������������������
		//��ʽһ:�ȷ���һ��Vector
//		Vector<FileInputStream> vector = new Vector<>();
//		vector.add(fileInputStream1);
//		vector.add(fileInputStream2);
//		vector.add(fileInputStream3);
//		
//		//�õ�ö����
//		Enumeration<FileInputStream> e1 = vector.elements();
		
		//��ʽ��:�ȷ���һ��list
		ArrayList<FileInputStream> list = new ArrayList<>();
		list.add(fileInputStream1);
		list.add(fileInputStream2);
		list.add(fileInputStream3);
		
		//������ת����ö��
		Enumeration<FileInputStream> e2 = Collections.enumeration(list);
		
		//�������������󲢹�����ص��ļ�--������һ��ö����
		//SequenceInputStream sequenceInputStream = new SequenceInputStream(e1);
		SequenceInputStream sequenceInputStream = new SequenceInputStream(e2);
		
		//���������
		FileOutputStream fileOutputStream = new FileOutputStream("temp2.txt");
		
		//��д
		byte[] arr = new byte[1024];
		int num;
		while ((num = sequenceInputStream.read(arr)) != -1) {
			fileOutputStream.write(arr, 0, num);
			
			fileOutputStream.flush();
		}
		
		sequenceInputStream.close();
		fileOutputStream.close();
		
		
	}
}
