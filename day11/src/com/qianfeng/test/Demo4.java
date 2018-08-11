package com.qianfeng.test;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * 可变字符串:(字符串缓冲区)
		 * StringBuffer:(jdk1.0),是线程安全的,要考虑线程安全问题.
		 * StringBuilder:(jdk1.5),是线程不安全的,不需要考虑线程安全问题.
		 * 
		 * 区分:
		 * 在不考虑线程安全的前提下,尽量使用StringBuilder,效率高,速度快.
		 */
		//创建空的可变字符串对象
		StringBuffer stringBuffer = new StringBuffer();
    	//1.存储：
    	//StringBuffer append(boolean b)   从最后插入
		stringBuffer.append("1000");
		stringBuffer.append("phone");
		System.out.println(stringBuffer);
        //StringBuffer insert(int offset, boolean b)   从指定位置插入
		stringBuffer.insert(0, true);
		System.out.println(stringBuffer);
        //2.删除：
        //StringBuffer delete(int start, int end) 
		stringBuffer.delete(0, 4);
		System.out.println(stringBuffer);
        //StringBuffer deleteCharAt(int index)
        //3.修改：
        //StringBuffer replace(int start, int end, String str)  替换指定的子字符串
        //void setCharAt(int index, char ch) 修改一个字符
		stringBuffer.replace(0, 4, "9999");
		System.out.println(stringBuffer);
		
        //4.获取：
        //char charAt(int index) 
		char c = stringBuffer.charAt(1);
    	//int indexOf(String str)
		int index = stringBuffer.indexOf("pho");
		System.out.println(index);//4
    	//int indexOf(String str, int fromIndex)
		int index1 = stringBuffer.indexOf("pho", 6);//-1
		System.out.println(index1);
    	//int lastIndexOf(String str) 
        //返回指定子字符串(从右边开始计数)在此字符串第一次出现时的索引
        //int lastIndexOf(String str, int fromIndex) 
        //返回指定子字符串(从右边开始计数,范围:当前指定的位置-0)在此字符串第一次出现时的索引 
        //int length() 
        //返回长度（字符数）。 
		System.out.println(stringBuffer.length());
        //5.反转：
        //StringBuffer reverse()
		System.out.println(stringBuffer.reverse());
	}
}
