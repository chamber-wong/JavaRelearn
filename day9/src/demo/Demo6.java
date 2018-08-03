package demo;
/*
 * 匿名内部类(对象):定义在一个类方法中的匿名子类对象,属于局部内部类.
 * 1.匿名对象和匿名子类对象
 * 2.匿名内部类对象
 * 
 * 创建匿名内部类对象注意点:1.匿名内部类对象必须有父类或者父接口
 * 
     匿名内部类对象的作用:
 * 1.当只用到当前子类的一个实例对象的时候,定义好马上使用
 * 2.当不好起名字的时候
 * 3.可以更好的定义运行时的回调(知道即可)
 * 
 * 内部类的作用:
 * 1.间接实现了多继承
 * 2.方便定义
 * 3.只有外部类可以访问创建的内部类的属性和方法,包括私有方法
 * 4.同一个包中其他的类不可见,有了很好的封装性
 * 
 */
public class Demo6 {
	public static void main(String[] args) {
//		//研究匿名对象,匿名子类对象
//		//创建匿名对象,完成方法的调用
//		new Test1().test1Method();
//		
//		//创建匿名子类对象
//		//第一种方法
//		//使用已有的子类生成匿名子类对象并调用方法
//		//应用场景:现成的子类可以使用多次,相同的功能要调用多次的时候
//		new SubTest1().test1Method();
//		//第二种方法
//		//直接创建没有名字的Test1类的匿名子类对象
//		//构成: new + 父类的名字/父接口的名字 + (){匿名子类的执行体}+;
//		//场景:只能使用一次,使用完立即释放.每次都是用不同的功能.
//		new Test1(){
//			//重写的Test1类的方法
//			public void test1Method() {
//				System.out.println("匿名的子类方法");
//			}
//			//子类特有的方法
//			public void bark(){
//				System.out.println("bark");
//			}
//		}.bark();
//		
//		//给匿名子类对象起名字
//		SubTest1 subTest1 = new SubTest1();
//		Test1 test1 = new Test1(){//多态
//			//重写的Test1类的方法
//			public void test1Method() {
//				System.out.println("匿名的子类方法");
//			}
//			//子类特有的方法
//			public void bark(){
//				System.out.println("bark");
//			}
//		};
		
		//研究匿名内部类--测试
		Out out = new Out();
		out.show();
		out.testCanshu1();
		out.testCanshu2();
		Test1 test1 =  out.testFanhuizhi1();
		test1.test1Method();
		Test1 test12 = out.testFanhuizhi2();
	}
}

//研究匿名对象,匿名子类对象
class Test1{
	public void test1Method(){
		System.out.println("test1-Method");
	}
}

class SubTest1 extends Test1{
	@Override
	public void test1Method() {
		System.out.println("SubTest1-Method");
	}
}

//研究匿名内部类
class Out{
	public void show() {
		//匿名内部类
		new Test1(){
			//重写的Test1类的方法
			public void test1Method() {
				System.out.println("匿名的子类方法");
			}
			//子类特有的方法
			public void bark(){
				System.out.println("bark");
			}
		}.bark();		
		new Test1(){
			//重写的Test1类的方法
			public void test1Method() {
				System.out.println("匿名的子类方法");
			}
			//子类特有的方法
			public void bark(){
				System.out.println("bark");
			}
		}.test1Method();
	}
	
	//普通的匿名对象作为参数
	public void testCanshu1(){
		System.out.println(new Test1());
	}
	//测试匿名内部类对象作为参数
	public void testCanshu2(){
		System.out.println(
				
			new Test1(){
			
			public void  bark(){
				System.out.println("bark");
			}
			@Override
			public String toString() {
				
				return "haha";
			}
		}.toString()
				
				);
	}
	
	//普通的匿名对象充当返回值
	public Test1 testFanhuizhi1(){
		return new Test1();
	}
	//匿名内部类对象充当返回值
	public Test1 testFanhuizhi2(){
		return new Test1(){
			
			public void  bark(){
				System.out.println("bark");
			}
			@Override
			public String toString() {
				
				return "haha";
			}
		};
	}
	
	//自己测试使用接口充当父类的匿名内部类对象---作为参数,返回值.
}