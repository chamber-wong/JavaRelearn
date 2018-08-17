package 查看线程是否存活;

public class MainClass {
	public static void main(String[] args) {
		IsAliveThread isAliveThread = new IsAliveThread();
		isAliveThread.setDaemon(true);
		isAliveThread.start();
		
		while (true) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (isAliveThread.isAlive()) {
				System.out.println("IsAliveThread,还活着");
			}
			System.out.println("main将要死亡~");
			break;
		}
		
	}
}

class IsAliveThread extends Thread{
	public void run() {
		while (true) {
			System.out.println("输出了一句话!");
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}