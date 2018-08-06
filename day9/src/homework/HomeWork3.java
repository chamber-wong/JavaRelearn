package homework;

import java.util.Arrays;

public class HomeWork3 {

	public static void main(String[] args) {
		int[] arrs = {0,1,2,5,0,9};
		getZero(arrs);
		System.out.println(Arrays.toString(arrs));
	}
	public static void getZero(int[] arrs) {
		for (int i = 0; i < arrs.length; i++) {
			if(arrs[i] == 0) {
				for (int j = i; j < arrs.length-1; j++) {
					arrs[j] = arrs[j] ^ arrs[j+1];
					arrs[j+1] = arrs[j] ^ arrs[j+1];
					arrs[j] = arrs[j] ^ arrs[j+1];
				}
			}
		}
	}

}
