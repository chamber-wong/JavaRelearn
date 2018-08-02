package com.qianfeng.test;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * 一维数组:内部直接存储的是数据
		 * 二维数组:内部存储的是多个一维数组的地址(二维数组中就是多个一维数组)
		 * 
		 */
		
		//创建一维数组
		int[] arr = new int[]{3,4,5};
		
		//创建二维数组--空的二维数组
		/*
		 * 二维数组与一维数组一样都是数据类型
		 * 二维数组类型的构成:数据类型+[]+[]
		 * =后面的构成:new + [一维数组的个数] +[一维数组中元素的个数]
		 * 注意点:第一个[]中必须填,第二个[]中的值可以省略.如果写了,代表一个建议的值
		 */
		int[][] arr1 = new int[2][];
		
		//存值--根据下标
		arr1[0] = new int[]{3,4,5};
		arr1[1] = new int[]{3,4};
		
		//取值  构成:数组的名字+[一维数组的下标]+[一维数组中元素的下标]
		int value = arr1[0][0];
		System.out.println(value);
		
		//遍历
		for (int i = 0; i < arr1.length; i++) {//控制的一维数组的个数
			for(int j=0;j<arr1[i].length;j++){//控制的是一维数组的元素
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		
		/*
		 * 增强for循环:开始循环后先从数组中取出第一个元素,放入:前面的变量中.当次循环在使用变量的时候,使用的就是这个值.
		 * 第一次循环结束会自动从数组中取出第二个元素,再次放入:前面的变量中,依次进行,直到所有的元素遍历完.停止循环.
		 */
		for (int[] is : arr1) {
			for (int i : is) {
				System.out.print("增强for循环:"+i);
			}
			System.out.println();
		}
		
		//其他的创建方法:
		int[][] arr2 = {{4,5},{6,7,8}};
	}
}
