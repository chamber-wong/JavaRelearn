package com.qianfeng.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * wait,notify,notifyall必须是在同步的前提下才能使用
 * 
 * 
 * 研究:研究Lock
 * 比较synchronized和Lock
 * 1.synchronized:从jdk1.0就开始使用的同步方法-称为隐式同步
 * 	synchronized(锁对象){//获取锁      我们将锁还可以称为锁旗舰或者监听器
 * 		同步的代码
 * }//释放锁
 * 2.Lock:从jdk1.5开始使用的同步方法-称为显示同步
 * 
 * 原理:Lock本身是接口,要通过他的子类创建对象干活儿
 *  使用过程:
 *  首先调用lock()方法获取锁
 *    进行同步的代码块儿
 *  使用unlock()方法释放锁
 *  
 *  使用的场景:
 *  当进行多生产者多消费者的功能时,使用Lock,其他的都使用synchronized
 *  
 *  使用效率上:Lock高于synchronized
 */
public class Demo6 {
	public static void main(String[] args) {
		//1.准备数据
		Product2 product = new Product2();
		//2.创建生产消费任务
		Producer2 producer = new Producer2(product);
		Consumer2 consumer = new Consumer2(product);
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
class Product2{
	String name;
	double price;
	int count;
	
	//标识
	boolean flag;
	
	//创建锁对象
	Lock lock = new ReentrantLock();
	
	//获取为生产任务提高唤醒等待的Condition对象
	Condition conditionPro = lock.newCondition();
	//获取为消费任务提高唤醒等待的Condition对象
	Condition conditionCon = lock.newCondition();
	
	//准备生产
	public  void setProduce(String name,double price) {
		try {
			lock.lock();//获取锁
			while (flag == true) {
				try {
					conditionPro.await();//让生产线程等待
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
			//notifyAll();
			conditionCon.signal();
		
		} finally {//放的是必须执行的代码,用于资源的释放
			lock.unlock();//释放
		}
		
	}
	//准备消费
	public  void consume() {
		try {
			lock.lock();
			while (flag == false) {
				try {
					//wait();
					conditionCon.await();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(Thread.currentThread().getName()+"  消费了:"+name+"  产品的数量:"+count+"  产品的价格:"+price);
			
			flag = !flag;
			
			//唤醒生产线程
			//notify();
			//notifyAll();
			conditionPro.signal();
		} finally {
			lock.unlock();
		}
	}
}
//生产任务
class Producer2 implements Runnable{
	Product2 product;

	public Producer2(Product2 product) {
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

class Consumer2 implements Runnable{
	Product2 product;

	public Consumer2(Product2 product) {
		super();
		this.product = product;
	}
	
	public void run() {
		while (true) {
			product.consume();
		}
	}
}
