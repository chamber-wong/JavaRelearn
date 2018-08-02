package day2homeworkOther;

public class HomeWork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1;
		double b = 2;
		double sum = 0;
		for(int i = 1;i<=20;i++) {
			sum += b/a;
			double c = a;
			a = b;
			b = c + b;
		}
		System.out.println("这个数列的前20项和为:"+sum);
		
	}

}
