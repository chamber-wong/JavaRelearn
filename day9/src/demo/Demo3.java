package demo;


/*
 * 内部类:定义在A类里面的B类就是内部类,B类在A类中的地位与其他的成员相同,可以相互调用.
 */
public class Demo3 {
     public static void main(String[] args) {
    	 //方法一:先获取内部类对象再调用方法
		Outer outer = new Outer();
		//创建的内部内的对象;方式是:外部类的对象.new 内部类构造方法.
		//Outer.Inner 获取内部类的方式
		Outer.Inner inner =  outer.new Inner();
		inner.play();
		
		//方法二:借助于外部类的方法实现内部类方法的调用
		outer.show();
	}
}

class Outer{
	int age = 10;
	class Inner{//内部类
		int height = 20;
		
		public void play(){
			System.out.println("Inner-play"+age);
		}
	}
	
	public  void  show() {
		System.out.println("Outer-show");
		
		//相当于在使用Inner
		Inner inner = new Inner();
		inner.play();
	}
}


//通过内部类让java间接实现了多继承
class A{
	
}

class B{
	
}

class X extends A{
	class Y extends B{
		
	}
}
