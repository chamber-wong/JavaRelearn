package day6;
/**
 * 使用面向对象的思想求两点之间的距离
 * @author 弄风
 *
 */
public class Demo {
	{
	System.out.print("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//求两点之间的距离
		Point point = new Point(0, 0);
		Point point2 = new Point(1, 1);
		double distans = point.getDistans(point2);
		System.out.println(distans);
		
		double distans1 = Point.getDistans(point, point2);
		System.out.println(distans1);
	}

}
class Point{
	double x;
	double y;
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	//通过静态的方法求两点之间的距离
	public static double getDistans(Point p1,Point p2) {
		double temp = (p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y);
		return Math.sqrt(temp);
	}
	//通过非静态的方法求两点之间的距离
	public double getDistans(Point p) {
		double temp = (p.x-x)*(p.x-x)+(p.y-y)*(p.y-y);
		return Math.sqrt(temp);
	}
}
