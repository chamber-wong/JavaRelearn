package com.qianfeng.test;
/*
 * 生产者消费者
 * 分类:
 * 单生产者单消费者----会
 * 多生产者多消费者----了解
 * 
 * 
 * 多生产者多消费者:
 * 两个生产线程,两个消费线程
 * 两个任务:生产任务,消费任务
 * 一份数据
 * 
 * 生产任务与消费任务共用一个数据--产品类
 * 
 * 要求:最终也要实现一次生产一次消费
 * 
 *错误描述:当有两个生产线程,两个消费线程同时存在的时候,有可能出现生产一次,消费多次或者生产多次消费一次的情况.
 *原因:当线程被重新唤醒之后,没有判断标记,直接执行了下面的代码
 *
 *解决办法:将标记处的if改成while
 *
 *问题描述:继续运行程序,会出现死锁的情况(4个线程同时处于等待状态)
 *原因:唤醒的是本方的线程,最后导致所有的线程都处于等待状态.
 *
 *解决办法:将notify改成notifyAll.保证将对方的线程唤醒
 *
 *死锁:出现的情况有两种
 *1.所有的线程处于等待状态
 *2.锁之间进行嵌套调用
 *
 */
public class Demo5 {
	public static void main(String[] args) {
		//1.准备数据
		Product1 product = new Product1();
		//2.创建生产消费任务
		Producer1 producer = new Producer1(product);
		Consumer1 consumer = new Consumer1(product);
		//3.创建生产消费线程
		Thread thread0 = new Thread(producer);
		Thread thread1 = new Thread(producer);
		Thread thread2 = new Thread(consumer);
		Thread thread3 = new Thread(consumer);
		//4.开启线程
		thread0.start();
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

//数据类
class Product1{
	String name;
	double price;
	int count;
	
	//标识
	boolean flag;
	
	//准备生产
	public synchronized void setProduce(String name,double price) {
		while (flag == true) {
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
		//notify();
		notifyAll();
	}
	//准备消费
	public synchronized void consume() {
		while (flag == false) {
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
		//notify();
		notifyAll();
	}
}
//生产任务
class Producer1 implements Runnable{
	Product1 product;

	public Producer1(Product1 product) {
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

class Consumer1 implements Runnable{
	Product1 product;

	public Consumer1(Product1 product) {
		super();
		this.product = product;
	}
	
	public void run() {
		while (true) {
			product.consume();
		}
	}
}
