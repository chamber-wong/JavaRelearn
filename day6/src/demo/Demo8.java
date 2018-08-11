package demo;
/*
 * 静态代码块儿:随着类的加载而加载,在整个程序的过程中只执行一次.执行顺序优先有main
 * 构成: static+{代码}
 * 构造代码块儿:随着对象的加载而加载,每次创建对象都会执行一次,执行顺序优先于构造方法
 * 构成:{代码}
 */
public class Demo8 {
	static {
		System.out.print("a");
	}
	public static void main(String[] args) {
		System.out.print("g");
		Cat cat = new Cat();
		Cat cat1 = new Cat();

		cat.eat();
		System.out.println();
		//验证构造代码块儿是随着对象的加载而加载
		Pig.play();//打印的是oplay
	}
	static {
		System.out.print("b");
	}
}
class Cat{
	static {
		System.out.print("e");
	}
	{
		System.out.print("f");
	}
	public Cat() {
		System.out.print("c");
	}
	public void eat(){
		System.out.print("d");
	}
}

class Pig{
	static {
		System.out.print("o");
	}
	{
		System.out.println("k");
	}
	public static void play(){
		System.out.println("play");
	}
}
