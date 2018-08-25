package com.qianfeng.fanshe;

public class Person {
	private String name;

	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("run");
	}

	public void eat(String food) {
		System.out.println("eat:" + food);

	}

	public static void play(int num) {
		System.out.println("static-play" + num);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}
