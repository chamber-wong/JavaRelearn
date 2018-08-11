package com.qianfeng.test;

import java.util.HashMap;

public class Demo10 {
	public static void main(String[] args) {
		/*
		 * HashMap:对他的去重就是对key的去重.类似于HashSet.重写key的HashCode和equals方法
		 */
		
		HashMap<String, String> map = new HashMap<>();
		//在put方法中调用了作为key的String的hashCode和equals方法
		map.put("01", "java");
		map.put("03", "java2");
		map.put("05", "java4");
		map.put("02", "java6");
		map.put("01", "java9");
		
		System.out.println(map);
		
		
		//实例:将Animal类的对象存入HashMap,名字和年龄相同的认为是同一条狗
		HashMap<Animal, String> map1 = new HashMap<>();
		//在put方法中调用了作为key的Animla的hashCode和equals方法
		map1.put(new Animal("拉布拉多", 20), "java");
		map1.put(new Animal("柯基", 10), "java2");
		map1.put(new Animal("黑贝", 2), "java4");
		map1.put(new Animal("茶杯犬", 21), "java6");
		map1.put(new Animal("藏獒", 12), "java9");
		map1.put(new Animal("藏獒", 12), "java9");
		
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
	
	//重写hashCode
	@Override
	public int hashCode() {
		
		return name.hashCode()+age*1000;
	}
	
	//重写equals
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Animal)) {
			throw new ClassCastException("类型转化错误");
		}
		
		Animal animal = (Animal)obj;
		return age==animal.age  && name.equals(animal.name);
	}
}
