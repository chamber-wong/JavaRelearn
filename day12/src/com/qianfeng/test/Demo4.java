package com.qianfeng.test;

import java.util.Random;

/*
 * Math:��ѧ������
 */
public class Demo4 {
	public static void main(String[] args) {
		System.out.println(Math.abs(-44));//�����ֵ
		System.out.println(Math.floor(3.4));//����ȡ��
		System.out.println(Math.ceil(3.4));//����ȡ��
		System.out.println(Math.random());//ȥ�����    Ĭ�ϵ�ȡֵ��Χ��[0,1)
		
		//ʵ��:ȡ[0,10)֮�������
		System.out.println((int)Math.floor(Math.random()*10));
		
		//Random��
		//ʵ��:ȡ[0,100)֮�������
		Random random = new Random();
		System.out.println(Math.abs(random.nextInt())%100);
		
		System.out.println(random.nextInt(100));
	}
}
