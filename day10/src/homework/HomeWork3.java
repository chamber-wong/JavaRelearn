package homework;

interface Shape {
	public double getArea();
}

class Circle implements Shape {
	private double r;
	private final double PI = 3.1415;

	public Circle(double r) {
		super();
		if (r < 0) {
			System.err.println("宽度不能小于0");
			return;
		}else {
			this.r = r;
		}
	}

	public double getArea() {
		return PI*r*r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		if (r < 0) {
			System.err.println("半径不能小于0");
			return;
		}else {
			this.r = r;
		}
		
	}

}

class Rectangular implements Shape {
	private double height;
	private double width;

	public Rectangular(double height, double width) {
		super();
		if (height < 0 || width < 0) {
			System.err.println("长度不能小于0");
			return;
		}else {
			this.height = height;
			this.width = width;
		}
	}

	public double getArea() {
		return height*width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0) {
			System.err.println("高度不能小于0");
			return;
		}else {
			this.height = height;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width < 0) {
			System.err.println("宽度不能小于0");
			return;
		}else {
			this.width = width;
		}
	}

}

public class HomeWork3 {
	public static void main(String[] args) {
		Circle circle = new Circle(-2);
		Rectangular rectangular = new Rectangular(-1, 0);
		circle.getArea();
		rectangular.getArea();
	}
}
