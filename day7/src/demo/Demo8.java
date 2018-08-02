package com.qianfeng.test;

public class Demo8 {
	public static void main(String[] args) {
		//实例:求圆的面积.
		Circle circle = new Circle();
		circle.r = 2;
		double area = circle.getArea();
		System.out.println(area);
	}
}

class Circle{
	double r;
	final double PI = 3.14; //符号常量
	
	public double getArea(){
		return PI*r*r;
	}
}

//单例饿汉式
class SingleInstance2{
	//将变量变成唯一的.
	private static final SingleInstance2 singleInstance2 =   new SingleInstance2();
	
	private SingleInstance2() {
		// TODO Auto-generated constructor stub
	}
	
	public SingleInstance2 getInstance(){
		return singleInstance2;
	}
}
