package com.qianfeng.test;

import java.util.ArrayList;

/*
 * �ڷ�����ʹ�÷���:
 */
public class Demo4 {
	public static void main(String[] args) {
		Teacher<String> teacher = new Teacher();
		//1.�����ϵķ��������ϵķ��ͱ���һ��,���ϵķ���ȷ����,�����ϵľ�ȷ����
		teacher.show("ok");
		//2.������ӵ�������Լ��ķ���
		teacher.play(1);
	}
}

class Teacher<E>{
	//1.�����ϵķ��������ϵķ��ͱ���һ��,���ϵķ���ȷ����,�����ϵľ�ȷ����
	public void show(E e){
		System.out.println(e);
	}
	//2.������ӵ�������Լ��ķ���
	/*
	 * ע��:������ʹ��֮ǰһ��Ҫ�Ƚ�������
	 * �����ķ�ʽ:�ڷ�������ǰ���<��������>
	 * ����:�÷������뷽������һ��
	 */
	public <F> void play(F f){
		ArrayList<F> list = null;
	}
	
	//3.��̬������ʹ�÷���
	/*
	 * ��̬�����޷�ʹ�����ϵķ���,���ϵķ��ͱ���ͨ����������ʹ��.
	 * ��̬��������Ҫ����,���Ծ�̬���������Լ�ʹ�÷���
	 */
	public static<W> void eat(W e){
		
		
	}
}
