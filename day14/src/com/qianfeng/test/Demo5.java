package com.qianfeng.test;
/*
 * 接口上使用泛型:
 */
public class Demo5 {
	public static void main(String[] args) {
		//测试第一种方式
		Pig pig = new Pig();
		pig.play("ok");
		
		//测试第二种
		Dog<String> dog = new Dog();
	}
}

//接口上使用泛型
interface Inter<E>{
	public void play(E e);
}

/*
 * 子类使用泛型的情况
 * 第一种方式:接口有泛型,子类没有遵守对应的泛型
 * 必须给接口指定一个具体的泛型类型
 * 
 * 对应的方法上使用泛型有两种情况
 * 1.重写的接口的方法:要与接口一致,指定具体的泛型
 * 2.自定义的方法:可以遵守接口的泛型,也可以使用自己的
 */

class Pig implements Inter<String>{
	//重写接口的方法
	public void play(String e) {
		// TODO Auto-generated method stub
		
	}
	
	//自定义的方法可以遵守接口的泛型,也可以使用自己的
	public<F> void show(F f){
		
	}
}

/*
 * 第二种方式:接口有泛型,子类遵守了对应的泛型
 * 类上的泛型确定了,接口上的泛型就确定了,重写的方法上的泛型也就确定了
 */

class Dog<E> implements Inter<E>{
	public void play(E e) {
		// TODO Auto-generated method stub
		
	}
}


