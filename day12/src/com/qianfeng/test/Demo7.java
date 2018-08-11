package com.qianfeng.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo7 {
	/*Collection:
	 * List:存储的数据是有序的(元素的顺序与添加元素的顺序一致),可以重复的.
	 * 		Arraylist:底层的数据结构是数组,线程不安全的.特点:查找速度快,添加删除速度慢
	 * 		Vector:底层的数据结构是数组,线程安全的.特点:查找速度快,添加删除速度慢
	 * 		LinkedList:底层是链表,线程不安全的.特点:查找速度慢,添加删除速度快.
	 * Set:存储的数据是无序的,不可以重复
	 */
	public static void main(String[] args) {
		List list = new ArrayList();
		//* List：特有方法，可以操作下标
		//1.增：
		//void add(int index, E element) 
		//boolean addAll(int index, Collection<? extends E> c) 
        list.add("java");
        list.add("java1");
        list.add("java2");
        list.add(0, "php");
        list.add("html");
        System.out.println(list);
		//2.删
		//E remove(int index) 
        
        System.out.println(list.remove(0));
		//3.改
	    //E set(int index, E element)
         list.set(0, "c");
         System.out.println(list);
		//4.查
	     //ListIterator<E> listIterator() 
         test(list);
	     //返回此列表元素的列表迭代器（按适当顺序）。 
	     //ListIterator<E> listIterator(int index) 
	     //List<E> subList(int fromIndex, int toIndex) 包含开头不包含结尾
         List sub = list.subList(1, 3);
         System.out.println(sub);
	     //E get(int index) 
         System.out.println(list.get(0));
		     
		//5.删除全部对象
        // list.clear();
	}
	//4.查
    //ListIterator<E> listIterator() 
    public static void test(List list){
    	ListIterator iterator = list.listIterator();
    	//从左到右遍历
    	while (iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println("从左到右:"+object);
		}
    	
    	//从右到左
    	while (iterator.hasPrevious()) {
			Object object = iterator.previous();
			System.out.println("从右到左:"+object);
		}
    	
    	//注意事项:
    	while (iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println("从左到右:"+object);
			
			//需求:将java1删除
			if (object.equals("java1")) {
				//在使用迭代器期间,使用list的删除方法直接删除元素,有可能发生错误,所以不要这样做
				//list.remove("java1");
				//使用迭代器自带的方法进行删除
				//注意:他的remove,add,set方法尽量不要同时使用.
				iterator.remove();
				
			}
		}
    	
    	System.out.println(list);
    }
}
