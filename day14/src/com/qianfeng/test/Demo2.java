package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
	public static void main(String[] args) {
		/*
		 * 泛型:通过<数据类型>接收一种数据类型,在编译的时候会使用这种类型检测集合中元素,如果不是<>中规定的类型
		 * 就不允许添加到集合中(编译不通过).
		 * 
		 * 泛型的作用:1.使用了泛型不再需要进行强制类型转化,容错处理,向下转型--简化代码
		 * 2.将运行阶段的问题提前到了编译阶段检查,提高了代码的安全性和编程的效率
		 * 
		 * 
		 * 可以使用泛型是位置:
		 * 1.类  2.方法  3.接口
		 */
		//当给list指定了泛型之后,里面的元素只能是字符串
		ArrayList<String> list = new ArrayList<>();
		list.add("java1");
		list.add("java3");
		list.add("java2");
		list.add("java6");
		//list.add(4);
		System.out.println(list);
		
		//遍历
		//集合的泛型确定后,让迭代器的泛型与之一致即可
		Iterator<String> iterator = list.iterator();
		//使用泛型前
//		while (iterator.hasNext()) {
//			Object object = iterator.next();
//			//容错处理
//			if (object instanceof String) {
//				//向下转型
//				String string = (String)object;
//				System.out.println(string.length());
//			}	
//		}
		//使用泛型后
		while (iterator.hasNext()) {
			String string =  iterator.next();
			System.out.println(string.length());
		}
	}
}
