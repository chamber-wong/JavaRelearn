package com.qianfeng.test;

import java.util.Comparator;
import java.util.TreeMap;

public class Demo2 {
	public static void main(String[] args) {
		ComWithAgeAndName comWithAgeAndName = new ComWithAgeAndName();
		
		TreeMap<Animal1, String> map1 = new TreeMap<>(comWithAgeAndName); 
		
		map1.put(new Animal1("labu", 20), "java");
		map1.put(new Animal1("keji", 20), "java2");
		map1.put(new Animal1("zangao", 12), "java9");
		map1.put(new Animal1("zangao", 12), "java9");
		
		System.out.println(map1);
	}
}

//创建比较器
class ComWithAgeAndName implements Comparator<Animal1>{
	@Override
	public int compare(Animal1 o1, Animal1 o2) {
		int num = o1.age-o2.age;
		return num==0?o1.name.compareTo(o2.name):num;
	}
}

class Animal1 {
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
}
