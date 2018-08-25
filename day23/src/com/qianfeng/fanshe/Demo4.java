package com.qianfeng.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 4.调用方法(通过从方法中提取出来的类--Method) 
 */
public class Demo4 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 普通方法调用
//		Person person = new Person();
//		person.run();

		// 通过反射实现调用
		Class class1 = Class.forName("com.qianfeng.fanshe.Person");
		// 1.调用非静态的无参方法
		fun1(class1);
		// 2.调用非静态的有参方法
		fun2(class1);
		// 3.调用静态的的有参方法
		fun3(class1);
	}

	// 1.调用非静态的无参方法
	public static void fun1(Class<?> class1) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 第一个参数是创建的方法的方法名 第二个:实例方法参数的字节码文件对象
		Method method = class1.getMethod("run");

		// 创建实例对象
		Constructor<?> constructor = class1.getConstructor(String.class);
		Object per = constructor.newInstance("bingbing");

		// 实现方法的调用
		// 第一个参数:方法所属的对象
		// 第二个:方法的参数
		method.invoke(per);
	}

	// 2.调用非静态的有参方法
	public static void fun2(Class<?> class1) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 第一个参数是创建的方法的方法名 第二个:实例方法参数的字节码文件对象
		Method method = class1.getMethod("eat", String.class);

		// 创建实例对象
		Constructor<?> constructor = class1.getConstructor(String.class);
		Object per = constructor.newInstance("bingbing");

		// 实现方法的调用
		// 第一个参数:方法所属的对象
		// 第二个:方法的参数
		method.invoke(per, "apple");

	}

	// 3.调用静态的的有参方法
	public static void fun3(Class<?> class1) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 第一个参数是创建的方法的方法名 第二个:实例方法参数的字节码文件对象
		Method method = class1.getMethod("play", int.class);

		// 实现方法的调用
		// 第一个参数:方法所属的对象
		// 第二个:方法的参数
		method.invoke(null,30);
	}
}
