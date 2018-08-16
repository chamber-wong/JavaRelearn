package com.qianfeng.test;
/*
 * 生产者消费者
 * 分类:
 * 单生产者单消费者
 * 多生产者的消费者
 * 
 * 
 * 单生产者单消费者:
 * 两个线程:生产线程,消费线程
 * 两个任务:生产任务,消费任务
 * 一份数据
 */
public class Demo4 {
	public static void main(String[] args) {
		//1.准备数据
		Product product = new Product();
		//2.创建生产消费任务
		Producer producer = new Producer(product);
		Consumer consumer = new Consumer(product);
		//3.创建生产消费线程
		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);
		//4.开启线程
		thread1.start();
		thread2.start();
	}
}

//数据类
class Product{
	String name;
	double price;
	int count;
	
	//标识
	boolean flag;
	
	//准备生产
	public synchronized void setProduce(String name,double price) {
		if (flag == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.name = name;
		this.price = price;
		
		System.out.println(Thread.currentThread().getName()+"  生产了:"+name+"  产品的数量:"+count+"  产品的价格:"+price);
		
		count++;
		
		flag = !flag;
		
		//唤醒消费线程
		notify();
	}
	//准备消费
	public synchronized void consume() {
		if (flag == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+"  消费了:"+name+"  产品的数量:"+count+"  产品的价格:"+price);
		
		flag = !flag;
		
		//唤醒生产线程
		notify();
	}
}
//生产任务
class Producer implements Runnable{
	Product product;

	public Producer(Product product) {
		super();
		this.product = product;
	}
	
	public void run() {
		while (true) {
			product.setProduce("bingbing", 10);
		}
	}
}
//消费任务

class Consumer implements Runnable{
	Product product;

	public Consumer(Product product) {
		super();
		this.product = product;
	}
	
	public void run() {
		while (true) {
			product.consume();
		}
	}
}
