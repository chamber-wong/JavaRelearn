package com.qianfeng.test;

import java.util.ArrayList;
import java.util.TreeMap;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * Map使用的注意点:
		 * 1.什么类型的数据可以充当key?
		 * a:让key实现了Comparable接口   或者  b:创建一个比较器,比较器是实现了Comparator接口   例如:String,Integer,double
		 * 不能充当的类型:ArrayList,数组
		 * 
		 * 2.元素能不能充当key,只与元素本身有关,与元素的内部无关
		 */
		//1.什么类型的数据可以充当key?
		TreeMap<Cat, String> map = new TreeMap<>();
		map.put(new Cat(), "01");
		map.put(new Cat(), "02");
		map.put(new Cat(), "03");
		System.out.println(map);
		
		//将ArrayList作为key存入map---不可以
//		TreeMap<ArrayList<Cat>, String> map1 = new TreeMap<>();
//		map1.put(new ArrayList<>(), "01");
//		map1.put(new ArrayList<>(), "02");
//		map1.put(new ArrayList<>(), "03");
//		System.out.println(map);
	}
}

class Cat implements Comparable<Cat>{
	Object object;
	@Override
	public int compareTo(Cat o) {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String toString() {
		return "Cat []";
	}
}
