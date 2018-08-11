package com.qianfeng.test;

import java.util.HashMap;

public class Demo10 {
	public static void main(String[] args) {
		/*
		 * HashMap:������ȥ�ؾ��Ƕ�key��ȥ��.������HashSet.��дkey��HashCode��equals����
		 */
		
		HashMap<String, String> map = new HashMap<>();
		//��put�����е�������Ϊkey��String��hashCode��equals����
		map.put("01", "java");
		map.put("03", "java2");
		map.put("05", "java4");
		map.put("02", "java6");
		map.put("01", "java9");
		
		System.out.println(map);
		
		
		//ʵ��:��Animal��Ķ������HashMap,���ֺ�������ͬ����Ϊ��ͬһ����
		HashMap<Animal, String> map1 = new HashMap<>();
		//��put�����е�������Ϊkey��Animla��hashCode��equals����
		map1.put(new Animal("��������", 20), "java");
		map1.put(new Animal("�»�", 10), "java2");
		map1.put(new Animal("�ڱ�", 2), "java4");
		map1.put(new Animal("�豭Ȯ", 21), "java6");
		map1.put(new Animal("����", 12), "java9");
		map1.put(new Animal("����", 12), "java9");
		
		System.out.println(map1);
	}
}

class Animal{
	String name;
	int age;
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
	
	//��дhashCode
	@Override
	public int hashCode() {
		
		return name.hashCode()+age*1000;
	}
	
	//��дequals
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Animal)) {
			throw new ClassCastException("����ת������");
		}
		
		Animal animal = (Animal)obj;
		return age==animal.age  && name.equals(animal.name);
	}
}
