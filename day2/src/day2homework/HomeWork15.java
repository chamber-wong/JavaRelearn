package day2homework;

public class HomeWork15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o = 0;
		for (int i = 1 ; i<100 ; i++) {
			if(i%7==0 && i%2 == 1) {
				o++;
			}
		}
		System.out.println(o);
	}

}
