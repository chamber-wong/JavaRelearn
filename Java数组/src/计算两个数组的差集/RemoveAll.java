package 计算两个数组的差集;

import java.awt.List;
import java.util.ArrayList;
/**
 * 使用 removeAll () 方法来计算两个数组的差集：
 * @author 弄风
 *
 */
public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<>();
		list.add(1);
		list.add("wang");
		list.add("bbbb");
		
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add(1);
		
		list.removeAll(list2);
		System.out.println(list);
		
		
	}

}
