package com.qianfeng.test;

public class Demo7 {
	public static void main(String[] args) {
		/*
		 * 可变参数:参数的个数可以不固定
		 * 
		 * 作用:简化代码,方便操作.
		 */
		//值传递
		int he1 = sum(3, 4, 5);
		
		//址传递
		int[] arr = {2,3,4};
 		int he2 = sum(arr);
 		
 		//通过可变参数
 		int[] arr1 = {2,3,4};
 		int he3 = sum1(arr1);
 		
 		//注意点:
 		//1.给可变参数传值的实参可以直接是多个值
 		int he4 = sum1(4,5,6);
 		
 		//2.当包括可变参数在内有多个参数时,可变参数必须放在最后面,而且一个方法只能同时有一个可变参数
 		int he5 = sum2(3, 4,5,6,7);
 		
 		//3.当可变参数的方法与固定参数的方法是重载关系时的调用顺序:固定参数的方法优先于可变参数的方法
 		int he6 = sum3(3,4);
 	}
	
	//求三个数的和
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	
	public static int sum(int[] a){
		int sum = 0;
		for (int i : a) {
			sum+=i;
		}
		return sum;
	}
	//通过可变参数实现求和
	//构成:数据类型+...,可变参数可以直接理解成数组.   例如 int... ==  int[]
	public static int sum1(int... a){
		int sum = 0;
		for (int i : a) {
			sum+=i;
		}
		return sum;
	}
	
	//当包括可变参数在内有多个参数时,可变参数必须放在最后面,而且一个方法只能同时有一个可变参数
	public static int sum2(int b,int... a){
		int sum = 0;
		for (int i : a) {
			sum+=i;
		}
		return sum;
	}
	
	//当可变参数的方法与固定参数的方法是重载关系时的调用顺序:固定参数的方法优先于可变参数的方法
	public static int sum3(int... a){
		System.out.println("可变");
		int sum = 0;
		for (int i : a) {
			sum+=i;
		}
		return sum;
	}
	
	public static int sum3(int a,int b){
		System.out.println("固定");
        return 3;
	}
	
	
}
