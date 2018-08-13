package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo5 {
	public static void main(String[] args) {
		/*
		 * 增强for循环:数组,Collection,Map
		 * for(元素类型  变量:数组/Collection){
		 * 		循环体
		 * }
		 * 
		 * 注意:对于Map要进行特殊的处理:要先转成对应的Set,才能使用增强for循环
		 */
		
		//遍历数组
		int[] arr = {3,45,6,8,9};
		for (int i : arr) {
			System.out.println("数组:"+i);
		}
		
		//遍历Collection
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("php");
		
		for (String string : list) {
			System.out.println("list:"+string);
		}
		
		//遍历Map
		TreeMap<String, String> map = new TreeMap<>();
		map.put("01", "php");
		map.put("02", "php2");
		map.put("05", "php5");
		
		//先转成set
		Set<Map.Entry<String, String>> set = map.entrySet();
		for (Map.Entry<String, String> entry : set) {
			System.out.println("map:"+entry.getValue());
		}
	}
}
