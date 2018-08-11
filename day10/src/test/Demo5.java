package test;

import java.util.ArrayList;

/**
 * 拆箱: 装箱:
 * 
 * @author 弄风
 *
 */
public class Demo5 {
	public static void main(String[] args) {
		// 装箱
		int temp = 1000;
		Integer integer = new Integer(temp);

		// 拆箱
		int temp1 = integer.intValue();
		// byte b = integer.byteValue();
		System.out.println(temp1);

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);

		Integer integer2 = new Integer(4);
		Integer integer3 = integer2 + 3;
		System.out.println(integer3);

		Integer integer4 = 100;
		Integer integer5 = 100;
		System.out.println(integer4 == integer5);
		//--->true
		
		integer4 = 200;
		integer5 = 200;
		System.out.println(integer4 == integer5);
		//--->false
	}
}
