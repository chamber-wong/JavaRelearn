package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo6 {
	/*
	 * ���ּ��Ϻ�����
	 * ����:���Դ洢��ͬ���͵Ķ������,�������Ϳ����Ǽ���������Ҳ����������������
	 * 		ȱ��:��������һ����ֵ,ֻ�ܴ洢�̶����ȵ�����,һ��������,�Ͳ����ټ����洢.
	 * ����:���Դ洢��ͬ���͵Ķ������,����ֻ�ܴ洢������������.
	 *      ȱ��:ֻ�ܴ洢������������
	 *      �ŵ�:�洢�ռ�����Ŵ洢���ݵ����������,���Կ��Ը��Ӻ���������ڴ�ռ�,�����ܶ�,��������ʵ�ֹ���.
	 *      
	 * ���ݴ洢�ķ���:
	 * ���ڴ洢:һ��������ر�,�洢�����ݻᱻ�����ͷ�----����,����,����,����
	 * ���ڴ洢:ֱ�Ӵ洢�ڴ�����,���Գ��õı���,���ݲ������ż�����Ĺرն���ʧ.----.mp4,.mp4,.txt,.doc,jpg,png
	 * 
	 * 
	 * ����:
	 * Collection:---�ӿ�
	 * 		>List---�ӿ�
	 * 			>>ArrayList--��
	 * 			>>Vector  ---��
	 * 			>>LinkedList--��
	 * 		>Set---�ӿ�
	 * 			>>HashSet--��
	 * 			>>TreeSet--��
	 * Map:--�ӿ�
	 * 		>HashMap--��
	 * 		>TreeMap--��
	 */
	public static void main(String[] args) {
		Collection collection = new ArrayList<>();
		//Collection�ж���������������ϵ��Եķ���:
		//1.��ӣ�
		//boolean add(Object o) 
		collection.add("java");
		collection.add("php");
		collection.add("iOS");
		System.out.println(collection);
		//boolean addAll(Collection  c) 
		Collection collection1 = new ArrayList<>();
		collection1.add("python");
		collection1.add("html");
		collection.addAll(collection1);
		System.out.println(collection);
		//2.ɾ��:
	    //boolean remove(Object o)  
		//collection.remove("html");
		//System.out.println(collection);
	    //boolean removeAll(Collection<?> c)--ɾ�������һ��Ԫ��.����collection���治һ������collection1����������.
		//collection.removeAll(collection1);
		//System.out.println(collection);
	    //void clear()--�ռ��� != null
		//collection.clear();
		//System.out.println(collection);
		//3.�ж�:
		//boolean contains(Object o) --�Ƿ����һ��Ԫ��
		System.out.println(collection.contains("java"));//true
		//boolean containsAll(Collection<?> c)--�Ƿ�������Ԫ��
		//boolean isEmpty() //�жϼ����Ƿ�Ϊ��
		System.out.println(collection.isEmpty());//false
		//boolean equals(Object o) --�Ƚϵ��Ǽ��ϵ�����
		Collection collection2 = new ArrayList<>();
		collection2.addAll(collection);
		System.out.println(collection.equals(collection2));//true
		//4.��ȡ��
		//Iterator<E> iterator() //��ȡ�����еĶ���
		test(collection);
		//int size() //��ȡ�����ж���ĸ���
		System.out.println(collection.size());
		//5.���ϱ����飺
		//Object[] toArray()--������ϣ�����ϵĳ��ȹ̶�������ʱ��,��ת����
		Object[] objects = collection.toArray();
		for (Object object : objects) {
			System.out.println(object);
		}
		
	}
	
	//4.��ȡ��
	//Iterator<E> iterator() //��ȡ�����еĶ���,�Լ���ʵ�ֱ���
	/*
	 * boolean hasnext():�жϵ�ǰ��λ���Ƿ����Ԫ��,���ڷ���true,�����ڷ���false
	 * Object next():����ǰλ�õ�Ԫ�ط���,����ָ��ǰλ�õ�ָ��ָ����һ��λ��.
	 */
	public static void test(Collection collection){
		//1.��ȡ����������
		Iterator iterator =  collection.iterator();
		//2.ͨ������ʵ�ֱ���
		while (iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println("Ԫ��:"+object);
		}
		
		//ע���:
		//1.ֱ���ٴ�ʹ�õ�һ�ε�iterator���б���,����ʧ��.��Ϊ��ǰ��ָ���Ѿ�ָ���˼��ϵ����.
		//�ٴ�ʹ��hasnext��ֱ�ӷ���false.����������ٴα���,Ҫ���»�ȡ����������.
		while (iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println("Ԫ��1:"+object);
		}
		
		//2.���Ͽ���ͬʱ�洢��ͬ���͵�����
		collection.add(4);//�洢����:new Integer(4)--�Զ�װ��
		
		//3.�ٴα���--��������ͬʱ���ڲ�ͬ���͵�����ʱ,��Ҫ�����ݴ��������ת��.
		Iterator iterator1 =  collection.iterator();
		while (iterator1.hasNext()) {
			Object object =  iterator1.next();
			
			if (!(object instanceof String)) {
				throw new ClassCastException();//����ת���쳣
			}
			
			//����ת��
			String string = (String)object;
			System.out.println(string.length());
		}
	}
}
