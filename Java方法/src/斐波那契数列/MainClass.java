package 斐波那契数列;
/**
 * 使用递归计算斐波那契数列
 * 
 * @author 弄风
 *
 */
public class MainClass {

	public static void main(String[] args) {
		int count = 9;
		System.out.printf("第%d个斐波那契楔子是:%d", count,fibonacci(count));
	}
	public static long fibonacci(int count) {
		long l = 0;
		if (count-1 == 0 || count-1 == 1) {
			return count;
		}else {
			return fibonacci(count-2)+fibonacci(count-1);
		}
	}

}
