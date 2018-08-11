package com.qianfeng.test;

import java.util.TreeMap;

public class Demo11 {
	public static void main(String[] args) {
		/*
		 * TreeMap:实现排序,去重,类似于TreeSet
		 * 
		 * 方法两种:
		 * 1.让key去实现Comparable接口----我讲了
		 * 2.创建比较器实现Comparetor接口----你们做(练习一)
		 * 
		 * 	 *练习题二: 1.josgjsjagwajsogiseafgjwsjgvoier
	     *		要求:转化成字符串 :  a(字符的个数)b()c()..
		 */
		
		TreeMap<String, String> map = new TreeMap<>(); 
		//String实现了Comparable接口的compareTo方法,所以实现了排序和去重
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

	//重写compareTo方法
	@Override
	public int compareTo(Animal1 o) {
		int num = age-o.age;
		return num==0?name.compareTo(o.name):num;
	}
	
}

