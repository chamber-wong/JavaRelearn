package 线程优先级设置;

public class MainClass {
	public static void main(String[] args) {
		Thread thread = new Thread(new A());
		Thread thread2 = new Thread(new B());
		
		thread.setPriority(1);
		thread2.setPriority(3);
		
		thread.start();
		thread2.start();
		
	}
}

class A implements Runnable {
	public void run() {
		for (;;) {
			System.out.println("A");
		}
	}
}

class B implements Runnable {
	public void run() {
		for (;;) {
			System.out.println("B");
		}
	}
}