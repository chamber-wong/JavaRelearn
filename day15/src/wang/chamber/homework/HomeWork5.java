package wang.chamber.homework;

public class HomeWork5 {
	public static void main(String[] args) {
		HusbandThread hThread = new HusbandThread();
		hThread.start();
		WifeThread wThread = new WifeThread();
		wThread.start();

		Account account = Account.getAccount();
		try {
			while (true) {
				if (!hThread.isAlive() && !wThread.isAlive()) {
					System.err.println("最终账户的钱为:" + account.getBanlance());
					break;
				}
				Thread.sleep(300);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}

class HusbandThread extends Thread {
	@Override
	public void run() {
		Account account = Account.getAccount();
		for (int i = 1; i <= 100; i++) {
			System.out.println("丈夫第" + i + "次取钱前的余额为:" + account.getBanlance());
			account.setBanlance(100);
			System.out.println("丈夫第" + i + "次取钱后的余额为:" + account.getBanlance());
		}
	}
}

class WifeThread extends Thread {
	@Override
	public void run() {
		Account account = Account.getAccount();
		for (int i = 1; i <= 100; i++) {
			System.out.println("老婆第" + i + "次取钱前的余额为:" + account.getBanlance());
			account.setBanlance(100);
			System.out.println("老婆第" + i + "次取钱后的余额为:" + account.getBanlance());
		}
	}
}

class Account {
	private int banlance = 1000000;
	private static Account account = null;

	private Account() {

	}

	public static Account getAccount() {
		if (account == null) {
			synchronized (Account.class) {
				if (account == null) {
					account = new Account();
				}
			}
		}
		return account;
	}

	public int getBanlance() {
		return banlance;
	}

	public synchronized void setBanlance(int banlance) {
		this.banlance -= banlance;
	}

}
