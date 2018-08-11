package Varargs可变参数;

public class MainClass {

	public static void main(String[] args) {
		// 测试
		// 两个参数
		int sum = sumVarargs(1, 2);
		System.out.println(sum);
		// 多个参数
		sum = sumVarargs(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(sum);
		// 直接传入数组
		int[] nums = { 1, 2, 3, 4, 5};
		sum = sumVarargs(nums);
		System.out.println(sum);
	}

	public static int sumVarargs(int... number) {
		int sub = 0;
		// 方法一:
		for (int i : number) {
			sub += i;
		}
		// 方法二:把接收到可变参数,转成数组存储
		for (int i = 0; i < number.length; i++) {
			sub += number[i];
		}
		return sub;
	}

}
