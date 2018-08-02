package homework;

import java.util.Scanner;

public class HomeWoek3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请问要计算第几次落地时经历的总距离?");
		double num = scanner.nextDouble();
		double sum = 0.0;
		double height = 100.0;
		for(int i = 0; i<num*2-1; i++) {
			sum += height;
//			if (i % 2 == 0) {
//				height /= 2.0;
//			}
			height /= 2.0;
			
		}
		System.out.println((sum-100)*2+100);
		scanner.close();
	}
}
