package com.qianfeng.test;

import java.util.Enumeration;
import java.util.Vector;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * Vector:�˽�
		 * ������ʱ��ʹ�õ���ö����
		 */
		Vector vector = new Vector<>();
		vector.add("java1");
		vector.add("java2");
		vector.add("java3");
		vector.add("java4");
		
		//����--ö����
		//��ȡö����
		Enumeration enumeration = vector.elements();
		//����
		while (enumeration.hasMoreElements()) {
			Object object = (Object) enumeration.nextElement();
			System.out.println(object);
		}
		
	}
}
