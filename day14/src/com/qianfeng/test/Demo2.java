package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * ����:ͨ��<��������>����һ����������,�ڱ����ʱ���ʹ���������ͼ�⼯����Ԫ��,�������<>�й涨������
		 * �Ͳ�������ӵ�������(���벻ͨ��).
		 * 
		 * ���͵�����:1.ʹ���˷��Ͳ�����Ҫ����ǿ������ת��,�ݴ���,����ת��--�򻯴���
		 * 2.�����н׶ε�������ǰ���˱���׶μ��,����˴���İ�ȫ�Ժͱ�̵�Ч��
		 * 
		 * 
		 * ����ʹ�÷�����λ��:
		 * 1.��  2.����  3.�ӿ�
		 */
		//����listָ���˷���֮��,�����Ԫ��ֻ�����ַ���
		ArrayList<String> list = new ArrayList<>();
		list.add("java1");
		list.add("java3");
		list.add("java2");
		list.add("java6");
		//list.add(4);
		System.out.println(list);
		
		//����
		//���ϵķ���ȷ����,�õ������ķ�����֮һ�¼���
		Iterator<String> iterator = list.iterator();
		//ʹ�÷���ǰ
//		while (iterator.hasNext()) {
//			Object object = iterator.next();
//			//�ݴ���
//			if (object instanceof String) {
//				//����ת��
//				String string = (String)object;
//				System.out.println(string.length());
//			}	
//		}
		//ʹ�÷��ͺ�
		while (iterator.hasNext()) {
			String string =  iterator.next();
			System.out.println(string.length());
		}
	}
}
