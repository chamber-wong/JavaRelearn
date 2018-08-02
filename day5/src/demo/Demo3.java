package com.qianfeng.test;

public class Demo3 {
	public static void main(String[] args) {
		/*
		 * 查找排序
		 * 默认都是升序
		 * 冒泡排序
		 * 选择排序
		 */
		 //* 冒泡排序
		int[] arr1 = new int[]{3,1,5,2};
		bubbleSort(arr1);
		for (int i : arr1) {
			System.out.print("冒泡排序:"+i);
		}
		
		System.out.println();
		 //* 选择排序
		int[] arr2 = new int[]{3,1,5,2};
		SelectSort(arr2);
		for (int i : arr2) {
			System.out.print("选择排序:"+i);
		}
	}
	
    //* 冒泡排序
	public static void bubbleSort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {//确定的整体的次数,比元素的个数少一次
			for(int j=0;j<arr.length-1-i;j++){//确定一个元素的时候需要比较的次数
				//当前面的数比后面的数大,交换两个数的值
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
	}
	 //* 选择排序
	public static void SelectSort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {//确定的整体的次数,比元素的个数少一次
			for(int j=i;j<arr.length-1;j++){//确定一个元素的时候需要比较的次数
				//当前面的数比后面的数大,交换两个数的值
				if (arr[i] > arr[j+1]) {
					arr[i] = arr[i] ^ arr[j+1];
					arr[j+1] = arr[i] ^ arr[j+1];
					arr[i] = arr[i] ^ arr[j+1];
				}
			}
		}
	}
}
