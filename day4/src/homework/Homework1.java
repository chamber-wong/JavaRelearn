package homework;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请连续输入十个数字:");
		int[] nums = new int[10];
		for(int i = 0;i < 10 ; i++) {
			nums[i] = scanner.nextInt();
		}
		Homework1 hw = new Homework1();
		hw.getMax(nums);
		scanner.close();
	}
	public void getMax(int[] nums) {
		int max = nums[0];
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
				index = i;
			}
		}
		System.out.println("最大值为:" + max);
		System.out.println("这个值的下标为:" + index);
	}
}
