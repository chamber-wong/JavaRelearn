package com.qianfeng.fanshe;

import java.lang.reflect.Field;

/*
 *   3.给属性赋值(通过从属性中提取出来的类--field
 */
public class Demo3 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
		//通过普通的方法
		Person person = new Person();
		person.setName("孙燕姿");
		
		//通过反射实现--通过字节码文件创建对象调用
		//1.得到字节码文件
		Class class1 = Class.forName("com.qianfeng.fanshe.Person");
		
		//2.调用Filed相关方法得到属性
//		Field field = class1.getField("name");
		
		//忽略权限
		Field field = class1.getDeclaredField("name");
		
		//解释:当属性时私有的,我们要通过反射进行访问,可以做的方法:
		//首先使用getDeclaredField(),然后再调用setAccessible(),并将参数设为true
		field.setAccessible(true);
				
		//3.通过字节码文件创建Person类型的实例对象
		Object per = class1.newInstance();
		
		//4.将field属性指定给当前的实例对象,并完成赋值
		//第一个参数:绑定的具体的实例对象
		//第二个参数:给他赋的值
		field.set(per, "孙燕姿");//等价于per.name="孙燕姿";
		
		System.out.println(field.get(per));
		
		//通过字节码文件再创建一个对象
		Object per1 = class1.newInstance();
		field.set(per, "孙");
		System.out.println(field.get(per));
		
	}
}
