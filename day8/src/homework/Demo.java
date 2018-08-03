package homework;
class Circle
{
	private static double pi=3.14;
	private double radius;
	public Circle(double r)
	{
		radius=r;
	}
	public static double compare(Circle[] cir)
	{
		double max = cir[0].radius;
		for (Circle circle : cir) {
			if (max < circle.radius ) {
				max = circle.radius;
			}
		}
		return max;

		//程序代码//其实就是在求数组中的最大值。
		
	}
	private double compare() {
		
		return radius;
		
	}
}
class TC
{
	public static void main(String[] args)
	{
		Circle cir[]=new Circle[3];//创建了一个类类型数组。
		cir[0]=new Circle(1.0);
		cir[1]=new Circle(2.0);
		cir[2]=new Circle(4.0);
		System.out.println("最大的半径值是："+Circle.compare(cir));
	}
}