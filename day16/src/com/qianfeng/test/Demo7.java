package com.qianfeng.test;

public class Demo7 {
    public static void main(String[] args) {
		
	}
}

//饿汉式
class SingleInstance {
	private final static SingleInstance singleInstance = new SingleInstance();
	
	private SingleInstance(){
		
	}
	
	public static SingleInstance getInstance(){
		return singleInstance;//这里只有一行代码,所以不会发生线程安全问题
	}
}

//懒汉式
class SingleInstance1 {
	private static SingleInstance1 singleInstance = null;
	
	private SingleInstance1(){
		
	}
	
	public static SingleInstance1 getInstance(){
		if (singleInstance == null) {//写他的目的:尽量减少线程安全代码的判断次数,提高效率
			
			synchronized (SingleInstance1.class) {
				if (singleInstance == null) {
					singleInstance = new SingleInstance1();
				}
			}
			
		}
		return singleInstance;
	}
}

class Test implements Runnable{
	
	public void run() {
		SingleInstance singleInstance = SingleInstance.getInstance();
		
	}
}
