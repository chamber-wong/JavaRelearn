package com.qianfeng.test;
/*
 * 函数的重载:对于同一个类中的函数,函数的名字相同,函数的参数不相同,我们将他们的关系称为重载.
 * 
 * 原因:在程序的内部真正识别函数的时候,识别的是函数名+所有参数的类型.
 * 
 * 注意:重载的函数本质上是不同的函数
 * 
 * 总的注意点:
 * 1.函数名必须相同
 * 2.参数必须不同:参数的个数,位置,类型都叫不同
 * 3.重载与返回值无关
 * 
 * 作用:简化代码,方便我们操作.
 */
public class Demo9 {
	public static void main(String[] args) {
		
	}
	
	//1.
	public static int sum(int a,int b){//sum_int_int
		return a+b;
	}
	
	//2.与1是重载,参数的个数不同
	public static int sum(int a,int b,int c){//sum_int_int_int
		return a+b+c;
	}
	
	//3.与1不是重载,是同一个函数,重载与参数的名字无关
//	public static int sum(int c,int d){//sum_int_int
//		return a+b;
//	}
	//4.与1是重载,参数的类型不同
	public static int sum(float a,int b){//sum_float_int
		return 4;
	}
	
	
	//5.与1不是重载,这里是返回值不同,与重载无关,我们将这种情况称为错误
//	public static void sum(int a,int b){//sum_int_int
//		return a+b;
//	}
	
	//6.与4是重载,参数的位置不同
	public static int sum(int a,float b){//sum_int_float
		return 4;
	}
}
