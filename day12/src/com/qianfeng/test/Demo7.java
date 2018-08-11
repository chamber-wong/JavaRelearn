package com.qianfeng.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo7 {
	/*Collection:
	 * List:�洢�������������(Ԫ�ص�˳�������Ԫ�ص�˳��һ��),�����ظ���.
	 * 		Arraylist:�ײ�����ݽṹ������,�̲߳���ȫ��.�ص�:�����ٶȿ�,���ɾ���ٶ���
	 * 		Vector:�ײ�����ݽṹ������,�̰߳�ȫ��.�ص�:�����ٶȿ�,���ɾ���ٶ���
	 * 		LinkedList:�ײ�������,�̲߳���ȫ��.�ص�:�����ٶ���,���ɾ���ٶȿ�.
	 * Set:�洢�������������,�������ظ�
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		//* List�����з��������Բ����±�
		//1.����
		//void add(int index, E element) 
		//boolean addAll(int index, Collection<? extends E> c) 
        list.add("java");
        list.add("java1");
        list.add("java2");
        list.add(0, "php");
        list.add("html");
        System.out.println(list);
		//2.ɾ
		//E remove(int index) 
        
        System.out.println(list.remove(0));
		//3.��
	    //E set(int index, E element)
         list.set(0, "c");
         System.out.println(list);
		//4.��
	     //ListIterator<E> listIterator() 
         test(list);
	     //���ش��б�Ԫ�ص��б�����������ʵ�˳�򣩡� 
	     //ListIterator<E> listIterator(int index) 
	     //List<E> subList(int fromIndex, int toIndex) ������ͷ��������β
         List sub = list.subList(1, 3);
         System.out.println(sub);
	     //E get(int index) 
         System.out.println(list.get(0));
		     
		//5.ɾ��ȫ������
        // list.clear();
	}
	//4.��
    //ListIterator<E> listIterator() 
    public static void test(List list){
    	ListIterator iterator = list.listIterator();
    	//�����ұ���
    	while (iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println("������:"+object);
		}
    	
    	//���ҵ���
    	while (iterator.hasPrevious()) {
			Object object = iterator.previous();
			System.out.println("���ҵ���:"+object);
		}
    	
    	//ע������:
    	while (iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println("������:"+object);
			
			//����:��java1ɾ��
			if (object.equals("java1")) {
				//��ʹ�õ������ڼ�,ʹ��list��ɾ������ֱ��ɾ��Ԫ��,�п��ܷ�������,���Բ�Ҫ������
				//list.remove("java1");
				//ʹ�õ������Դ��ķ�������ɾ��
				//ע��:����remove,add,set����������Ҫͬʱʹ��.
				iterator.remove();
				
			}
		}
    	
    	System.out.println(list);
    }
}
