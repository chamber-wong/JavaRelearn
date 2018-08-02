package 计算两个数组的交集;
/**
 * 使用 retainAll () 方法来计算两个数组的交集：
 */
import java.util.ArrayList;

public class RetainAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list = new ArrayList<>();
		list.add(1);
		list.add("wang");
		list.add("bbbb");
		
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("wang");
		
		list.retainAll(list2);
		System.out.println(list);
	}

}
