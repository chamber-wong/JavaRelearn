package com.qianfeng.test;

public class Demo3 {
	public static void main(String[] args) {
		int[] arr = new int[]{4,1,6};
		//用static修饰的方法的类充当工具类
		ArrayTools.bubbleSort(arr);
		
		//如果是非静态的,还需要再创建对象,使用引用调用方法.但是在工具类的方法中没有使用非静态的成员变量.所以...
//		ArrayTools arrayTools = new ArrayTools();
//		arrayTools.bubbleSort(arr);
		
		
		//通过对age 的观察,说明静态的成员变量是被所有的Animal对象共享的.
		Animal animal = new Animal();
		animal.age = 4;
		
		Animal animal1 = new Animal();
		System.out.println(animal1.age);
	}
	/*
	 * static的作用总结:可以修饰成员变量和成员方法
	 * 作用:保值-使成员的存活时间(生命周期)与程序的一致
	 * 
	 * 被static修饰的成员变量的特点
	 * 1.被当前类的所有对象共享
	 * 2.由随着对象的加载而加载变成随着类的加载而加载,变量被放在了静态方法区,执行顺序优先于非静态的成员变量
	 * 3.可以使用类名或引用调用
	 *	 * 
	 * 静态的成员变量与非静态的成员变量的区别:
	 * 1.存储的数据的使用:非静态的只能供当前的对象使用.静态的供所有对象共享
	 * 2.生命周期:非静态的跟对象一致,静态的跟程序一致
	 * 3.存储的位置:非静态的:对象中    静态的:静态方法区
	 * 4.访问的方式:非静态的:引用     静态的:引用或类名
	 * 
	 * 被static修饰的成员方法的特点
	 * 静态的成员方法内部只能使用静态的成员变量
	 * 非静态的内部既可以使用静态的成员变量,也可以使用非静态的成员变量
	 */
}

class Animal{
	static int age;
}
