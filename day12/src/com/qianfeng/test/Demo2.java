package com.qianfeng.test;

import java.util.Date;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * Date:������
		 * Data:������:��ʾ�Ķ��Ƕ����Ƶ�����
		 */
		//��ǰ��ʱ��
		Date date = new Date();
		System.out.println(date);
		
		//long�͵�����
		long time = System.currentTimeMillis();//��ȡ�ĵ�ǰ��ʱ��,��λ�Ǻ���
		System.out.println(time);
		
		//ʵ��ʱ���ת��
		//long�͵�ת��date��
		Date date2 = new Date(time);
		System.out.println(date2);
		
		//��date�͵�long��
		System.out.println(date2.getTime());
	}
}
