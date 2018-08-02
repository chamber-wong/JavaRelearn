package 数组反转;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 使用 Collections.reverse(ArrayList) 将数组进行反转
 * 只能对ArrayList进行处理,不能处理数组
 * @author 弄风
 *
 */
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		Collections.reverse(list);
		System.out.println(list);
	}
}
