package homework;

import java.util.Arrays;

public class HomeWork5 {
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		int[][] sanYuan = sanYuanArray(nums);
		for (int[] is : sanYuan) {
			for (int i : is) {
				if(i != 0)
					System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	public static int[][] sanYuanArray(int[] nums) {
		int index = 0;
		int[][] indexes = new int[4][3];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				for (int j2 = j+1; j2 < nums.length; j2++) {
					if ((nums[i] + nums[j] + nums[j2]) == 0) {
						indexes[index][0] = nums[i];
						indexes[index][1] = nums[j];
						indexes[index][2] = nums[j2];
						index++;
					}
				}
			}
		}
		return indexes;
	}
}
