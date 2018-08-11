package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo6 {
	/*
	 * 区分集合和数组
	 * 数组:可以存储不同类型的多个数据,数据类型可以是简单数据类型也可以引用数据类型
	 * 		缺点:创建的是一个定值,只能存储固定长度的数据,一旦存满了,就不能再继续存储.
	 * 集合:可以存储不同类型的多个数据,但是只能存储引用数据类型.
	 *      缺点:只能存储引用数据类型
	 *      优点:存储空间会随着存储数据的增大而增大,所以可以更加合理的利用内存空间,方法很多,方便我们实现功能.
	 *      
	 * 数据存储的分类:
	 * 短期存储:一旦计算机关闭,存储的内容会被立刻释放----变量,对象,数组,集合
	 * 长期存储:直接存储在磁盘上,可以长久的保存,数据不会随着计算机的关闭而消失.----.mp4,.mp4,.txt,.doc,jpg,png
	 * 
	 * 
	 * 分类:
	 * Collection:---接口
	 * 		>List---接口
	 * 			>>ArrayList--类
	 * 			>>Vector  ---类
	 * 			>>LinkedList--类
	 * 		>Set---接口
	 * 			>>HashSet--类
	 * 			>>TreeSet--类
	 * Map:--接口
	 * 		>HashMap--类
	 * 		>TreeMap--类
	 */
	public static void main(String[] args) {
		Collection collection = new ArrayList<>();
		//Collection中定义是整个集合体系最共性的方法:
		//1.添加：
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
		//2.删除:
	    //boolean remove(Object o)  
		//collection.remove("html");
		//System.out.println(collection);
	    //boolean removeAll(Collection<?> c)--删除定义的一批元素.但是collection里面不一定包含collection1的所有内容.
		//collection.removeAll(collection1);
		//System.out.println(collection);
	    //void clear()--空集合 != null
		//collection.clear();
		//System.out.println(collection);
		//3.判断:
		//boolean contains(Object o) --是否包含一个元素
		System.out.println(collection.contains("java"));//true
		//boolean containsAll(Collection<?> c)--是否包含多个元素
		//boolean isEmpty() //判断集合是否为空
		System.out.println(collection.isEmpty());//false
		//boolean equals(Object o) --比较的是集合的内容
		Collection collection2 = new ArrayList<>();
		collection2.addAll(collection);
		System.out.println(collection.equals(collection2));//true
		//4.获取：
		//Iterator<E> iterator() //获取集合中的对象
		test(collection);
		//int size() //获取集合中对象的个数
		System.out.println(collection.size());
		//5.集合变数组：
		//Object[] toArray()--当我们希望集合的长度固定下来的时候,就转数组
		Object[] objects = collection.toArray();
		for (Object object : objects) {
			System.out.println(object);
		}
		
	}
	
	//4.获取：
	//Iterator<E> iterator() //获取集合中的对象,对集合实现遍历
	/*
	 * boolean hasnext():判断当前的位置是否存在元素,存在返回true,不存在返回false
	 * Object next():将当前位置的元素返回,并且指向当前位置的指针指向下一个位置.
	 */
	public static void test(Collection collection){
		//1.获取迭代器对象
		Iterator iterator =  collection.iterator();
		//2.通过方法实现遍历
		while (iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println("元素:"+object);
		}
		
		//注意点:
		//1.直接再次使用第一次的iterator进行遍历,遍历失败.因为当前的指针已经指向了集合的最后.
		//再次使用hasnext会直接返回false.所以如果想再次遍历,要重新获取迭代器对象.
		while (iterator.hasNext()) {
			Object object =  iterator.next();
			System.out.println("元素1:"+object);
		}
		
		//2.集合可以同时存储不同类型的数据
		collection.add(4);//存储的是:new Integer(4)--自动装箱
		
		//3.再次遍历--当集合中同时存在不同类型的数据时,需要进行容错处理和向下转型.
		Iterator iterator1 =  collection.iterator();
		while (iterator1.hasNext()) {
			Object object =  iterator1.next();
			
			if (!(object instanceof String)) {
				throw new ClassCastException();//类型转化异常
			}
			
			//向下转型
			String string = (String)object;
			System.out.println(string.length());
		}
	}
}
