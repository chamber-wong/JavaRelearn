package 阶乘;
/**
 * 使用递归计算阶乘
 * @author 弄风
 *
 */
public class MainClass {
	public static void main(String[] args) {
		for (int i = 0; i < 11; i++) {
			System.out.printf("%d! = %d \n", i , factorial(i));
		}
	}
	public static long factorial(long number) {
		if (number == 0 || number == 1) {
			return 1;
		}else {
			return number * factorial(number-1);
		}
	}
}
