package com.qianfeng.test;

public class Demo2 {
	/*
	 * 方法的声明:没有方法体的方法.
	 * 
	 * abstract:抽象的
	 * 有两种描述:抽象类,抽象方法
	 * 抽象类:在继承中,提取父类方法的时候,每个子类都有自己具体是实现方法,父类不能决定他们各自的实现方法,父类就
	 * 不管了,所以在父类中只写方法的声明,将方法的实现交给子类.在类中只有方法声明的方法称为抽象方法,拥有抽象方法的
	 * 称为抽象类
	 * 
	 * 注意点:
	 * 1.抽象类不一定有抽象方法,但是有抽象方法的一定是抽象类.
	 * 2.继承了抽象类的子类一定要实现抽象方法,如果不实现就只能将自己也变成抽象的.
	 * 3.抽象类不能直接创建对象,必须通过子类实现,所以抽象类一定有子类
	 * 
	 * 比较普通类与抽象类:
	 * 1.普通类可以直接创建对象
	 * 2.抽象类可以有抽象方法
	 * 
	 * 不能与abstract同时存在的关键字
	 * 1.final:被final修饰的类不能有子类,方法不能重写,但是abstract必须有子类,必须重写
	 * 2.static:修饰的方法可以通过类名调用,abstract必须通过子类实现
	 * 3.private:修饰的方法不能重写,abstract必须重写
	 */
	public static void main(String[] args) {
		//抽象类不能直接创建对象.必须通过子类实现功能.
		//Person person = new Person();
	}
}

//抽象类,拥有抽象方法的一定是抽象类
abstract class Person{
	String name;
	//抽象方法--相当于指定了一个规则
	public abstract void teach();
}
//可以将子类变成抽象的,但之后要想使用当前的类就必须再创建子类,因为抽象类不能直接创建对象.
 class Teacher extends Person{
	
	 //重写--写抽象方法的实现
	public void teach() {
		
	}
}
