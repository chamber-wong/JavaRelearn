package com.qianfeng.test;

import java.util.LinkedList;

public class Demo3 {
	public static void main(String[] args) {
		/*
		 * LinkedList:
		 */
//		���еķ�����
		LinkedList linkedList = new LinkedList<>();
//		addFirst()//ʼ������λ���
//		addLast()//ʼ����ĩβ���
		linkedList.addFirst("java");
		linkedList.addLast("php");;
		linkedList.addFirst("iOS");
		linkedList.add("html");
		linkedList.add(1, "python");
		System.out.println(linkedList);
//		getFirst()//��ȡ�Ķ��󲻴��ڻᷢ���쳣  NoSuchElementException
//		getLast()
		//linkedList.clear();
		//System.out.println(linkedList.getFirst());
//		removeFirst()//ɾ���Ķ��󲻴��ڻᷢ���쳣
//		removeLast()
		System.out.println(linkedList.removeFirst());
		
		
		LinkedList linkedList1 = new LinkedList<>();
//		��jdk1.6��ʼ�������·���
//		offerFirst()
//		offerLast()
		linkedList1.offerFirst("java");
		linkedList1.offerLast("php");
//		peekFirst()//��ȡ�Ķ��󲻴��ڻ᷵��null
//		peekLast()
		linkedList1.clear();
		System.out.println(linkedList1.peekFirst());
//		pollFirst()//ɾ���Ķ��󲻴��ڻ᷵��null
//		pollLast()
		System.out.println(linkedList1.pollFirst());
	}
}
