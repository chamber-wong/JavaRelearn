package com.qianfeng.test;
/*
 * 在类上使用泛型
 */
public class Demo3 {
	public static void main(String[] args) {
		Student student = new Student();
		Computer computer = new Computer("苹果");
		student.setObject(computer);//多态
		
		//获取工具
		//使用泛型之前
		Object object = student.getObject();
		//向下转型
		Computer computer2 = (Computer)object;//computer2 = object = new Computer("苹果")---向下转型
		Phone phone = (Phone)object;//phone = object = new Computer("苹果")----错误
		
		//使用泛型之后
		//分析:
		Student1<Computer> student2 = new Student1();
		Computer computer1 = new Computer("苹果");
		student2.setObject(computer1);
		
		//取值
		Computer computer3 =  student2.getObject();
		//student2.setObject(new Phone("huawei"));  通过泛型设置,类型已经确定了.
	}
}

/*
 * 使用泛型前
 */
class Student{
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {//object = computer   多态
		this.object = object;
	}
}
/*
 * 使用泛型后
 * E代表任意一种数据类型,但是<>中不一定是E,可以是任意字符
 * 这里就是在给类使用泛型
 * 使用:在类上确定的泛型可以直接在成员上使用
 */
class Student1<E>{
	private E object;

	public E getObject() {
		return object;
	}

	public void setObject(E object) {//object = computer   多态
		this.object = object;
	}
}

class Tool{
	String name;

	public Tool(String name) {
		super();
		this.name = name;
	}

	public Tool() {
		super();
	}
}

class Computer extends Tool{
	public Computer(String name) {
		super(name);
	}
}

class Phone extends Tool{
	public Phone(String name) {
		super(name);
	}
}
