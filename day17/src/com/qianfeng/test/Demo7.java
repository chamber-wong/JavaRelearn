package com.qianfeng.test;
/*
 * 线程的停止:如何结束他的任务
 * 1.通过一个标识结束线程
 * 2.调用stop方法--有固有的安全性问题,系统不推荐使用.
 * 3.调用interrupt()方法
 * 
 */
//第一种方式演示
//public class Demo7 {
//	public static void main(String[] args) {
//		Test test = new Test();
//		Thread thread = new Thread(test);
//		thread.start();
//		
//		//让主线程睡一会儿
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		int i = 0;
//		while (true) {
//			if (++i == 10) {
//				test.flag = false;//当主线程执行到某个阶段时,让flag变成false,子线程的任务就会结束,子线程就结束了.
//				
//				break;//目的是让主线程结束
//			}
//		}
//	}
//}
//
//class Test implements Runnable{
//	boolean flag = true;
//	public void run() {
//		while (flag) {
//			System.out.println(Thread.currentThread().getName()+" 该下课了");
//		}
//		
//	}
//}

//第三种方式演示
public class Demo7 {
	public static void main(String[] args) {
		Test test = new Test();
		Thread thread = new Thread(test);
		thread.start();
		
		//让主线程睡一会儿
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int i = 0;
		while (true) {
			if (++i == 10) {
				thread.interrupt();//当主线程执行到某个阶段时,掉用子线程的interrupt方法,触发子线程的异常(InterruptedException),让子线程的任务结束,子线程就结束了.
				
				break;//目的是让主线程结束
			}
		}
	}
}

class Test implements Runnable{
	boolean flag = true;
	public synchronized void run() {
		while (flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				flag = false;
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" 该下课了");
		}
		
	}
}
