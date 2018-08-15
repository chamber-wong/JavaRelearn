package com.qianfeng.test;
/*
 * 创建线程的两种方式:
 * 1.创建Thread类的子类--让run留在了线程类的内部,操作不方便
 * 2.线程与任务分离--让任务与线程分离,好处:哪个线程工作,就将哪个线程交给谁,操作方便
 * 
 * 实例:四个售票员同时售票
 * 
 */
//第一种:创建Thread类的子类
//public class Demo3 {
//	public static void main(String[] args) {
//			Seller seller1 = new Seller();
//			Seller seller2 = new Seller();
//			Seller seller3 = new Seller();
//			Seller seller4 = new Seller();
//			
//			seller1.start();
//			seller2.start();
//			seller3.start();
//			seller4.start();
//	}
//}
//
//class Seller extends Thread{
//	static int num = 40;
//	public void run() {
//		for(int i=0;i<10;i++){
//			System.out.println(Thread.currentThread().getName()+"  i:"+i+"   "+ --num);
//		}
//	}
//}

//第二种方式:线程与任务分离:
public class Demo3{
	public static void main(String[] args) {
		//1.先创建一个任务类对象
		Ticket ticket = new Ticket();
		
		//2.创建线程并绑定任务
		/*
		 * 如果我们自己创建了独立的任务类,线程会优先调用我们手动传入的任务类对象的run方法,不会再去调用Thread类默认的run方法
		 */
		Thread thread1 = new Thread(ticket);
		Thread thread2 = new Thread(ticket);
		Thread thread3 = new Thread(ticket);
		Thread thread4 = new Thread(ticket);
		
		//开启线程
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}

//创建任务类
class Ticket implements Runnable{
	//因为Ticket对象被4个线程共享,所以num也被共享
    int num = 40;
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"  i:"+i+"   "+ --num);
		}
    }
}


