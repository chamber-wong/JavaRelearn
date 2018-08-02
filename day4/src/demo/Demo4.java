package demo;

import java.util.Scanner;

import javax.imageio.ImageTypeSpecifier;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		System.out.println(getMax(a, b, c));
	}
	public static double getMax(double a,double b,double c) {
		double max = a;
		if (b>=max) {
			max = b;
		}
		if(c >= max) {
			max = c;
		}	
		
		return max;
	}

}
