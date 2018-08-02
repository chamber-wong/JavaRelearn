package day2homework;

public class HomeWork13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub = 0;
		for (int i =1 ;i<1000 ; i++) {
			if(i % 3 ==0 && i % 5 ==0 && i % 7 == 0) {
				sub += i;
			}
		}
		System.out.println(sub);
	}

}
