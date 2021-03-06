package demo;

import demo.Outer.Inner;

/*
 * 局部内部类:定义在一个类的方法中的类
 * 
 * 作用范围:从定义它开始到所在的方法结束
 * 
 * 作用:对于当前的show方法,相当于将他的一部分功能面向对象了,形成了局部内部类.既保证了代码的私有化又对代码
 * 进行了整理,增加了可读性,操作性,简化代码,增加了复用性.
 * 
 * 了解:局部内部类所在的方法中局部变量的使用.
  * 局部变量的作用域:定义变量开始到函数结束
 * final:被final修饰的变量会被放在常量区,而常量区的值存在的时间要大于局部变量所在的方法,相当于从原来的基础上扩大了作用域
 *
 * 原理:
 * 当方法中同时存在局部内部类与成员变量时,成员变量的使用范围就会从原来的基础上进行扩大.
 * 原因:在当前的情况下,程序会默认让final去修饰height.所以当局部变量所在的方法结束的时候,变量没有被释放,保存的值还在.
 * 
 * 关于变量前面的final:
 * 前提:变量必须与局部内部类同时存在.
 * 在jdk1.7之前要想保住局部变量的值,要手动添加final
 * 在jdk1.7之后,java的内部机制已经在变量的前面默认添加了final
 */
public class Demo4 {

}

class Outer1{
	public  void  show() {
		int age = 10;
		System.out.println("Outer-show");
		
		class Inner{//局部内部类
			int height = 20;
			
			public void play(){
				System.out.println("Inner-play"+age);
			}
		}
		
		//相当于在使用Inner
		Inner inner = new Inner();
		inner.play();
	}
}

class Test{

	
	public void play() {
		//我们通过局部内部类实现了功能的私有化,并对方法内部的代码进行了整理,增强了代码的可读性和可操作性.
		
		//因为函数的定义不能嵌套,所以这里要通过局部内部类实现
//		public void gongneng1(){
//			System.out.println("功能1");
//		}
//		public void gongneng2(){
//			System.out.println("功能2");
//		}
		
		class Inner{
			public void gongneng1(){
				System.out.println("功能1");
			}
			public void gongneng2(){
				System.out.println("功能2");
			}
		}
		
		Inner inner = new Inner();
		inner.gongneng1();
		inner.gongneng2();
	}
	
	public void run(){
		//因为两个方法是play的局部内部类方法.play之外不可见
//		gongneng1();
//		gongneng2();
	}
}
