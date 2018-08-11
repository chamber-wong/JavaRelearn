package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo6 {
	public static void main(String[] args) {
		/*
		 * ��ϰ:����һ����:����   ����:����,����
		 * Ҫ��:����һ�����ϱ���3��������,��һ����������   �ڶ���:��ë   ����:����,�ֱ�������������ȥ��
		 */
		
		ArrayList list = new ArrayList<>();
		list.add(new Dog("��������", 20));
		list.add(new Dog("��ë", 20));
		list.add(new Dog("����", 23));
		list.add(new Dog("��ë", 26));
		
		System.out.println(list);
		
		ArrayList list1 = new ArrayList<>();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object = (Object) iterator.next();
			if (!list1.contains(object)) {
				list1.add(object);
			}
		}
		
		System.out.println(list1);
	}
}

class Dog{
	String name;
	int age;
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	//:�����˵�����������Ƚ�.ֻҪ���������һ�¾���Ϊ��һ����.
	public boolean equals(Object obj) {
		if (!(obj instanceof Dog)) {
			throw new ClassCastException();
		}
		
		//����ת��
		Dog person = (Dog)obj;
		//return this.age==person.age && this.name.equals(person.name);
		//���������
		//return this.age == person.age;
		//��������
		return this.name.equals(person.name);
	}
}
