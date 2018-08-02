package com.qianfeng.test;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * 接口:interface
		 * 构成:
		 * interface 接口的名字{
		 * 		接口的实现部分
		 * 		(默认是public final static)成员变量;
		 * 		(默认是public abstract)成员方法(声明);
		 * }
		 * 
		 * 一般接口中不写成员变量,只写方法--只写规则,又将接口称为方法列表
		 * 
		 * 起作用的方式:让类去实现接口
		 * 类与类之间的关系---继承      extends
		 * 类与接口之间的关系--实现    implements
		 * 
		 * 问题一:接口与父类可以同时存在吗?
		 * 可以
		 * 
		 * 问题二:一个子类只能由一个父类,也只能有一个接口?
		 * 不对,可以同时存在多个接口
		 * 
		 * 问题三:父类与接口的功能如何分配?
		 * 一般父类中放的是主要功能,接口中放的是额外的功能,接口作为父类的补充.
		 * 
		 * 问题四:接口可以直接创建对象吗?
		 * 不可以,接口默认是抽象的
		 * 
		 * 问题五:接口与接口之间可以有关系?如果有,有什么关系?
		 * 可以,有继承的关系.并且是多继承
		 * 
		 * 问题六:当一个类实现的接口中出现了相同的方法,子类中实现方法的时候会不会混淆?
		 * 不会,接口中的方法都是抽象的,要通过子类写具体的实现.我们在调用方法时,最终看的功能,而功能只有一份.
		 * 
		 * 总结:接口的作用:让java从单继承间接的实现了多继承,扩充了原来的功能,我们可以认为接口是类的补充.
		 * 
		 * 了解:
		 * 从jdk1.7开始,以后的接口中可以有方法的实现,但是方法必须使用static或default修饰
		 */
		Bird bird = new Bird();
		bird.show();
	}
}

//接口本身是抽象的
 interface Inter1{
	int age = 4;//接口中的变量默认是最终的,公共的,静态的,所以定义的时候必须先给一个值
	public void show();
}
 
 interface Inter2{
	public void play();
	public void show();
}
 //有继承的关系.并且是多继承,多个接口用,隔开
 interface Inter3 extends Inter1,Inter2{
	
}
 
 //创建Bird类实现Inter1接口和Inter2接口,多个接口之前用,隔开
 class Bird extends Object implements Inter1,Inter2{
	
	 //重写show()方法
	public void show() {
		System.out.println("show");
		
	}
	
	//重写play方法
	public void play() {
		System.out.println("play");
	}

 }
 
 
