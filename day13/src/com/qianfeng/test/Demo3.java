package com.qianfeng.test;

import java.util.LinkedList;

public class Demo3 {
	public static void main(String[] args) {
		/*
		 * LinkedList:
		 */
//		特有的方法：
		LinkedList linkedList = new LinkedList<>();
//		addFirst()//始终在首位添加
//		addLast()//始终在末尾添加
		linkedList.addFirst("java");
		linkedList.addLast("php");;
		linkedList.addFirst("iOS");
		linkedList.add("html");
		linkedList.add(1, "python");
		System.out.println(linkedList);
//		getFirst()//获取的对象不存在会发生异常  NoSuchElementException
//		getLast()
		//linkedList.clear();
		//System.out.println(linkedList.getFirst());
//		removeFirst()//删除的对象不存在会发生异常
//		removeLast()
		System.out.println(linkedList.removeFirst());
		
		
		LinkedList linkedList1 = new LinkedList<>();
//		从jdk1.6开始出现以下方法
//		offerFirst()
//		offerLast()
		linkedList1.offerFirst("java");
		linkedList1.offerLast("php");
//		peekFirst()//获取的对象不存在会返回null
//		peekLast()
		linkedList1.clear();
		System.out.println(linkedList1.peekFirst());
//		pollFirst()//删除的对象不存在会返回null
//		pollLast()
		System.out.println(linkedList1.pollFirst());
	}
}
