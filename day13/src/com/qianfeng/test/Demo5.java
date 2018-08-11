package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(new Person("bingbing", 18));//��һ��
		list.add(new Person("bingbing1", 20));//�ڶ���
		list.add(new Person("bingbing", 18));//������
		list.add(new Person("bingbing2", 40));
		System.out.println(list);
		
		//�ڴ���һ��ArrayList������Ϊ�洢ȥ�غ�����ݵļ���
		ArrayList list1 = new ArrayList<>();
		//����ԭ���ļ���
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object =  iterator.next();
			/*
			 * ����жϳ���,˵��list1�в�������ǰ��Ԫ��
			 * ����ԭ��:�����Ԫ��ʱ,���õ�ǰ��Ԫ���뼯�������е�Ԫ��ͨ��equels��������һһ�Ƚ�.������
			 * ֻҪ��һ�η���true,ֹͣ�Ƚ�.��������contains��������true.ֻ�����еıȽ϶�����false,����
			 * �Ż᷵��false
			 * 
			 * ʵ��:��ӵ�����Ԫ�ص�ʱ��,����equals�����Ĺ���
			 * ����Ԫ��.equals(��һ��Ԫ��) = true     ֹͣ�Ƚ�
			 * 
			 */
			if (!list1.contains(object)) {
				list1.add(object);
			}
		}
		
		System.out.println(list1);
	}
}

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	//��дequals����---�����Լ��Ĺ�����бȽ�
	//��������������Ƚ�,ֻҪ������������ͬ����Ϊ��һ����
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			throw new ClassCastException();
		}
		
		//����ת��
		Person person = (Person)obj;
		return age==person.age && name.equals(person.name);
	}
}
