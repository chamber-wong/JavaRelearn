package com.qianfeng.test;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet的第二种排序方式:使用实现了Comparator接口的比较器对象实现比较
 * 实例:实现将字符串按照从短到长排序,长度相同按照字典排序
 * 
 * 总结:对TreeSet的排序有两种方式:
 * 1.实现Comparable接口的compareTo方法---系统排序
 * 2.实现Comparetor接口的compare方法--人工排序
 * 
 * 系统让人工排序的优先级高于系统排序.方便人工排序的实现
 * 
 * 作业:使用TreeSet实现Person3的去重和排序
 * 要求:1.按照年龄和姓名即可  2.使用两种排序方法
 * 
 */
public class Demo9 {
	public static void main(String[] args) {
		//创建一个比较器对象
		ComWithLength comWithLength = new ComWithLength();
		
		//将比较器对象指定给当前的TreeSet对象
		TreeSet set = new TreeSet<>(comWithLength);
		set.add("java1ttt");
		set.add("java4");
		set.add("java3kk");
		set.add("java1");
		
		System.out.println(set);
	}
}

//创建比较器
class ComWithLength implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		if (!(o1 instanceof String)) {
			throw new ClassCastException("类型转换错误");
		}
		
		if (!(o2 instanceof String)) {
			throw new ClassCastException("类型转换错误");
		}
		
		//向下转型
		String s1 = (String)o1;
		String s2 = (String)o2;
		//字符串按照从短到长排序,长度相同按照字典排序
		int num = s1.length()-s2.length();
		return num==0?s1.compareTo(s2):num;
	}
}
