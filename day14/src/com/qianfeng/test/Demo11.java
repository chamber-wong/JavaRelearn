package com.qianfeng.test;

import java.util.TreeMap;

public class Demo11 {
	public static void main(String[] args) {
		/*
		 * TreeMap:ʵ������,ȥ��,������TreeSet
		 * 
		 * ��������:
		 * 1.��keyȥʵ��Comparable�ӿ�----�ҽ���
		 * 2.�����Ƚ���ʵ��Comparetor�ӿ�----������(��ϰһ)
		 * 
		 * 	 *��ϰ���: 1.josgjsjagwajsogiseafgjwsjgvoier
	     *		Ҫ��:ת�����ַ��� :  a(�ַ��ĸ���)b()c()..
		 */
		
		TreeMap<String, String> map = new TreeMap<>(); 
		//Stringʵ����Comparable�ӿڵ�compareTo����,����ʵ���������ȥ��
		map.put("01", "java");
		map.put("03", "java2");
		map.put("05", "java4");
		map.put("02", "java6");
		map.put("01", "java9");
		
		System.out.println(map);
		TreeMap<Animal1, String> map1 = new TreeMap<>(); 
		
		map1.put(new Animal1("labu", 20), "java");
		map1.put(new Animal1("keji", 20), "java2");
		map1.put(new Animal1("zangao", 12), "java9");
		map1.put(new Animal1("zangao", 12), "java9");
		
		System.out.println(map1);
	}
}

class Animal1 implements Comparable<Animal1>{
	String name;
	int age;
	public Animal1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal1 [name=" + name + ", age=" + age + "]";
	}

	//��дcompareTo����
	@Override
	public int compareTo(Animal1 o) {
		int num = age-o.age;
		return num==0?name.compareTo(o.name):num;
	}
	
}

