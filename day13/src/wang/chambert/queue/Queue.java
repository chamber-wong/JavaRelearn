package wang.chambert.queue;

import java.util.LinkedList;

public class Queue<E> {

	LinkedList<E> list = new LinkedList<>();

	public boolean isEmpty() {
		if (list.isEmpty()) {
			return true;
		}
		return false;
	}

	public E remove() {
		return list.pollFirst();
	}

	public void add(E e) {
		list.addLast(e);
	}

	@Override
	public String toString() {
		return "Queue" + list;
	}

}
