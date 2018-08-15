package 测试;

import java.util.concurrent.Callable;

public class TestThread1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.run();
		t.start();
		System.out.println("Thread Test");
	}
}

class MyThread extends Thread {
	public void run() {
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("MyThread running");
	}
}

class TestRunnable implements Runnable {
	private Thread thread;

	public TestRunnable(String theadName) {

	}

	public void run() {
		System.out.println("线程开始运行");
	}

	public void start() {
		System.out.println("线程开始");
		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}

	}
}

class TestThread extends Thread {
	public void run() {
		System.out.println("线程Running");
		this.getName();
	}
}

class TestCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return null;

	}

}
