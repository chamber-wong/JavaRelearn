package com.qianfeng.test;

public class Demo4 {
	public static void main(String[] args) {
		//注意点:
		Thread thread1 = new Thread();
		//Thread实现了Runnable接口,所以可以充当任务类
		Thread thread2 = new Thread(thread1);
		
		thread1.start();
		thread2.start();
		
		
		//通过匿名内部类对象实现线程的调用
		new Thread(){
			public void run() {
				System.out.println("sub-run");
			}
		}.start();
	}
}
