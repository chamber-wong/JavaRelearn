package demo;

public class Demo7 {
    public static void main(String[] args) {
		//求两点之间的距离
    	Point point1 = new Point(2, 2);
    	Point point2 = new Point(3, 3);
    	
    	//使用静态的方法
    	double distance = Point.getDistance(point1, point2);
    	System.out.println(distance);
    	
    	//使用非静态的方法
    	double distance1 = point1.getDistance(point2);
    	System.out.println(distance1);
	}
}

class Point{
	double x;
	double y;
	public Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	//通过静态的方法求两点之间的距离
	public static double getDistance(Point p1,Point p2){
		double temp = (p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y);
		return Math.sqrt(temp);
	}
	
	//通过非静态的方法
	public double getDistance(Point p){
		double temp = (this.x-p.x)*(x-p.x)+(this.y-p.y)*(y-p.y);
		return Math.sqrt(temp);
	}
}
