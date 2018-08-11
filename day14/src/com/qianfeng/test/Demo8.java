package com.qianfeng.test;

import java.util.HashMap;
import java.util.Map;

/*
 * Collection:直接存储的值
 * Map:本身是一个接口,存储的是键值对,一个元素就是一个键(key)值(value)对.key必须是唯一的.value可以相同
 */
public class Demo8 {
	public static void main(String[] args) {
		//介绍Map接口的方法
		Map<String, String> map = new HashMap<>();
		//1.增加
		//V put(K key,V value)  增加一个键值对
		//关于返回值:如果当前的key没有对应值,返回null.如果已经有值了,会将原来被替换的值返回.
		map.put("01", "java");
		map.put("02", "iOS");
		map.put("03", "html");
		map.put("04", "python");
		System.out.println(map.put("01", "php"));
		System.out.println(map);
		//void putAll(Map<? extends K,? extends V> map)  增加多个
		//2.删除
		//V remove(Object key)  根据key删除元素
		map.remove("01");
		System.out.println(map);
		//void clear()  删除全部
		//3.获取
		//V get(Object key)  根据key查找元素
		System.out.println(map.get("02"));
		//int size()  获取键值对的个数
		System.out.println(map.size());
		//Set<K> keySet()   遍历方法一
		//Set<Map.Entry<K,V>> entrySet() 遍历方法二
		//4.常用的判断
		//boolean isEmpty()
		System.out.println(map.isEmpty());//false
		//boolean containsKey(K key) 是否包含当前的key
		System.out.println(map.containsKey("02"));//true
		//boolean containsValue(V value) 是否包含当前的value
		System.out.println(map.containsValue("html"));//true
	}
}
