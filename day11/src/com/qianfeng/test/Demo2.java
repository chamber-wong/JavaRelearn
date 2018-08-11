package com.qianfeng.test;
/*
 * 字符串:java将与字符串相关的内容面向对象了,形成的类就叫字符串类,表示方法:""
 * 
 * 分成两类:
 * 1.不可变字符串--String:说的是字符串本身没有发生变化,与引用无关---常量
 * 2.可变字符串----StringBuffer/StringBuilder:说的是字符串本身可以改变,与引用也无关.
 * 
 * 字符串常量的保存位置:常量区,可以认为是堆区中的一块儿特殊的区域.
 * 字符串常量的特点:同一个名字的字符串常量在内存中只允许存在一个.
 */
public class Demo2 {
	public static void main(String[] args) {
//		//不可变字符串
//		String s1 = "1000phone";
//		//可变字符串
//		StringBuffer s2 = new StringBuffer("helloworld");
		
		//讲解不可变字符串
		/*
		 * 当执行s1的时候,会到常量区找叫1000phone的字符串,如果有直接让s1保存他的地址,如果没有,会在常量区开辟一块儿
		 * 空间存1000phone.
		 * 执行s2是同理s1
		 * 执行s3时,由于进行了new,一定会现在堆中开辟一块儿空间,而1000phone是作为参数传给了对象.保存在了对象的一个String
		 * 类型的成员变量内,所以直接判断s1与s3不相同.
		 * 执行s4同理s3
		 */
		String s1 = "1000phone";
		String s2 = "1000phone";
		String s3 = new String("1000phone");
		String s4 = new String("1000phone");
		
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s4);//false
		System.out.println(s3 == s4);//false
		//说明字符串重写了equals方法,重新指定了比较的规则.规则变成:让s1与s3属性的地址比较
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		
		//总结:以后比较字符串时尽量使用equals
	}
}
