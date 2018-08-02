package homework;

public class HomeWork4 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					if ((i*100 + j*10 + k) + (k*100 + j*10 + i) == 1333) {
						System.out.println("a="+i+";b="+j+";c="+k+";");
						return;
					}
				}
			}
		}
	}
}
