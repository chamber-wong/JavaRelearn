package homework;

public class HomeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10};
		HomeWork3 hWork3 = new HomeWork3();
		int maxIndex = hWork3.getMaxIndex(nums);
		System.out.println(maxIndex);
		int nextMaxIndex = hWork3.getNextMax(nums, maxIndex);
		System.out.println(nextMaxIndex);
	}
	
	/**
	 * 获取数组中最大的数的下标
	 * @param nums
	 * @return
	 */
	public int getMaxIndex(int[] nums) {
		int max = nums[0];
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}
		return index;
	}
	/**
	 * 根据传入的参数,返回仅小于此数的数
	 * @param nums
	 * @param num
	 * @return
	 */
	public int getNextMax(int[] nums,int num) {
		int nextMax = 0;
		int nextMaxIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] <= nums[num]) {
				nextMax = nums[i];
				break;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > nextMax && nums[i] < nums[num]) {
				nextMax = nums[i];
				nextMaxIndex = i;
			}
		}
		return nextMaxIndex;
	}
}
