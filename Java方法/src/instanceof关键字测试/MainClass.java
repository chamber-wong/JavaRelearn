package instanceof关键字测试;

public class MainClass {
	public static void main(String[] args) {
		Futher futher = new Futher();
		Futher son = new Son();
		if (futher instanceof Son) {
			System.out.println("futher是Son类型");
		}
		if (futher instanceof Futher) {
			System.out.println("futher是Futher类型");
		}
		if (son instanceof Futher) {
			System.out.println("son是Futher类型");
		}
	}
}
class Futher{
	
}
class Son extends Futher{
	
}