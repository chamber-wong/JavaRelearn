package com.qianfeng.test;
/*
 * 多态:一种事物的多种形态.      人==动物==生物            牡丹==花==植物==生物
 * 
 * 多态的前提:类与类之间必须有继承的关系
 */
public class Demo6 {
	public static void main(String[] args) {
		//使用继承
		Dog dog = new Dog();
		dog.name = "拉布拉多";//调用父类的属性
		dog.play();//调用父类的方法
		dog.show();//调用子类的方法
		
		
		//使用多态
		//用父类的引用指向子类的对象---这就是java中多态在代码中的体现
		//注意:这里所说的父类可以是直接的父类也可以是间接的父类
		Animal animal = new Dog();
		/*
		 * 程序运行分成三个阶段:预编译,编译,运行
		 * 预编译:程序打开的时候,活儿已经干完了.(预处理命令 #define)
		 * 编译:从打开程序开始到点击左上角的三角之前---只能识别=前面的引用类型,不会识=后面的对象
		 * 运行:从点击三角开始---真正的识别对象,对象开始干活儿
		 * 
		 * 了解的内容:
		 * 实现动态的手段:动态类型,动态绑定,动态加载
		 * 动态加载:我们在编译阶段不能确定具体的对象类型,只有到了运行阶段才能确定真正的干活儿的对象.
		 */
		animal.play();
		//animal.show();//工作机制:1.首先通过animal保存的地址找到Dog对象   2.Dog对象再去调用show方法.
		//不能通过的原因:在编译的时候识别的是引用类型,不识别对象.所以只能识别出Animal里面的方法,而不能直接
		//调用子类特有的方法.
		
		/*
		 * 总结:优点:可以提高代码的扩展性,使用之前定义好的功能,后面直接拿来使用,不用再创建新的方法.实例在Demo7
		 * 缺点:只能直接调用父类有的方法,不能直接调用子类特有的方法.
		 */
	}
}

class Animal{
	String name;
	public Animal(String name) {
		super();
		this.name = name;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void play(){
		System.out.println("Animal-play");
	}
}

class Dog extends Animal{
	public void  show() {
		System.out.println("Dog-show");
	}
}

class Cat extends Animal{
	public void eat(){
		System.out.println("Cat-eat");
	}
}
