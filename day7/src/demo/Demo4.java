package com.qianfeng.test;
/*
 * �ڼ̳���ʹ�ù��췽��
 * 
  * * 
 * 1.��һ��������ֻ��һ���������Ĺ��췽��,ֻ��ʹ�ô�������,����ʹ���޲ε�.�����ʹ��,�����ֶ������޲εĹ��췽��
 * 2.��������ֻ�д������Ĺ��췽��,����Ĺ��췽���оͱ����ڵ�һ���ֶ����ø���������Ĺ��췽��(super(����))
 * 3.�����Ǵ������췽����ʱ��,����Լ���дsuper(),ϵͳ���Զ�����
 * ԭ��:������Ҳ������Ҫ���г�ʼ��,����������Ա������Լ��Ĺ��췽�����г�ʼ��,���Ա������super(),����ÿ�����췽���ж�Ĭ����һ��super()
 * 
 * ΪʲôҪ��super���ڷ����ĵ�һ��?
 * ��:������Ĺ��췽�����п����õ����������,��������ʹ��֮ǰ�����Ƚ��г�ʼ��,�����޷�ʹ��.
 * 
 * ��֮:�ڼ̳���ϵ��,��Ϊ������õİ취���ǽ��޲ι��췽�����вι��췽����д��.
 */
public class Demo4 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.play();
		dog.setName("��������");
	}
}

class Animal{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal{
	public Dog() {
		//super();//Ĭ�ϵ��õĸ�����޲εĹ��췽��
		super("��ë");//�ֶ����ø����вεĹ��췽��
	}
	
	public Dog(String name){
		super(name);//������ڵ�һ��
		
		//�������д�Լ��Ĵ���,Ҫ�õ����������,���Ա����ȳ�ʼ����ʹ��.
	}
	
	public void play(){
		System.out.println("play");
	}
}