package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List:有序的,可重复的
 * 要求:使用list存储数据,但是数据不能重复---contains
 */
public class Demo4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("java1");//第一个
		list.add("java2");//第二个
		list.add("java2");//第三个
		list.add("java3");
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
			 * 第三元素.equals("java1") = false     第三元素.equals("java2") = true  停止比较
			 * 
			 */
			if (!list1.contains(object)) {
				list1.add(object);
			}
		}
		
		System.out.println(list1);
	}
}




