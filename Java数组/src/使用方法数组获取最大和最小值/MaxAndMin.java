package 使用方法数组获取最大和最小值;

import java.util.Arrays;
import java.util.Collections;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		/*
		 * 这里注意,min中的返回类型需要是Integer数组 
		 * (1) 该方法对于基本数据类型的数组支持并不好,当数组是基本数据类型时不建议使用 
		 * (2) 当使用asList()方法时，数组就和列表链接在一起了. 当更新其中之一时，另一个将自动获得更新。
		 * 注意:仅仅针对对象数组类型,基本数据类型数组不具备该特性 
		 * (3) asList得到的数组是的没有add和remove方法的
		 */
		int min = Collections.min(Arrays.asList(array));
		int max = Collections.max(Arrays.asList(array));
		System.out.println("最小值为:" + min);
		System.out.println("最大值为:" + max);
	}
}
