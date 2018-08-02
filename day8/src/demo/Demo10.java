package demo;

public class Demo10 {
	public static void main(String[] args) {
		//继承体系下
//		Zi zi = new Zi();
//		System.out.println(zi.age);//8
		
		
		//多态体系下
		/*
		 * 当父类与子类定义了同名的属性:
		 * 成员变量:编译的时候能不能访问看父类,运行的时候也看父类
		 * 成员方法:编译的时候看父类,运行的时候看子类
		 * 静态成员方法:编译运行都看父类
		 */
		Fu fu = new Zi();//多态
		System.out.println(fu.age);//5
		fu.song();
		fu.run();
		
		//执行show方法--向下转型
	}
}

class Fu{
	int age = 5;
	
	public void run(){
		System.out.println("Fu-run");
	}
	
	public static void song() {
		System.out.println("Fu-song");
	}
}

class Zi extends Fu{
	int age = 8;
	
	public void show(){
		System.out.println("Zi-show");
	}
	
	
	public static void song() {
	    System.out.println("Zi-song");
	}
}
