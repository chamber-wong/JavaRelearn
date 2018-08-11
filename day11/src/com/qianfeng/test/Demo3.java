package com.qianfeng.test;

public class Demo3 {
	public static void main(String[] args) {
		String s1 = "1000phone";
		//1.判断：
	    //判断是否包含一个子字符串
		//boolean contains(CharSequence s) 
		System.out.println(s1.contains("1000"));//true
	    //判断两个字符串的内容是否相同
		//boolean equals(Object anObject) 
		System.out.println(s1.equals("10000phone"));//false
	    //忽略大小写判断两个字符串的内容是否相同
		//boolean equalsIgnoreCase(String anotherString) 
		System.out.println(s1.equalsIgnoreCase("1000phonE"));//true
	    //判断是否以某字符串开头
		//boolean startsWith(String prefix)
		System.out.println(s1.startsWith("1000"));//true
		//判断是否以某字符串结尾
		//boolean endsWith(String suffix) 
		System.out.println(s1.endsWith("1000"));//false
		
		
	    //2.转换：将字符数组转换成字符串
		char[] arr = {'a','b','c'};
		//1:使用构造方法
		//String(char[] value) 
		String s2 = new String(arr);
		System.out.println(s2);//abc
		//String(char[] value, int offset, int count) 将字符数组的一部分转成字符串
		String s3 = new String(arr, 0, 2);
		System.out.println(s3);//ab
		//2:使用静态方法
		//static String copyValueOf(char[] data) 
		//static String copyValueOf(char[] data, int offset, int count) 
		//将字符串转成字符数组
	    //char[] toCharArray() 
		char[] arr2 = s1.toCharArray();
		System.out.println(arr2.length);//9
		//将字节数组转成字符串--默认是GBK
	    //String(byte[] bytes) 
		byte[] arr3 = {96,97,98};
		String s4 = new String(arr3);
		System.out.println(s4);
	    //String(byte[] bytes, int offset, int length)
	    //String(byte[] bytes, String charsetName)//使用指定的编码将字节数组转换成字符成
		//将字符串转成字节数组
	    //byte[] getBytes() 
		byte[] arr4 = s4.getBytes();
		System.out.println(arr4.length);//3
		//将基本数据类型转换成字符串
	    //String.valueOf()
		String s5 = String.valueOf(34);
		System.out.println(s5+1);
		
	    //3.替换：
		//String replace(char oldChar, char newChar) 
		String s6 = s1.replace("1000", "9999");
		System.out.println(s6+"  "+s1);//9999phone
		//子串:
		//String substring(int beginIndex)  
		String subString1 = s1.substring(2);
		System.out.println(subString1);
	    //String substring(int beginIndex, int endIndex) //包含起始位置，不包含结束位置，到结束位置的前一位
		String subString2 = s1.substring(0, 4);
		System.out.println(subString2);
		//转换，去除空格，比较:
		//大小写转换
	    //String toUpperCase()
		String s7 = s1.toUpperCase();
		System.out.println(s7);
		//String toLowerCase() 
		String s8 = s7.toLowerCase();
	    //将字符串两端的空格去掉,中间的无法去除
	    //String trim() 
		System.out.println("  ph  one  ".trim()+"haha");
		//按字典顺序比较两个字符串
		/*
		 * 字典顺序:按照ASCII表比较当前的两个字符,ASCII码大的认为是大的字符
		 * 规则:从左边第一个字符开始比较
		 * 如果当前的字符不相同,直接认为ASCII大的字符串是大字符串,后面的字符停止比较
		 * 当前字符比较的具体规则:使用前面的字符-后面的字符,返回差值.如果是负数,说明前面的字符串小于后面的.反之前面的大.
		 * 如果当前的字符相同,再去比较第二个字符,依次往后推,如果比到最后都相同,则认为两个字符串相等,差值返回0.
		 */
	    //int compareTo(String anotherString)
		int value = s1.compareTo("1000hone");
		System.out.println(value);
		
		//4.切割: String[] split(String)
		String ss = "a,b,c,d";
		//String[] strings = ss.split("");//使用""可以进行切割
		String[] strings = ss.split(",");//当子字符串作为了刀,就不会再被作为内容.
		for (String string : strings) {
			System.out.println("子串:"+string);
		}
	}
}
