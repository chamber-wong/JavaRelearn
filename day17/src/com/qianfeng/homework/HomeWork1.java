package com.qianfeng.homework;

/*
 * 设计4个线程，其中两个线程每次对j增加1，另外两个线程对j每次减少1。写出程序。 
 * 注：因为这4个线程共享J，所以线程类要写到内部类中。
 * 加线程：每次对j加一。
 * 减线程：每次对j减一。
 */
public class HomeWork1 {
	public static void main(String[] args) {
		Num num = new Num();

		Plus plus = new Plus(num);
		Subtract subtract = new Subtract(num);

		Thread thread1 = new Thread(plus);
		Thread thread2 = new Thread(subtract);

		thread1.start();
		thread2.start();
	}
}

class Plus implements Runnable {
	Num num;

	public Plus(Num num) {
		super();
		this.num = num;
	}

	public void run() {
		while (true) {
			num.plusJ();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Subtract implements Runnable {
	Num num;

	public Subtract(Num num) {
		super();
		this.num = num;
	}

	public void run() {
		while (true) {
			num.subtractJ();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

class Num {
	private int j;

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public void plusJ() {
		j++;
		System.out.println("J加一的值为:" + j);
	}

	public void subtractJ() {
		j--;
		System.out.println("J减一的值为:" + j);
	}

}
