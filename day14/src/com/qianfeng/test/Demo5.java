package com.qianfeng.test;
/*
 * �ӿ���ʹ�÷���:
 */
public class Demo5 {
	public static void main(String[] args) {
		//���Ե�һ�ַ�ʽ
		Pig pig = new Pig();
		pig.play("ok");
		
		//���Եڶ���
		Dog<String> dog = new Dog();
	}
}

//�ӿ���ʹ�÷���
interface Inter<E>{
	public void play(E e);
}

/*
 * ����ʹ�÷��͵����
 * ��һ�ַ�ʽ:�ӿ��з���,����û�����ض�Ӧ�ķ���
 * ������ӿ�ָ��һ������ķ�������
 * 
 * ��Ӧ�ķ�����ʹ�÷������������
 * 1.��д�Ľӿڵķ���:Ҫ��ӿ�һ��,ָ������ķ���
 * 2.�Զ���ķ���:�������ؽӿڵķ���,Ҳ����ʹ���Լ���
 */

class Pig implements Inter<String>{
	//��д�ӿڵķ���
	public void play(String e) {
		// TODO Auto-generated method stub
		
	}
	
	//�Զ���ķ����������ؽӿڵķ���,Ҳ����ʹ���Լ���
	public<F> void show(F f){
		
	}
}

/*
 * �ڶ��ַ�ʽ:�ӿ��з���,���������˶�Ӧ�ķ���
 * ���ϵķ���ȷ����,�ӿ��ϵķ��;�ȷ����,��д�ķ����ϵķ���Ҳ��ȷ����
 */

class Dog<E> implements Inter<E>{
	public void play(E e) {
		// TODO Auto-generated method stub
		
	}
}


