package com.qianfeng.test;
/*
 * instanceof:
 */
public class Demo9 {
	
	public static void main(String[] args) {
		Dog3 dog3 = new Dog3();
		Cat3 cat3 = new Cat3();
		feedAnimal1(cat3);
	}
	
	public static void  feedAnimal(Animal3 animal) {//animal3 = dog3 = new Dog3()   多态
		//容错处理---增加用户体验
		if (!(animal instanceof Dog3)) {//确定前面的对象是否是后面的类的对象,是返回true,不是返回false
			System.out.println("当前的对象不是Dog3类型的");
			return;
		}
		//调用狗类特有的方法
		Dog3 dog3 = (Dog3)animal;
		dog3.bark();
	}
	
	//关于instanceof
	//定义:确定前面的对象是否是后面的类或子类的对象,是返回true,不是返回false
	//注意:前提:前面和后面必须有继承的关系,如果没有会立刻报错.
	public static void  feedAnimal1(Animal3 animal) {//animal3 = dog3 = new Dog3()   多态
		//容错处理---增加用户体验
		if (!(animal instanceof Animal3)) {//确定前面的对象是否是后面的类的对象,是返回true,不是返回false
			System.out.println("当前的对象不是Dog3类型的");
			return;
		}
		
		System.out.println("成立");
		//前面是后面的父类的对象
		if (new Animal3() instanceof Dog3) {//false
			
			return;
		}
		//前后没有关系
//		if (new Animal3() instanceof Test) {//报错
//			
//			return;
//		}
	}
}

class Test{
	
}

class Animal3{
	String name;
	public Animal3(String name) {
		super();
		this.name = name;
	}
	public Animal3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void eat(){
		System.out.println("Animal-eat");
	}
}

class Dog3 extends Animal3{
	public void  eat() {
		System.out.println("Dog-eat");
	}
	
	public void bark(){
		System.out.println("Dog-吠");
	}
}

class Cat3 extends Animal3{
	public void eat(){
		System.out.println("Cat-eat");
	}
}

class Tiger3 extends Animal3{
	public void eat(){
		System.out.println("Tiger-eat");
	}
}

