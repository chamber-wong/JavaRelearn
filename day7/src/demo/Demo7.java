package demo;

public class Demo7 {
	/*
	 * final:最终的,不可改变的
	 * 可以修饰的
	 * 1.类:类不能创建子类
	 * 2.成员方法:方法不能重写
	 * 3.成员变量:变量的值就变成了一个终值,所以被final修饰的变量必须先给一个值.
	 * 4.局部变量:被final修饰的变量必须先给一个值
	 */
}

class Fu{
	final String name = "bingbing";//被final修饰的变量必须先给一个值.
	public  void play(){
		final int a = 9;
	}
}

class Zi extends Fu{
	//重写
	public void play() {
		// TODO Auto-generated method stub
		super.play();
	}
}
