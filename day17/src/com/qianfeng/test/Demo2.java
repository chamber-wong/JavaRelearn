package com.qianfeng.test;
/*
 * 两个线程的通信:
 * 实例:打印机打印--不断的输入不断的输出
 * 分析:
 * 两个线程:输入线程,输出线程
 * 两个任务:输入任务,输出任务
 * 一份数据
 */
public class Demo2 {
	public static void main(String[] args) {
		//0.创建数据类对象
		Des des = new Des();
		
		//1.创建任务
		Input input = new Input(des);
		Output output = new Output(des);
		
		//2.将任务交给线程
		Thread inputThread = new Thread(input);
		Thread outputThread = new Thread(output);
		
		//3.开启线程
		inputThread.start();
		outputThread.start();
	}
}

//创建数据类
class Des{
	String name;
	String sex;
}

//创建输入任务
class Input implements Runnable{
	Des des;
	public Input(Des des) {
		super();
		this.des = des;
	}
	public void run() {
		/*
		 * 需要给输入任务和输出任务同时加一把锁,保证两个任务之间是同步的
		 * 给两个任务加一把锁:可以是des或者Object.class
		 * 分析:
		 * 不建议使用Object.class:由于Object的使用范围太大,可能造成不必要的错误.
		 * 使用des最合适,因为他只被当前的两个任务共享.
		 * 
		 *注意:对于当前的情况只给一个线程加锁,无法实现两个线程的同步.
		 */
		int i=0;
		while (true) {
			synchronized (des) {
				if (i==1) {
					des.name = "特没谱";
					des.sex = "男";
				}else {
					des.name = "安倍小三";
					des.sex = "女";
				}
				
				i = (i+1)%2;
			}
		}
	}
}
//输出任务
class Output implements Runnable{
	Des des;
	public Output(Des des) {
		super();
		this.des = des;
	}
	public void run() {
		while (true) {
			synchronized (des) {
			    System.out.println("姓名:"+des.name+"    性别:"+des.sex);
			}
		}
	}
}
