package demo;

public class Demo3 {
	public static void main(String[] args) {
		//实例:求圆与矩形的面积?
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
	@Override //这里是重写的方法
	public double getArea() {
		return height*width;
	}
}
