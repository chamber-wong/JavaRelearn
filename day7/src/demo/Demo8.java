package com.qianfeng.test;

public class Demo8 {
	public static void main(String[] args) {
		//ʵ��:��Բ�����.
		Circle circle = new Circle();
		circle.r = 2;
		double area = circle.getArea();
		System.out.println(area);
	}
}

class Circle{
	double r;
	final double PI = 3.14; //���ų���
	
	public double getArea(){
		return PI*r*r;
	}
}

//��������ʽ
class SingleInstance2{
	//���������Ψһ��.
	private static final SingleInstance2 singleInstance2 =   new SingleInstance2();
	
	private SingleInstance2() {
		// TODO Auto-generated constructor stub
	}
	
	public SingleInstance2 getInstance(){
		return singleInstance2;
	}
}
