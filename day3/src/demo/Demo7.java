package demo;

public class Demo7 {
	public static void main(String[] args) {
		//×ÖÄ¸µÄ´òÓ¡Ë³Ğò   cebda
		test1();
	}
	
	public static void test1(){
		test4();
		System.out.print("a");
	}
	public static void test2(){
		System.out.print("b");
	}
	public static void test3(){
		System.out.print("c");
		test5();
	}
	public static void test4(){
		test3();
		System.out.print("d");
	}
	public static void test5(){
		System.out.print("e");
		test2();
	}
}
