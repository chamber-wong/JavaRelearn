package com.qianfeng.test;

import java.util.TreeSet;

public class Demo8 {
	public static void main(String[] args) {
		/*
		 * TreeSet:可以实现去重和排序
		 */
		TreeSet set = new TreeSet<>();
		//使用TreeSet存储字符串的时候,自动实现了排序
		//原因:在add:方法中调用了字符串的 compareTo方法
		//compareTo方法是来自于Comparable接口
		//按字典顺序比较两个字符串
		/*
		 * 字典顺序:按照ASCII表比较当前的两个字符,ASCII码大的认为是大的字符
		 * 规则:从左边第一个字符开始比较
		 * 如果当前的字符不相同,直接认为ASCII大的字符串是大字符串,后面的字符停止比较
		 * 当前字符比较的具体规则:使用前面的字符-后面的字符,返回差值.如果是负数,说明前面的字符串小于后面的.反之前面的大.
		 * 如果当前的字符相同,再去比较第二个字符,依次往后推,如果比到最后都相同,则认为两个字符串相等,差值返回0.
		 */
	    //int compareTo(String anotherString)
		
		//默认是升序并且是按照字典排序
		set.add("java2");
		set.add("java8");
		set.add("java3");
		set.add("java4");
		set.add("java4");
		
		System.out.println(set);
		
		//实例:将Person2的对象存储入TreeSet,实现排序和去重
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
	
	//重写compareTo方法
	//按照姓名和年龄比较,只要姓名和年龄相同就认为是一个人
	@Override
	public int compareTo(Object o) {
		//容错处理
		if (!(o instanceof Person2)) {
			throw new ClassCastException();
		}
		//向下转型
		Person2 person2 = (Person2)o;
		//先按照年龄比,年龄相同再按照姓名比
		int num = age - person2.age;
		return num==0?name.compareTo(person2.name):num;
	}
}


