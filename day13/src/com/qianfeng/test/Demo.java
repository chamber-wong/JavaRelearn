package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList<>();
		
		Iterator iterator = list1.iterator();
		while (iterator.hasNext()) {
			Object object = iterator.next();
			
			if (!list1.contains(object)) {
				list1.add(object);
			}
		}
	}
}
