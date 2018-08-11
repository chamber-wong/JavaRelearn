package com.qianfeng.test;

import java.util.ArrayList;

/*
 * 在方法上使用泛型:
 */
public class Demo4 {
	public static void main(String[] args) {
		Teacher<String> teacher = new Teacher();
		//1.方法上的泛型与类上的泛型保持一致,类上的泛型确定了,方法上的就确定了
		teacher.show("ok");
		//2.方法上拥有属于自己的泛型
		teacher.play(1);
	}
}

class Teacher<E>{
	//1.方法上的泛型与类上的泛型保持一致,类上的泛型确定了,方法上的就确定了
	public void show(E e){
		System.out.println(e);
	}
	//2.方法上拥有属于自己的泛型
	/*
	 * 注意:泛型在使用之前一定要先进行声明
	 * 声明的方式:在方法的最前面加<数据类型>
	 * 作用:让方法内与方法保持一致
	 */
	public <F> void play(F f){
		ArrayList<F> list = null;
	}
	
	//3.静态方法上使用泛型
	/*
	 * 静态方法无法使用类上的泛型,类上的泛型必须通过创建对象使用.
	 * 静态方法不需要对象,所以静态方法必须自己使用泛型
	 */
	public static<W> void eat(W e){
		
		
	}
}
