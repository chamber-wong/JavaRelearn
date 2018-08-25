package com.qianfeng.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/*
 *  2. 通过字节码对象获取对应的实例对象 
 */
public class Demo2 {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		//普通方式
		Person person = new Person();
		
		//通过字节码对象获取--绕过new
		Class class1 = Class.forName("com.qianfeng.fanshe.Person");
		
		//通过无参的构造方法创建对象
//		fun1(class1);
		
		//通过有参的构造方法创建对象
		fun2(class1);
	}
	//通过无参的构造方法创建对象
	public static void fun1(Class<?> class1) throws InstantiationException, IllegalAccessException {
		//创建实例对象
		//相当于在newInstance方法的内部调用了无参构造方法
		Object object = class1.newInstance();
		
		Person person = (Person) object;
		person.setName("孙燕姿");
		System.out.println(person.getName());
	}
	//通过有参的构造方法创建对象
	public static void fun2(Class<?> class1) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//得到有参的构造方法
		//这里的参数时实际的构造方法的参数的字节码文件
		//注意点:简单数据类型也有字节码文件,获取字节码文件的方式都可以通过.class实现
		Constructor<?> constructor = class1.getConstructor(String.class);
		
		//调用构造方法
		Object object = constructor.newInstance("孙燕姿");//给的是实际的值
//		Person person = (Person) object;
		System.out.println(object);
	}
}
