package com.qianfeng.test;
/*
 * ��̬:һ������Ķ�����̬.      ��==����==����            ĵ��==��==ֲ��==����
 * 
 * ��̬��ǰ��:������֮������м̳еĹ�ϵ
 */
public class Demo6 {
	public static void main(String[] args) {
		//ʹ�ü̳�
		Dog dog = new Dog();
		dog.name = "��������";//���ø��������
		dog.play();//���ø���ķ���
		dog.show();//��������ķ���
		
		
		//ʹ�ö�̬
		//�ø��������ָ������Ķ���---�����java�ж�̬�ڴ����е�����
		//ע��:������˵�ĸ��������ֱ�ӵĸ���Ҳ�����Ǽ�ӵĸ���
		Animal animal = new Dog();
		/*
		 * �������зֳ������׶�:Ԥ����,����,����
		 * Ԥ����:����򿪵�ʱ��,����Ѿ�������.(Ԥ�������� #define)
		 * ����:�Ӵ򿪳���ʼ��������Ͻǵ�����֮ǰ---ֻ��ʶ��=ǰ�����������,����ʶ=����Ķ���
		 * ����:�ӵ�����ǿ�ʼ---������ʶ�����,����ʼ�ɻ��
		 * 
		 * �˽������:
		 * ʵ�ֶ�̬���ֶ�:��̬����,��̬��,��̬����
		 * ��̬����:�����ڱ���׶β���ȷ������Ķ�������,ֻ�е������н׶β���ȷ�������ĸɻ���Ķ���.
		 */
		animal.play();
		//animal.show();//��������:1.����ͨ��animal����ĵ�ַ�ҵ�Dog����   2.Dog������ȥ����show����.
		//����ͨ����ԭ��:�ڱ����ʱ��ʶ�������������,��ʶ�����.����ֻ��ʶ���Animal����ķ���,������ֱ��
		//�����������еķ���.
		
		/*
		 * �ܽ�:�ŵ�:������ߴ������չ��,ʹ��֮ǰ����õĹ���,����ֱ������ʹ��,�����ٴ����µķ���.ʵ����Demo7
		 * ȱ��:ֻ��ֱ�ӵ��ø����еķ���,����ֱ�ӵ����������еķ���.
		 */
	}
}

class Animal{
	String name;
	public Animal(String name) {
		super();
		this.name = name;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void play(){
		System.out.println("Animal-play");
	}
}

class Dog extends Animal{
	public void  show() {
		System.out.println("Dog-show");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("Cat-eat");
	}
}
