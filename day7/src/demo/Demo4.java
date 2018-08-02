package com.qianfeng.test;
/*
 * 在继承中使用构造方法
 * 
  * * 
 * 1.当一个子类中只有一个带参数的构造方法,只能使用带参数的,不能使用无参的.如果想使用,必须手动建立无参的构造方法
 * 2.当父类中只有带参数的构造方法,子类的构造方法中就必须在第一行手动调用父类带参数的构造方法(super(参数))
 * 3.当我们创建构造方法的时候,如果自己不写super(),系统会自动调用
 * 原因:父类中也有属性要进行初始化,而对象的属性必须由自己的构造方法进行初始化,所以必须调用super(),所以每个构造方法中都默认有一个super()
 * 
 * 为什么要将super放在方法的第一行?
 * 答:在子类的构造方法中有可能用到父类的属性,而属性在使用之前必须先进行初始化,否则无法使用.
 * 
 * 总之:在继承体系中,作为父类最好的办法就是将无参构造方法和有参构造方法都写了.
 */
public class Demo4 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.play();
		dog.setName("拉布拉多");
	}
}

class Animal{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public Animal(String name) {
		this.name = name;
	}
}

class Dog extends Animal{
	public Dog() {
		//super();//默认调用的父类的无参的构造方法
		super("金毛");//手动调用父类有参的构造方法
	}
	
	public Dog(String name){
		super(name);//必须放在第一行
		
		//这里可以写自己的代码,要用到父类的属性,属性必须先初始化在使用.
	}
	
	public void play(){
		System.out.println("play");
	}
}