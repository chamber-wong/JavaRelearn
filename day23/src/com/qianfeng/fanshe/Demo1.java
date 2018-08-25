package com.qianfeng.fanshe;

/*
 * 反射:动态获取类的字节码文件对象,并对其成员进行抽象
 * 
 * 整体:想通过字节码文件直接创建实例对象
 * 过程:1.获取字节码文件对象     2. 通过字节码对象获取对应的实例对象    3.给属性赋值(通过从属性中提取出来的类--field
 * 4.调用方法(通过从方法中提取出来的类--Method) 
 * 
 * 讲解1,获取字节码文件对象
 * a:通过object提供的方法,getClass(),得到字节码文件对象
 * 缺点:必须首先要有一个对象       不可取
 * b:每种数据类型都有一个class属性,通过他可以的到字节码文件对象
 * 缺点:必须要先知道有这个类的名字,    也不可取
 * c:Class类提供的静态方法,forName(字符串)   字符串的构成:包名+类名
 * 优点:只需要提供一个你需要的类的字符串形式
 * 
 * 注意点:字符串必须对应于一个真实存在的类,否则报异常ClassNotFoundExcption
 * 
 * 对c做一个总结:沟通过字符串可以知道到工程中实际存在的类
 */
public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//a:通过object提供的方法,getClass()           
//		fun1();
		//b:每种数据类型都有一个class属性,通过他可以的到字节码文件对象         
//		fun2();
		//c:Class类提供的静态方法,forName(字符串)   字符串的构成:包名+类名
		fun3();
	}

	//a:通过object提供的方法,getClass()
	//说明一个类只有一个字节码文件对象
	public static void fun1() {
		Person person = new Person();
		Class<?> class1 = person.getClass();//字节码文件
		Class<?> class2 = person.getClass();
		System.out.println(class1==class2);
	}

	//b:每种数据类型都有一个class属性,通过他可以的到字节码文件对象 
	public static void fun2() {
		Class<?> class1 = Person.class;
		System.out.println(class1);
	}

	//c:Class类提供的静态方法,forName(字符串)   字符串的构成:包名+类名
	public static void fun3() throws ClassNotFoundException {
		Class class1 = Class.forName("com.qianfeng.fanshe.Person");
		System.out.println(class1);
	}
}


