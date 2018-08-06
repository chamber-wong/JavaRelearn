package homework;


public class HomeWork4 {
	public static void main(String[] args) {
		String string = "this is Chamber's blog";
		String[] arrs = string.split(" ");
		daoxu(arrs);
		for (String string2 : arrs) {
			System.out.print(string2+" ");
		}
		
	}
	public static void daoxu(String[] arrs) {
		for (int i = 0; i < arrs.length / 2; i++) {
			String temp = arrs[i];
			arrs[i] = arrs[arrs.length - 1 - i];
			arrs[arrs.length - 1 - i] = temp;
		}
	}
}
