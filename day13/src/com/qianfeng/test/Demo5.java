package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(new Person("bingbing", 18));//第一个
		list.add(new Person("bingbing1", 20));//第二个
		list.add(new Person("bingbing", 18));//第三个
		list.add(new Person("bingbing2", 40));
		System.out.println(list);
		
		//在创建一个ArrayList对象作为存储去重后的数据的集合
		ArrayList list1 = new ArrayList<>();
		//遍历原来的集合
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object =  iterator.next();
			/*
			 * 如果判断成立,说明list1中不包含当前的元素
			 * 工作原理:当添加元素时,会让当前的元素与集合中已有的元素通过equels方法进行一一比较.过程中
			 * 只要有一次返回true,停止比较.让整个的contains方法返回true.只有所有的比较都返回false,最终
			 * 才会返回false
			 * 
			 * 实例:添加第三个元素的时候,调用equals方法的过程
			 * 第三元素.equals(第一个元素) = true     停止比较
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
	
	//重写equals方法---按照自己的规则进行比较
	//按照姓名和年龄比较,只要姓名和年龄相同就认为是一个人
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person)) {
			throw new ClassCastException();
		}
		
		//向下转型
		Person person = (Person)obj;
		return age==person.age && name.equals(person.name);
	}
}
