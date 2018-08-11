package com.qianfeng.test;

import java.util.HashSet;

public class Demo7 {
    /*
     * Set:无序的,不可重复的
     * 		HashSet:底层是哈希表,线程不安全的
     *      TreeSet:底层是二叉树,线程不安全的
     *      
     *      
     *HashSet如何实现去重:
     *是通过调用元素内部的hashCode和equals方法实现去重.首先调用hashCode方法,比较两个元素的哈希值,如果哈希值不同,直接
     *认为是两个对象,停止比较.如果哈希值相同,再去调用equals方法,返回true,认为是一个对象.返回false,认为是两个对象.
     
     *实例:使用HashSet实现对Person1类对象的去重
     *分析:要取重写Person1的hashCode和equals方法
     *自己指定比较规则:按照姓名和年龄比较
     *
     *注意:1.hashSet本身不能实现排序
     *2.对于自定义的类,要想按照自己制定的比较规则进行去重,必须重写hashCode和equals方法
     */
	
	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		//在String类中重写了hashCode和equals方法
		//在add内部实现的去重的功能.默认调用的是字符串的hashCode和equals方法,实现去重
		set.add("java1");
		set.add("java2");
		set.add("java4");
		set.add("java3");
		set.add("java3");
		
		System.out.println(set);
		
		//实例
		HashSet set1 = new HashSet<>();
		set1.add(new Person1("bingbing", 20));
		set1.add(new Person1("bingbing1", 19));
		set1.add(new Person1("bingbing2", 24));
		set1.add(new Person1("bingbing", 20));
		
		System.out.println(set1);
	}
}

class Person1{
	String name;
	int age;
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
	
	//重写hashCode方法
	//按照姓名和年龄比较,只要姓名和年龄相同就认为是一个人
	@Override
	public int hashCode() {
		return age*1000+name.hashCode();
	}
	
	//重写equals方法---按照自己的规则进行比较
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person1)) {
			throw new ClassCastException();
		}
		
		//向下转型
		Person1 person = (Person1)obj;
		return age==person.age && name.equals(person.name);
	}
}

