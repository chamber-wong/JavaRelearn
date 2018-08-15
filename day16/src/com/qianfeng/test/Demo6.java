package com.qianfeng.test;
/*
 * 实例:两个人向同一个账户里面存钱?
* 注意：1.当在一个类中同时存在多个synchronized修饰的代码块儿或函数时，要想安全，就必须让他们后面的对象一致。因为只有同一把锁才能安全。
 * 同步函数的锁：this
 * 2静态同步函数在进内存的时候不会创建对象，但是存在其所属类的字节码文件对象，属于class类型的对象，所以
 * 静态同步函数的锁是其所属类的字节码文件对象
 * 
 * 
理解synchronized关键字
1、synchronized关键字的作用域有二种： 
1）是某个对象实例内，synchronized aMethod(){}可以防止多个线程同时访问这个对象
的synchronized方法（如果一个对象有多个synchronized方法，只要一个线程访问了其中的
一个synchronized方法，其它线程不能同时访问这个对象中任何一个synchronized方法）。
这时，不同的对象实例的synchronized方法是不相干扰的。也就是说，其它线程照样可以同时
访问相同类的另一个对象实例中的synchronized方法； 
2）是某个类的范围，synchronized static aStaticMethod{}防止多个线程同时访问
这个类中的synchronized static 方法。它可以对类的所有对象实例起作用。
2、除了方法前用synchronized关键字，synchronized关键字还可以用于方法中的某个区块中，
表示只对这个区块的资源实行互斥访问。用法是: synchronized(this){/区块/}，它的作用域是当前对象；

3、synchronized关键字是不能继承的，也就是说，基类的方法synchronized f(){} 
在继承类中并不自动是synchronized f(){}，而是变成了f(){}。继承类需要你显式的指定
它的某个方法为synchronized方法；
	 
	 */
public class Demo6 {
	public static void main(String[] args) {
		//1.创建任务类对象
		CunQian cunQian = new CunQian();
		
		//2.创建线程
		Thread thread1 = new Thread(cunQian);
		Thread thread2 = new Thread(cunQian);
		
		//3.开启线程
		thread1.start();
		thread2.start();
	}
}

class Bank {
	static int sum;
	
	public void addMoney(int num){
		//使用的同步代码块儿
		synchronized (this) {//加锁
			sum += num;
			System.out.println(sum);
	   }
		System.out.println("haha");
	}
	//使用的同步函数
	//使用非静态的同步函数
	//相当于默认在synchronized后面有this充当锁
	public synchronized void addMoney1(int num){
		sum += num;
		System.out.println(sum);
	}
	
	//使用静态同步函数
	//相当于默认在synchronized后面有Bank.class充当锁
	public synchronized static void addMoney2(int num){
		sum += num;
		System.out.println(sum);
	}
}

class CunQian implements Runnable{
	Bank bank = new Bank();
	public void run() {
		for(int i=0;i<3;i++){
			bank.addMoney(100);
		}
	}
}
