package 数组填充;

import java.util.Arrays;

/**
 * 通过 Java Util 类的 Arrays.fill(arrayname,value) 方法和
 * Arrays.fill(arrayname,starting index ,ending index ,value) 方法向数组中填充元素：
 * 
 * @author 弄风
 *
 */
public class Fill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrays = {"A","B","C","D","E","F","G"};
		Arrays.fill(arrays, "ooo");  //将所有值替换为"ooo"
		System.out.println(Arrays.toString(arrays)); //打印数组
		Arrays.fill(arrays, 0,2,"ppp");  //替换数组索引中的数据为指定数据
		System.out.println(Arrays.toString(arrays));  
	}

}
