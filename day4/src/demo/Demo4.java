package com.qianfeng.test;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * java中内存的结构:栈区,堆区,方法区,本地方法区,寄存器
		 * 栈区:存放数据的特点是:先进后出.我们将局部变量和函数放入栈区,数据的特点是使用完立即释放
		 * 堆区:存放的是实体(数组,对象),实体可以同时存储多个数据.实体内部的变量如果不赋值,如果是简单数据类型
		 * 			会默认初始化成零,如果是引用类型会初始化成null(空)
		 * 
		 * 了解:
		 * 堆区内部的数据会在某个时刻被释放--通过垃圾回收机制
		 * 垃圾回收机制是通过一个线程控制的,这个线程的等级比较低,所以不会被立即释放.
		 */
		//使用函数求三个数的最大值
		int max = getMax(7, 3, 5);
		System.out.println(max);
	}
	
	public static int getMax(int a,int b,int c){
		int temp = 0;
		//第一种
//		if (a>b) {
//			if (a>c) {
//				temp = a;
//			}else {
//				temp = c;
//			}
//		}else {
//			if (b>c) {
//				temp = b;
//			}else {
//				temp = c;
//			}
//		}
//		
//		return temp;
		//第二种
		temp = a>b?a:b;
		return temp>c?temp:c;
	}
}
