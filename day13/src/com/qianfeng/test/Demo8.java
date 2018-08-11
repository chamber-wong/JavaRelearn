package com.qianfeng.test;

import java.util.TreeSet;

public class Demo8 {
	public static void main(String[] args) {
		/*
		 * TreeSet:����ʵ��ȥ�غ�����
		 */
		TreeSet set = new TreeSet<>();
		//ʹ��TreeSet�洢�ַ�����ʱ��,�Զ�ʵ��������
		//ԭ��:��add:�����е������ַ����� compareTo����
		//compareTo������������Comparable�ӿ�
		//���ֵ�˳��Ƚ������ַ���
		/*
		 * �ֵ�˳��:����ASCII��Ƚϵ�ǰ�������ַ�,ASCII������Ϊ�Ǵ���ַ�
		 * ����:����ߵ�һ���ַ���ʼ�Ƚ�
		 * �����ǰ���ַ�����ͬ,ֱ����ΪASCII����ַ����Ǵ��ַ���,������ַ�ֹͣ�Ƚ�
		 * ��ǰ�ַ��Ƚϵľ������:ʹ��ǰ����ַ�-������ַ�,���ز�ֵ.����Ǹ���,˵��ǰ����ַ���С�ں����.��֮ǰ��Ĵ�.
		 * �����ǰ���ַ���ͬ,��ȥ�Ƚϵڶ����ַ�,����������,����ȵ������ͬ,����Ϊ�����ַ������,��ֵ����0.
		 */
	    //int compareTo(String anotherString)
		
		//Ĭ�����������ǰ����ֵ�����
		set.add("java2");
		set.add("java8");
		set.add("java3");
		set.add("java4");
		set.add("java4");
		
		System.out.println(set);
		
		//ʵ��:��Person2�Ķ���洢��TreeSet,ʵ�������ȥ��
		TreeSet set1 = new TreeSet<>();
		set1.add(new Person2("bobo", 20));
		set1.add(new Person2("bobo", 18));
		set1.add(new Person2("bobo3", 200));
		set1.add(new Person2("bobo5", 20));
		set1.add(new Person2("bobo", 20));
		
		System.out.println(set1);
	}
}

class Person2 implements Comparable{
	String name;
	int age;
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + "]";
	}
	
	//��дcompareTo����
	//��������������Ƚ�,ֻҪ������������ͬ����Ϊ��һ����
	@Override
	public int compareTo(Object o) {
		//�ݴ���
		if (!(o instanceof Person2)) {
			throw new ClassCastException();
		}
		//����ת��
		Person2 person2 = (Person2)o;
		//�Ȱ��������,������ͬ�ٰ���������
		int num = age - person2.age;
		return num==0?name.compareTo(person2.name):num;
	}
}


