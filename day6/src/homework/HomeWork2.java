package homework;

import java.util.ArrayList;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 100; i<1000 ; i++) {
			if (getDoffodilNums(i)) {
				list.add(i);
			}
		}
		System.out.println(list);
	}
	public static boolean getDoffodilNums(int number) {
		int num = number;
		ArrayList<Integer> list = new ArrayList<>();
		while(num >= 1 ) {
			list.add(num%10);
			num /= 10;
		}
		int num1 = list.get(0) * list.get(0) * list.get(0);
		int num10 = list.get(1) * list.get(1) * list.get(1);
		int num100 = list.get(2) * list.get(2) * list.get(2);
		if ((num1 + num10 + num100) == number) {
			return true;
		}
		return false;
	}

}
