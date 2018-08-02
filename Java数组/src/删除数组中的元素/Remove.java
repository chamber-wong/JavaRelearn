package 删除数组中的元素;

import java.util.ArrayList;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =  new ArrayList<>();
		for(int i = 0; i<20 ; i++) {
			list.add(i);
		}
		list.remove(7);
		System.out.println(list);
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		list2.remove("c");
		System.out.println(list2);
	}

}
