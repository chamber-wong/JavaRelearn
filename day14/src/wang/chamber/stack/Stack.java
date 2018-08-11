package wang.chamber.stack;

import java.util.Comparator;
import java.util.TreeSet;

public class Stack<E> {
	@Override
	public String toString() {
		return "Stack" + set ;
	}
	TreeSet<E> set = new TreeSet<>(new Com<E>());
	public void add(E e) {
		set.add(e);
	}
	public E remove() {
		return set.pollLast();
	}
	public boolean isEmpty() {
		return set.isEmpty();
	}
	
}

//创建比较器
class Com<E> implements Comparator<E>{
	@Override
	public int compare(Object o1, Object o2) {
		int num = o1.hashCode() - o2.hashCode();
		return num==0?0:1;
	}
}
