package com.qianfeng.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
		//Set<K> keySet()   遍历方法一
		//原理:得到所有的key,存放在一个Set中.利用set的迭代器遍历得到key,在利用key得到value
		//Set<Map.Entry<K,V>> entrySet() 遍历方法二
		//原理:得到每个键值对对应的映射关系类型的对象(entry/实体),存放在一个Set中.\
		//利用set的迭代器遍历得到entry,再利用entry的方法得到value和key
		
		//了解:为什么要将Entry映射关系接口放入Map接口中?
		//Entry是Map内的一个静态接口.因为有了集合中的键值对才有映射关系.而当前的映射关系又是对集合内部的描述.所以...
 */
public class Demo9 {
    public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("01", "java");
		map.put("03", "php");
		map.put("05", "BigData");
		map.put("02", "python");
		
		System.out.println(map);
		
		//通过Set<K> keySet()   遍历方法一
		Set<String> set1 = map.keySet();
		//获取迭代器
		Iterator<String> iterator = set1.iterator();
		while (iterator.hasNext()) {
			String key =  iterator.next();
			
			//再去获取value
			System.out.println("key:"+key+"   value:"+map.get(key));
		}
		
		//Set<Map.Entry<K,V>> entrySet() 遍历方法二
		//先得到装着entry的set
		Set<Map.Entry<String, String>> set = map.entrySet();
		//获取迭代器
		Iterator<Map.Entry<String, String>> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, String> entry = iterator2.next();
			//entry.setValue("hah");
			//再去获取key,value
			System.out.println("key:"+entry.getKey()+"   value:"+entry.getValue());
		}
		System.out.println(map);
	}
}
