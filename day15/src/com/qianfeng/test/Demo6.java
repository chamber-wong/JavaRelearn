package com.qianfeng.test;

import java.util.Arrays;
import java.util.List;

public class Demo6 {
	public static void main(String[] args) {
		/*
		 * Arrays:数组工具类,内部封装了大量操作数组的方法(排序,查找,求最大值等)
		 */
		
		//简单数据类型的数组转成字符串--方便查看数组里面的内容
		int[] arr = {4,56,2,4,7};
		System.out.println(arr.toString());//默认打印的是数组的地址
		String string = Arrays.toString(arr);
		System.out.println(string+1);//数组被转成了字符串
		
		//数组转集合?---
		//简单数据类型的数组转集合
		int[] arr1 = {4,56,2,4,7};
		List<int[]> list =  Arrays.asList(arr1);
		System.out.println(list.size());//返回 1,说明将数组的整体当做一个元素存入了集合.
		
		//引用数据类型的数组转集合
		String[] strings = {"aa","bb","dd"};
		List<String> list2 =  Arrays.asList(strings);
		System.out.println(list2.size());//返回3,说明转化后集合的元素与原数组的元素一一对应
		
		//注意点:从数组转成的集合,长度是固定.所以不能增加或删除.但是可以修改,遍历
		//list2.add("rr");//UnsupportedOperationException
		list2.set(0, "java");
		System.out.println(list2);
		
		//二分查找
		int[] arr3 = {4,5,7,10,23};
		int index = Arrays.binarySearch(arr3, 4);
		System.out.println(index);
	}
}
