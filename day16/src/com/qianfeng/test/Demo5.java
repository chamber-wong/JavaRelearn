package com.qianfeng.test;
/* 线程安全问题:
* 分析:4个线程共用了一个数据,出现了-1,-2,-3等错误的数据
* 
* 具体分析:1.共用了一个数据
* 2.共享语句有多条,一个线程使用cpu,没有使用完,cpu被抢走,当再次抢到cpu的时候,直接执行后面的语句,造成了错误的发生.
* 
 解决:
 在代码中使用同步代码块儿(同步锁)
 解释:在某一段任务中,同一时间只允许一个线程执行任务,其他的线程即使抢到了cpu,也无法进入当前的任务区间,只有当当前的线程将任务执行完后,
 其他的线程才能有资格进入
 
 同步代码块儿的构成:
 synchronized(锁(对象)){
 	  同步的代码
 }
 
 对作为锁的对象的要求:1.必须是对象      2.必须保证被多个线程共享
 可以充当锁的:1.一个普通的对象      2.当前对象的引用--this    3.类的字节码文件
 
 同步代码块儿的特点:1.可以保证线程的安全     2.由于每次都要进行判断处理,所以降低了执行效率
 
 总结:什么时候使用同步代码块儿
 1.多个线程共享一个数据
 2.至少有两个线程
*/
 
//第二种方式:线程与任务分离:
public class Demo5{
	public static void main(String[] args) {
		//1.先创建一个任务类对象
		Ticket1 ticket = new Ticket1();
		
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
class Ticket1 implements Runnable{
	//因为Ticket对象被4个线程共享,所以num也被共享
    int num = 20;
    boolean wan = false;
    //充当锁--这里的内容是被共享的
    //条件:1.必须是对象   2.必须被多个线程共享
    Object object = new Object();
	public void run() {
		
		while(!wan){
			synchronized (object) {//叫同步代码块儿---相当于让线程之间形成互斥的关系
				//制造一个延迟,相当于让 当前的线程休息一会儿(临时让出cpu)
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if (num>0) {
					System.out.println(Thread.currentThread().getName()+"    "+ --num);
				}else {
					wan = true;
				}
			
			}
			
		}
    }
}


