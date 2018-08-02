package 数组合并;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 通过 List 类的 Arrays.toString () 方法和 List 类的 list.Addall(array1.asList(array2)
 * 方法将两个数组合并为一个数组：
 * 
 * @author 弄风
 *
 */
public class Addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		Integer array1[] = {0,0,0};
		ArrayList list = new ArrayList(Arrays.asList(array));
		list.addAll(Arrays.asList(array1));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
	}

}
