package com.qianfeng.homework;

public class HomeWork1 {

	public static void main(String[] args) {
		GetMoney getMoney = new GetMoney();
		Thread thread1 = new Thread(getMoney);
		Thread thread2 = new Thread(getMoney);

		thread1.start();
		thread2.start();

		try {
			Thread.sleep(2000);
			Account account = Account.getAccount();
			System.out.println(account.getBanlance());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class GetMoney implements Runnable {
	Account account = Account.getAccount();

	public synchronized void run() {
		for (int i = 0; i < 10; i++) {
			account.setBanlance(1000);
			System.out.println(Thread.currentThread().getName() + "  余额为:" + account.getBanlance());
		}

	}

}

class Account {
	private int banlance = 20000;
	private static Account account = null;

	private Account() {

	}

	public static Account getAccount() {
		if (account == null) {
			account = new Account();
		}
		return account;
	}

	public int getBanlance() {
		return banlance;
	}

	public void setBanlance(int banlance) {
		this.banlance -= banlance;
	}

}