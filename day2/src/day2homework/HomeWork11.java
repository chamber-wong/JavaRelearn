package day2homework;

public class HomeWork11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1;i<1000;i++) {
			if(i%2 == 1) {
				sum += i;
			}
		}
		System.out.println("0-1000所有奇数的和为:"+sum);
	}

}
