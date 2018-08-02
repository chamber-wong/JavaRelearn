package com.qianfeng.test;

public class Demo4 {
	public static void main(String[] args) {
		//查找 
		/*
		 * 注意点:1.查到值时-返回下标
		 * 2.查不到值--返回-1
		 * 3.有相同的值时--返回查到的第一个值的下标,停止查找
		 * 
		 * 普通查找:
		 * 二分查找:
		 */
		 //* 普通查找:
		int[] arr = {2,5,1,7,9};
		int value1 = search(arr,9);
		System.out.println("普通查找:"+value1);
		 //* 二分查找:数组必须是有序的
		int[] arr1 = {3,5,7,9,19};
		int value2 = erFenSerach(arr1,19);
		System.out.println("二分查找:"+value2);
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
