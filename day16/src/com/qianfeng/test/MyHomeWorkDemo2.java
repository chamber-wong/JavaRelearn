package com.qianfeng.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


/*
 * 练习题二: 1.josgjsjagwajsogiseafgjwsjgvoier
 *	要求:转化成字符串 :  a(字符的个数)b()c()..
 */

public class MyHomeWorkDemo2 {

	public static void main(String[] args) {

		// 需要被统计的字符串
		String string = "1.josgjsjagwajsogiseafgjwsjgvoier";

		// 声明: 字符 (Character) 为Key, 个数 (Integer) 为value
		HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

		// 遍历字符串获取字符，并存储字符串字符与字符出现的次数
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			// 存储时对字符进行判断，如果集合中存在这个键，就将这个字符当作键存入，同时设其值为1
			// 如果集合中存在此键，就将其值加1存入
			if (!hashMap.containsKey(c)) {
				hashMap.put(c, 1);
			} else {
				hashMap.put(c, hashMap.get(c) + 1);
			}
		}

		
		
		
		/*
		 * 通过Set<K> keySet() 遍历
		 *得到所有的key,存放在一个Set中.利用set的迭代器遍历得到key,在利用key得到value
		 */
		// 先得到装着key的set
		Set<Character> set = hashMap.keySet();
		// 获取迭代器
		Iterator<Character> iterator = set.iterator();
		while (iterator.hasNext()) {
			Character key = iterator.next();
			// 通过Key去获取value
			System.out.print(key + "(" + hashMap.get(key) + ")");
		}
		System.out.println();

		
		
		/*
		 * Set<Map.Entry<K,V>> entrySet() 遍历
		 * 得到每个键值对对应的映射关系类型的对象(entry/实体),存放在一个Set中,利用set的迭代器遍历得到entry,
		 * 再利用entry的方法得到value和key
		 */
		// 先得到装着entry的set
		Set<Map.Entry<Character, Integer>> set2 = hashMap.entrySet();
		// 获取迭代器
		Iterator<Map.Entry<Character, Integer>> iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<Character, Integer> entry = iterator2.next();
			// 获取key，value
			System.out.print(entry.getKey() + "(" + entry.getValue() + ")");

		}

	}
}
