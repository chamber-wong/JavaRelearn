package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * List:�����,���ظ���
 * Ҫ��:ʹ��list�洢����,�������ݲ����ظ�---contains
 */
public class Demo4 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("java1");//��һ��
		list.add("java2");//�ڶ���
		list.add("java2");//������
		list.add("java3");
		System.out.println(list);
		
		//�ڴ���һ��ArrayList������Ϊ�洢ȥ�غ�����ݵļ���
		ArrayList list1 = new ArrayList<>();
		//����ԭ���ļ���
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			Object object =  iterator.next();
			/*
			 * ����жϳ���,˵��list1�в�������ǰ��Ԫ��
			 * ����ԭ��:�����Ԫ��ʱ,���õ�ǰ��Ԫ���뼯�������е�Ԫ��ͨ��equels��������һһ�Ƚ�.������
			 * ֻҪ��һ�η���true,ֹͣ�Ƚ�.��������contains��������true.ֻ�����еıȽ϶�����false,����
			 * �Ż᷵��false
			 * 
			 * ʵ��:��ӵ�����Ԫ�ص�ʱ��,����equals�����Ĺ���
			 * ����Ԫ��.equals("java1") = false     ����Ԫ��.equals("java2") = true  ֹͣ�Ƚ�
			 * 
			 */
			if (!list1.contains(object)) {
				list1.add(object);
			}
		}
		
		System.out.println(list1);
	}
}




