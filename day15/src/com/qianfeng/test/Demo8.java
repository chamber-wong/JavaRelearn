package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo8 {
	public static void main(String[] args) {
		/*
		 * Collections:集合工具类,封装了集合的操作
		 * 
		 * 要求:存储多个数据,数据可以重复,还可以排序
		 */
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("php");
		list.add("python");
		list.add("html");
		list.add("BigData");
		
		//自然顺序
		System.out.println("自然顺序:"+list);
		
		//按照字典排序--默认都是升序
		//注意:要想实现字典排序,元素必须实现了Comparable接口的compareTo方法
		Collections.sort(list);
		System.out.println("字典顺序:"+list);
		
		//按照从短到长排序-默认的方法无法实现,所以需要写自己的比较器
		//先创建比较器对象
		ComWithLength comWithLength = new ComWithLength();
		Collections.sort(list, comWithLength);
		
		System.out.println("从短到长排序:"+list);
		
		//按照从长到短排序--利用现有的比较器反转得到新的比较器--从长到短
		Comparator<String> comparator = Collections.reverseOrder(comWithLength);
		Collections.sort(list, comparator);
		System.out.println("从长到短排序:"+list);
		
		//字典排序的反转比较器
		Comparator<String> comparator2 = Collections.reverseOrder();
		Collections.sort(list, comparator2);
		System.out.println("字典顺序反转:"+list);
		
		//现有顺序的反转
		Collections.reverse(list);
		System.out.println("现有顺序反转:"+list);
		
		//求最大值--按照字典排序比较
		String max = Collections.max(list);
		System.out.println("字典排序的最大值:"+max);
		//按照自己的规则--从短到长
		String max1 = Collections.max(list,comWithLength);
		System.out.println("从短到长排序的最大值:"+max1);
	}
}

//按照从短到长排序的比较器
class ComWithLength implements Comparator<String>{
	
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
}
