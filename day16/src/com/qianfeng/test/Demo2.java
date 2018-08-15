package com.qianfeng.test;
/*
 * 默认情况下,JVM有主线程和垃圾回收线程,但是他们都是由系统创建的,为了完成我们自己的任务,要创建自己的线程
 * java将程序面向对象了,形成的类就是Thread类.在Thread类内部完成工作的任务区就是run方法.
 * 
 * 注意点:我们如果想让run作为任务区,必须通过执行start方法,让run自动执行.不能手动调用.
 */
public class Demo2 {
//	public static void main(String[] args) {//一个有几个线程?两个.一个主线程,垃圾回收线程.但是一般暂时忽略垃圾回收线程
//		//1.通过Thread类直接创建线程
//		Thread thread1 = new Thread();//创建了一个线程
//		Thread thread2 = new Thread();//创建了一个线程
//		
//		//2.调用start方法
//		thread1.start();//两个线程
//		thread2.start();//三个线程
//		
//		System.out.println("main");
//	}
	
	public static void main(String[] args) {
		//2.通过Thread类的子类创建线程
		MyThread thread1 = new MyThread("bingbing");//创建了一个线程
		MyThread thread2 = new MyThread("yingying");//创建了一个线程
		
		//2.调用start方法
		thread1.start();//两个线程---thread-0
		thread2.start();//三个线程---thread-1
		
		
		//主线程的工作--main
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"   run:main"+"  i:"+i);
		}
		
		/*
		 * 手动调用run方法,他只是一个普通方法,不代表任务区.只有被自动调用的时候才代表任务区
		 * 手动调用时:在哪里调用的这行代码,run方法内部就代表哪个线程.
		 * 
		 */
		//thread1.run();
	}
}

//创建Thread类的子类
class MyThread extends Thread{
	String myname;
	public MyThread(String myname) {
		super();
		this.myname = myname;
	}
	/*
	 * 重写run方法--作为任务区.完成我们自己的功能
	 * Thread.currentThread():获取的是当前的线程
	 * .getName:是系统给的名字
	 */
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+"   run:"+myname+"  i:"+i);
		}
	}

}


