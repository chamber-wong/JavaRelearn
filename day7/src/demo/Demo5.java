package demo;


/**
 * 单例模式
 * 恶汉式-在定义变量的同时完成初始化
 * @author 弄风
 *
 */
class SingleInstance{
	//在类的内部创建一个当前类型的属性并赋值--在类的内部得到了当前类的一个对象
	//将变量私有化,让外界无法直接访问  给变量用static修饰让它成为全局的访问点
	private static SingleInstance singleInstance = new SingleInstance();
	
	//将构造方法私有化
	private SingleInstance() {
		
	}
	//使用公共的方法将变量提供出去,并将方法设置成静态的
	public static SingleInstance getSingleInstance() {
		return singleInstance;
	}
}
/**
 * 单例模式
 * 懒汉式-开始只是定义变量,什么时候使用什么时候赋值
 * @author 弄风
 *
 */
class SingleInstance1{
	//在类的内部创建一个当前类型的属性并赋值--在类的内部得到了当前类的一个对象
	//将变量私有化,让外界无法直接访问  给变量用static修饰让它成为全局的访问点
	private static SingleInstance1 singleInstance = null;
	
	//将构造方法私有化
	private SingleInstance1() {
		
	}
	//使用公共的方法将变量提供出去,并将方法设置成静态的
	public static SingleInstance1 getSingleInstance() {
		if (singleInstance == null) {
			singleInstance = new SingleInstance1();
		}
		return singleInstance;
	}
	
	//单例的功能区
	int num;
	
}
public class Demo5 {
	public static void main(String[] args) {
		SingleInstance sInstance  = SingleInstance.getSingleInstance();
		SingleInstance sInstance1  = SingleInstance.getSingleInstance();
		System.out.println(sInstance == sInstance1);
	
		//实例:完成的功能,把A中num1值传给B中的num2
		
		A a = new A();
		a.num1 = 5;
		B b = new B();
		
		a.ceshi1();
		b.ceshi2();
		
	}
}
//测试单例的功能
class A{
	int num1;
	public void ceshi1() {
		SingleInstance1 singleInstance1 = SingleInstance1.getSingleInstance();
		singleInstance1.num = num1;
	}
}
class B{
	int num2;
	public void ceshi2() {
		SingleInstance1 singleInstance1 = SingleInstance1.getSingleInstance();
		num2 = singleInstance1.num;
	}
}