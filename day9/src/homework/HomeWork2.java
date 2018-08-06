package homework;

import java.util.Arrays;

/**
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 
 * @author 弄风
 *
 */
public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrs = {1,2,7,8,9,10};
		int[] indexes = getSub(arrs, 12);
		if (indexes[0]!=0 && indexes[1]!=0) {
			System.out.println(Arrays.toString(indexes));
		}else {
			System.out.println("没有找到这样的值");
		}

	}
	public static int[] getSub(int[] arrs,int target) {
		int[] indexes = new int[2];
		for (int i = 0; i < arrs.length; i++) {
			for (int j = i+1; j < arrs.length; j++) {
				if ((arrs[i] + arrs[j]) == target) {
					indexes[0] = i;
					indexes[1] = j;
					break;
				}
			}
		}
		return indexes;
		
		
	}

}
