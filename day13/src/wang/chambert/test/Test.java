package wang.chambert.test;

import wang.chambert.queue.Queue;

public class Test {

	public static void main(String[] args) {

		Queue<String> queue = new Queue<>();
		System.out.println("添加元素前查看是否为空:" + queue.isEmpty());
		queue.add("hello");
		queue.add("world");
		queue.add("abc");
		queue.add("def");
		queue.add("ghi");
		queue.add("jkl");
		System.out.println(queue);
		queue.remove();
		System.out.println(queue);
		System.out.println("添加元素后查看是否为空:" + queue.isEmpty());
	}
}
