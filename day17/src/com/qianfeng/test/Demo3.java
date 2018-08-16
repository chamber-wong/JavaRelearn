package com.qianfeng.test;
/*
 * 两个线程的通信:
 * 实例:打印机打印--不断的输入不断的输出
 * 分析:
 * 两个线程:输入线程,输出线程
 * 两个任务:输入任务,输出任务
 * 一份数据
 * 
 * 
*继续实现一次打印一次输出
 *使用唤醒等待机制---notify()/notifyAll()/wait()
 *wait():让当前的线程变成等待的状态,放入一个池子(线程池),失去了抢cpu的能力,.等待唤醒(锁相当于给当前的线程做了一个标记)
 *
 *notify():让当前的线程从等待状态唤醒,相当于从池子中取出线程.(唤醒的是同一把锁下的任意一个线程)
 *
 *notifyAll():唤醒的是同一把锁下的所有线程
 **/
public class Demo3 {
	public static void main(String[] args) {
		//0.创建数据类对象
		Des1 des = new Des1();
		
		//1.创建任务
		Input1 input = new Input1(des);
		Output1 output = new Output1(des);
		
		//2.将任务交给线程
		Thread inputThread = new Thread(input);
		Thread outputThread = new Thread(output);
		
		//3.开启线程
		inputThread.start();
		outputThread.start();
	}
}

//创建数据类
class Des1{
	String name;
	String sex;
	
	boolean flag=false;//创建一个标识,控制等待与唤醒之间的切换
	
	/*
	 * 需要给输入任务和输出任务同时加一把锁,保证两个任务之间是同步的
	 * 给两个任务加一把锁:可以是des或者Object.class
	 * 分析:
	 * 不建议使用Object.class:由于Object的使用范围太大,可能造成不必要的错误.
	 * 使用des最合适,因为他只被当前的两个任务共享.
	 * 
	 *注意:对于当前的情况只给一个线程加锁,无法实现两个线程的同步.
	 */
	//处理输入
	public synchronized void setData(String name,String sex){
		if (flag == true) {//当 flag值为true的时候,让输入线程处于等待状态
			try {
				//在执行代码的时候,这里对应的是哪个线程,锁对象操作的就是哪个线程.
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.name = name;
		this.sex = sex;
		//将表示改成true
		flag = !flag;
		//将输出线程唤醒
		//在唤醒的时候,在线程池中没有找到当前锁标记的线程.我们称为空唤醒,程序允许空唤醒.
		notify();
	}
	
	//处理输出
	public synchronized void getData(){
		if (flag == false) {//当 flag值为false的时候,让输出线程处于等待状态
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("姓名:"+name+"    性别:"+sex);
		
		flag = !flag;
		
		notify();//唤醒的输入线程
	}
}

//创建输入任务
class Input1 implements Runnable{
	Des1 des;
	public Input1(Des1 des) {
		super();
		this.des = des;
	}
	public void run() {
		int i=0;
		while (true) {
			if (i==1) {
				des.setData("特没谱", "男");
			}else {
				des.setData("安倍小三", "女");
			}
			
			i = (i+1)%2;
		}
	}
}
//输出任务
class Output1 implements Runnable{
	Des1 des;
	public Output1(Des1 des) {
		super();
		this.des = des;
	}
	public void run() {
		while (true) {
			 des.getData();
		}
	}
}
