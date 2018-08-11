package com.qianfeng.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
		//Set<K> keySet()   ��������һ
		//ԭ��:�õ����е�key,�����һ��Set��.����set�ĵ����������õ�key,������key�õ�value
		//Set<Map.Entry<K,V>> entrySet() ����������
		//ԭ��:�õ�ÿ����ֵ�Զ�Ӧ��ӳ���ϵ���͵Ķ���(entry/ʵ��),�����һ��Set��.\
		//����set�ĵ����������õ�entry,������entry�ķ����õ�value��key
		
		//�˽�:ΪʲôҪ��Entryӳ���ϵ�ӿڷ���Map�ӿ���?
		//Entry��Map�ڵ�һ����̬�ӿ�.��Ϊ���˼����еļ�ֵ�Բ���ӳ���ϵ.����ǰ��ӳ���ϵ���ǶԼ����ڲ�������.����...
 */
public class Demo9 {
    public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("01", "java");
		map.put("03", "php");
		map.put("05", "BigData");
		map.put("02", "python");
		
		System.out.println(map);
		
		//ͨ��Set<K> keySet()   ��������һ
		Set<String> set1 = map.keySet();
		//��ȡ������
		Iterator<String> iterator = set1.iterator();
		while (iterator.hasNext()) {
			String key =  iterator.next();
			
			//��ȥ��ȡvalue
			System.out.println("key:"+key+"   value:"+map.get(key));
		}
		
		//Set<Map.Entry<K,V>> entrySet() ����������
		//�ȵõ�װ��entry��set
		Set<Map.Entry<String, String>> set = map.entrySet();
		//��ȡ������
		Iterator<Map.Entry<String, String>> iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			Map.Entry<String, String> entry = iterator2.next();
			//entry.setValue("hah");
			//��ȥ��ȡkey,value
			System.out.println("key:"+entry.getKey()+"   value:"+entry.getValue());
		}
		System.out.println(map);
	}
}
