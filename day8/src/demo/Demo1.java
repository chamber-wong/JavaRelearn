package demo;

public class Demo1 {
	public static void main(String[] args) {
		Circle circle = new Circle(10.0);
		System.out.println(circle.getArea());
		Rectangle rectangle = new Rectangle(10,10);
		System.out.println(rectangle.getArea());
		
	}
}
abstract class Shape{
	double width;
	public Shape(double width) {
		// TODO Auto-generated constructor stub
		this.width = width;
	}
	public abstract double getArea();
}
class Circle extends Shape{

	final double PI = 3.14;
	public Circle(double width) {
		super(width);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return PI*(width/2)*(width/2);
	}
	
}
class Rectangle extends Shape{
	double height;
	public Rectangle(double width) {
		super(width);
		// TODO Auto-generated constructor stub
	}
	public Rectangle(double width,double hight) {
		// TODO Auto-generated constructor stub
		this(width);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	
}
