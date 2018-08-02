package com.qianfeng.test;

public class ArrayTools {
	
	//* 冒泡排序
	public static  void bubbleSort(int[] arr){
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
	
	//* 普通查找:
	public static int search(int[] arr,int key){
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		
		return -1;
	}
	 //* 二分查找:
	public  static int  erFenSerach(int[] arr,int key) {
		int l = 0;
		int h = arr.length-1;
		
		while(l<=h){
			int m = (l+h)>>1;
		    if (key == arr[m]) {
				return m;
			}else if (key > arr[m]) {
				l = m+1;
			}else if (key < arr[m]) {
				h = m-1;
			}   
		}
		
		return -1;//没有查到值
	}
}
