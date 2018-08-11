package demo;
/*
 * 设计一个类需要遵守的规则:
 * 1.类名:遵守大驼峰原则
 * 2.属性:遵守小驼峰原则
 * 3.行为:遵守小驼峰原则
 * 
 * 实例:
 * 人类
 * 类名:Person   ----- 必须存在
 * 属性:姓名(name)   年龄 age    -----可以省略
 * 行为:吃饭 eat   打电话:callPhone  ---- 可以省略
 * 
 * 创建类的关键字class    后面跟的是类名
 */

class Person
{
	//属性---成员变量
	String name;//String:是字符串类
	int age =20;//可以直接给一个值
	
	//行为---成员方法
	public void eat() {
		System.out.println(name+"  eat");//name是全局变量,作用范围是整个类(除static修饰的方法),所以在类内部的方法中可以直接使用
	}
	
	public void callPhone(String num){
		System.out.println("给"+num+"打电话");
	}
}
public class Demo6 {
	public static void main(String[] args) {
		//创建Person类型的对象--放进堆里面
		int[] arr = new int[2];
		
		/*
		 * new的功能:1.在堆里开辟一块儿内存空间     2.将当前对象的地址返回
		 * Person():给对象的成员变量赋默认值,变量是简单数据类型赋值成0,引用类型赋值成null
		 * 
		 * 注意:我们每创建一个类就相当于创建了一种数据类型
		 * 
		 * =前面的per是引用数据类型    =后面是真正的对象
		 */
		Person per = new  Person();//Person()这是一个方法,特殊的方法,构成:类名+().这是固定的写法--构造方法
		
		//赋值--通过.语法
		//per.age = 18;
		per.name = "冰冰";
		System.out.println(per.age);//取值
		
		//调用方法
		per.eat();
		per.callPhone("110");
		
		//一个类可以同时创建多个对象,对象之间互不影响,没有关系.
		Person per1 = new  Person();
		System.out.println(per1.age);
	}
}
