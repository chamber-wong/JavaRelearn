package homework;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("��Ϊѡ�ִ��:");
		int[] nums = new int[10];
		for(int i = 0;i < 10 ; i++) {
			nums[i] = scanner.nextInt();
		}
		
		HomeWork2 hw = new HomeWork2();
		//������������ֵ�޳�
		int[] nums1 = hw.newArray(nums, hw.getMaxIndex(nums));
		//����������С��ֵ�޳�
		int[] nums2 = hw.newArray(nums1, hw.getMinIndex(nums1));
		//��ƽ����
		int avg = hw.getSum(nums2) / 8;
		System.out.println("����ƽ����Ϊ:"+ avg);
		
	}
	/**
	 * ��ȡ���������������±�
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
	 * ��ȡ��������С�������±�
	 * @param nums
	 * @return
	 */
	public int getMinIndex(int[] nums) {
		int min = nums[0];
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
				index = i;
			}
		}
		return index;
	}
	/**
	 * ���ݲ���ɾ�������е�����
	 * @param nums
	 * @return
	 */
	public int[] newArray(int[] nums,int index) {
		for (int i = 0; i < nums.length; i++) {
			if (i == index) {
				for(int j = i; j<nums.length-1;j++) {
					nums[j] = nums[j+1];
				}
			}
		}
		int[] newArray = new int[nums.length-1];
		for (int i = 0; i < nums.length-1; i++) {
			newArray[i] = nums[i];
		}
		return newArray;
	}
	/**
	 * ��ȡ�����������ֵĺ�
	 * @param nums
	 * @return
	 */
	public int getSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}

}
