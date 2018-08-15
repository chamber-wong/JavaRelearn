package wang.chamber.homework;

import java.util.Random;

public class HomeWork2 {
	public static void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt(10);
		System.out.print(i);
		RandomThread randomThread = new RandomThread();
		randomThread.start();
	}
}
class RandomThread extends Thread{

	public void run() {
		Random random = new Random();
		int i = random.nextInt(26)+97;
		char c = (char)i;
		System.out.println(c);
	}
	
}