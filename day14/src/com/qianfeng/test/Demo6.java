package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Collection;

/*
 * �˽�:
 * 
 * ?:ͨ���,���Ա�ʾһ�ֻ�����������
 * ��������:<? extends E>:���Ƶ���������<>����ȡ�ķ������͵�������E,<>�п���ȡ��������E��E������
 * ��������:<? super E>::���Ƶ���������<>����ȡ�ķ������͵�������E,<>�п���ȡ��������E��E�ĸ���
 * 
 * 
 * ��������������:<? extends E>
 */
public class Demo6 {
	public static void main(String[] args) {
		//
		ArrayList<Student2> list1 = new ArrayList<>();
		list1.add(new Student2("bingbing", 1));
		//���Դ���:��ΪStudent2��Person1������,����ʵ�ֱ���
		bianli(list1);
		
		ArrayList<Teacher8> list2 = new ArrayList<>();
		list2.add(new Teacher8("bingbing", 1));
		//���Դ���:��ΪTeacher1��Person1������,����ʵ�ֱ���
		bianli(list2);
		
		ArrayList<Person1> list3 = new ArrayList<>();
		list3.add(new Person1("bingbing", 1));
		//���Դ���
		bianli(list3);
		
		ArrayList<Object> list4 = new ArrayList<>();
		list4.add(new Object());
		//���Դ���:��ΪObject��Person1�ĸ���,������ʵ�ֱ���
		//bianli(list4);
	}
	
	
	public static void bianli(Collection<? extends Person1>  e){
		System.out.println("������");
	}
}

class Person1{
	String name;
	int age;
	public Person1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
}

class Teacher8 extends Person1{
	public  Teacher8(String name, int age) {
		super(name, age);
	}
}

class Student2 extends Person1{
	public  Student2(String name, int age) {
		super(name, age);
	}
}


