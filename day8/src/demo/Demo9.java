package com.qianfeng.test;
/*
 * instanceof:
 */
public class Demo9 {
	
	public static void main(String[] args) {
		Dog3 dog3 = new Dog3();
		Cat3 cat3 = new Cat3();
		feedAnimal1(cat3);
	}
	
	public static void  feedAnimal(Animal3 animal) {//animal3 = dog3 = new Dog3()   ��̬
		//�ݴ���---�����û�����
		if (!(animal instanceof Dog3)) {//ȷ��ǰ��Ķ����Ƿ��Ǻ������Ķ���,�Ƿ���true,���Ƿ���false
			System.out.println("��ǰ�Ķ�����Dog3���͵�");
			return;
		}
		//���ù������еķ���
		Dog3 dog3 = (Dog3)animal;
		dog3.bark();
	}
	
	//����instanceof
	//����:ȷ��ǰ��Ķ����Ƿ��Ǻ�����������Ķ���,�Ƿ���true,���Ƿ���false
	//ע��:ǰ��:ǰ��ͺ�������м̳еĹ�ϵ,���û�л����̱���.
	public static void  feedAnimal1(Animal3 animal) {//animal3 = dog3 = new Dog3()   ��̬
		//�ݴ���---�����û�����
		if (!(animal instanceof Animal3)) {//ȷ��ǰ��Ķ����Ƿ��Ǻ������Ķ���,�Ƿ���true,���Ƿ���false
			System.out.println("��ǰ�Ķ�����Dog3���͵�");
			return;
		}
		
		System.out.println("����");
		//ǰ���Ǻ���ĸ���Ķ���
		if (new Animal3() instanceof Dog3) {//false
			
			return;
		}
		//ǰ��û�й�ϵ
//		if (new Animal3() instanceof Test) {//����
//			
//			return;
//		}
	}
}

class Test{
	
}

class Animal3{
	String name;
	public Animal3(String name) {
		super();
		this.name = name;
	}
	public Animal3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void eat(){
		System.out.println("Animal-eat");
	}
}

class Dog3 extends Animal3{
	public void  eat() {
		System.out.println("Dog-eat");
	}
	
	public void bark(){
		System.out.println("Dog-��");
	}
}

class Cat3 extends Animal3{
	public void eat(){
		System.out.println("Cat-eat");
	}
}

class Tiger3 extends Animal3{
	public void eat(){
		System.out.println("Tiger-eat");
	}
}

