package demo;
/*
 * 了解:静态的内部类
 * 
 * 注意:
 * 1.静态的内部类中可以没有静态的成员
 * 2.有静态成员的一定是静态的内部类
 */
public class Demo7 {
	public static void main(String[] args) {
		//静态的对象
		//要保证内部类本身是静态的
		//构成:new  外部类.内部类+()
		Out1.In1 in1 = new Out1.In1();
		//调用非静态方法
		in1.play();
		//调用静态的方法
		in1.song();
		Out1.In1.song();
	}
}

class Out1{
	 static  class In1{//静态的内部类
		 //非静态的方法
		public void play() {
			System.out.println("play");
		}
		 //静态的方法
		public static void song() {
			System.out.println("song");
		}
	}
}
