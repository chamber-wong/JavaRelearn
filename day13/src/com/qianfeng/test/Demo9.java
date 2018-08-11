package com.qianfeng.test;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * TreeSet�ĵڶ�������ʽ:ʹ��ʵ����Comparator�ӿڵıȽ�������ʵ�ֱȽ�
 * ʵ��:ʵ�ֽ��ַ������մӶ̵�������,������ͬ�����ֵ�����
 * 
 * �ܽ�:��TreeSet�����������ַ�ʽ:
 * 1.ʵ��Comparable�ӿڵ�compareTo����---ϵͳ����
 * 2.ʵ��Comparetor�ӿڵ�compare����--�˹�����
 * 
 * ϵͳ���˹���������ȼ�����ϵͳ����.�����˹������ʵ��
 * 
 * ��ҵ:ʹ��TreeSetʵ��Person3��ȥ�غ�����
 * Ҫ��:1.�����������������  2.ʹ���������򷽷�
 * 
 */
public class Demo9 {
	public static void main(String[] args) {
		//����һ���Ƚ�������
		ComWithLength comWithLength = new ComWithLength();
		
		//���Ƚ�������ָ������ǰ��TreeSet����
		TreeSet set = new TreeSet<>(comWithLength);
		set.add("java1ttt");
		set.add("java4");
		set.add("java3kk");
		set.add("java1");
		
		System.out.println(set);
	}
}

//�����Ƚ���
class ComWithLength implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		if (!(o1 instanceof String)) {
			throw new ClassCastException("����ת������");
		}
		
		if (!(o2 instanceof String)) {
			throw new ClassCastException("����ת������");
		}
		
		//����ת��
		String s1 = (String)o1;
		String s2 = (String)o2;
		//�ַ������մӶ̵�������,������ͬ�����ֵ�����
		int num = s1.length()-s2.length();
		return num==0?s1.compareTo(s2):num;
	}
}
