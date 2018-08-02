package day2homework;

public class HomeWork14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sub = 0;
		for (int i =1 ;i<100 ; i++) {
			if((i%7==0 || i%3==0) &&  !(i%7==0 && i%3==0)) {
				sub += i;
			}
		}
		System.out.println(sub);
	}

}
