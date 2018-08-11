package com.qianfeng.test;

import java.util.HashMap;
import java.util.Map;

/*
 * Collection:ֱ�Ӵ洢��ֵ
 * Map:������һ���ӿ�,�洢���Ǽ�ֵ��,һ��Ԫ�ؾ���һ����(key)ֵ(value)��.key������Ψһ��.value������ͬ
 */
public class Demo8 {
	public static void main(String[] args) {
		//����Map�ӿڵķ���
		Map<String, String> map = new HashMap<>();
		//1.����
		//V put(K key,V value)  ����һ����ֵ��
		//���ڷ���ֵ:�����ǰ��keyû�ж�Ӧֵ,����null.����Ѿ���ֵ��,�Ὣԭ�����滻��ֵ����.
		map.put("01", "java");
		map.put("02", "iOS");
		map.put("03", "html");
		map.put("04", "python");
		System.out.println(map.put("01", "php"));
		System.out.println(map);
		//void putAll(Map<? extends K,? extends V> map)  ���Ӷ��
		//2.ɾ��
		//V remove(Object key)  ����keyɾ��Ԫ��
		map.remove("01");
		System.out.println(map);
		//void clear()  ɾ��ȫ��
		//3.��ȡ
		//V get(Object key)  ����key����Ԫ��
		System.out.println(map.get("02"));
		//int size()  ��ȡ��ֵ�Եĸ���
		System.out.println(map.size());
		//Set<K> keySet()   ��������һ
		//Set<Map.Entry<K,V>> entrySet() ����������
		//4.���õ��ж�
		//boolean isEmpty()
		System.out.println(map.isEmpty());//false
		//boolean containsKey(K key) �Ƿ������ǰ��key
		System.out.println(map.containsKey("02"));//true
		//boolean containsValue(V value) �Ƿ������ǰ��value
		System.out.println(map.containsValue("html"));//true
	}
}
