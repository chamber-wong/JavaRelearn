package com.qianfeng.test;
/*
 * 设计模式:前人总结出来的经验,被后人直接拿来使用.
 * 常用的设计模式:23种,我们要学的有单例,模板,装饰,适配器,工厂,代理等
 * 单例设计模式:一个类只允许有一个对象,将这个对象作为一个全局的访问点,提供出去供大家使用.
 * 分析:
 * 1.用户只能有一个对象
 * 2.全局的访问点:得到的对象就是全局的访问点. 如何做到全局?让static去修饰
 * 3.如何提供出去?
 * 4.供大家使用?--单例的功能
 * 
 * 
  * 单例类的作用:1.可以实现两个对象之间的传值
  * 2.可以在全局范围内调用很多的功能.
 * 好处:可以让两个对象在完全没有关系的前提下,实现值的传递,降低了耦合性,提高了内聚性
 * 
 * 耦合性,内聚性在微观上说:描述的是类与类之间的关系
 * 好处:我们应该尽量提高内聚性,减少耦合性,可以提高程序的健壮性,增加代码的可移植性,方便实现模块儿化编程
 * 
 * 如何做到低耦合高内聚?
 * 在处理类与类关系的时候,让类之间的关系越紧密耦合性越高,内聚性越低.反之,关系越松散耦合性越低,内聚性越高.
 */


//创建单例类
//饿汉式-在定义变量的同时完成初始化
class SingleInstance{
	//2.在类的内部创建一个当前类型的属性并赋值--在类的内部得到了当前类的一个对象
	//将变量私有化,让外界无法直接访问    给变量用static修饰让他成为全局的访问点
	private static SingleInstance singleInstance = new SingleInstance();
	
	//1.将构造方法私有化
	private SingleInstance() {
		
	}
	
	//3.使用公共的方法将变量提出出去,并将方法设置成静态的
	public static SingleInstance getInstance(){
		return singleInstance;
	}
}
//懒汉式-开始只是定义变量,什么时候使用什么时候赋值
class SingleInstance1{
	//2.在类的内部创建一个当前类型的属性并赋值--在类的内部得到了当前类的一个对象
	//将变量私有化,让外界无法直接访问    给变量用static修饰让他成为全局的访问点
	private static SingleInstance1 singleInstance = null;
	
	//1.将构造方法私有化
	private SingleInstance1() {
		
	}
	
	//3.使用公共的方法将变量提出出去,并将方法设置成静态的
	public static SingleInstance1 getInstance(){
		if (singleInstance == null) {
			singleInstance = new SingleInstance1();
		}
		
		return singleInstance;
	}
	
	
	//4.单例的功能区
	int num;
}

public class Demo5 {
	public static void main(String[] args) {
		SingleInstance1 singleInstance1 = SingleInstance1.getInstance();
		SingleInstance1 singleInstance2 = SingleInstance1.getInstance();
		System.out.println(singleInstance1 == singleInstance2);//true,说明获取到的是同一个对象
		
		//实例:完成的功能:将A类中num1的值传给B类对象的num2
		A a = new A();
		a .num1 = 4;
		
		B b = new B();
		
		//直接赋值,一般类的成员变量是私有的,所以不推荐
//		b.num2 = a.num1;
//		//通过传参间接赋值
//		b.test(a);
		//通过单例实现传值
		a.ceshi1();
		b.ceshi2();
	}
}

//测试单例的功能
class A{
	int num1;
	//测试通过单例传值
    public void ceshi1() {
		SingleInstance1 singleInstance = SingleInstance1.getInstance();
		singleInstance.num = num1;
	}
}

class B{
	int num2;
	//通过传参赋值
	public void test(A a){
		num2 = a.num1;
	}
	//测试通过单例传值
	public void ceshi2(){
		SingleInstance1 singleInstance = SingleInstance1.getInstance();
		num2 = singleInstance.num;
	}
}