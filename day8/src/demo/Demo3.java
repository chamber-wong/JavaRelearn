package demo;

public class Demo3 {
	public static void main(String[] args) {
		//ʵ��:��Բ����ε����?
	}
}

abstract class Shape{
	public abstract double getArea();
}

class Circle extends Shape{
	double r;
	final double PI = 3.14;
	
	public double getArea() {
		
		return PI*r*r;
	}
}

class Rectangle extends Shape{
	double height;
	double width;
	@Override //��������д�ķ���
	public double getArea() {
		return height*width;
	}
}
