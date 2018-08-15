package wang.chamber.homework;

public class HomeWork4 {
	public static void main(String[] args) {
		Num num = new Num();

		A a = new A(num);
		B b = new B(num);

		Thread thread1 = new Thread(a);
		Thread thread2 = new Thread(b);

		thread1.start();
		thread2.start();
	}
}

class Num {
	boolean flag = false;
}

class A extends Thread {
	Num num;

	public A(Num num) {
		this.num = num;
	}

	public void run() {

		synchronized (num) {
			for (int i = 10; i >= 1; i--) {

				if (!num.flag) {
					try {
						num.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("NumberThread:" + i);
				num.flag = false;
				num.notifyAll();

			}
		}
		
	}
}

class B extends Thread {
	Num num;

	public B(Num num) {
		this.num = num;
	}

	public void run() {

		synchronized (num) {
			for (int i = 1; i <= 10; i++) {
				if (num.flag) {
					try {
						num.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("main:" + i);
				num.flag = true;
				num.notifyAll();

			}
		}
		
	}
}
