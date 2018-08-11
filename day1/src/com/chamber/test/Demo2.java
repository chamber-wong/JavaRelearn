package com.chamber.test;
/*
 * 数据类型:决定了变量所占内存空间的大小.并且给变量确定了类型.
 * 分类:有符号型(有负数,0,正数)和无符号型(只有0和正数)
 * 
 * 主要研究有符号型:
 * 两类:
 * 1.简单数据类型
 * 		>数值型
 * 			>>byte         一个字节                    [-2^7,2^7-1]
 * 			>>short        2个字节                      [-2^15,2^15-1]
 * 			>>int			4个字节			[-2^31,2^31-1]
 * 			>>long			8个字节			[-2^63,2^63-1]
 * 		>浮点型:小数-采用的科学计数法
 * 			>>float       4个字节                     最大值:3.4028235E38
 * 			>double		  8个字节                     最大值:1.7976931348623157E308
 * 		>布尔型
 * 			>>boolean     1个字节       只有两个值: true/false     
 * 						注意点:java中boolean值只有两个值.跟c不一样.c中0可以表示false,非零表示true
 * 		>字符型
 *         >char          1个字节    这里所对应的字符集是ASCII--世界通用标准       '0'--48   'A'--65   'a'--97
 *         常用的字符集:  GBK/GB2312  中国         ISO8859-1  欧洲的               utf8    通用标准         unicode   内部标准
 *         对于中文:      2个字节                          不支持中文-对应一个字节      3个字节                            2个字节
 *         
 *         编码:我们将字符(字符串)通过字符集转成对应的二进制形式
 *         解码:反之解码
 *         乱码:在编码与解码过程中使用的字符集不一致,造成了错误.
 * 2.引用数据类型--后面讲
 * 
 * 
 */
public class Demo2 {
	public static void main(String[] args) {
		//数据类型的使用
		byte b = 4;//定义了一个byte类型的变量b,并进行了初始化,赋值成4.
		System.out.println(b);
		//重新赋值
		b = 5;//重新将5存入变量b,原来的4被覆盖了.
		System.out.println(b);
		
		/*
		 * 注意:我们给变量赋值的时候有两种描述
		 * 1.初始化:定义变量的同时完成赋值
		 * 2.赋值:单独的给变量赋值
		 */
	    
		//获取float型,long型的最大值
		//在println内部使用+号,+的作用:1.运算     2.连接的意思.任何与字符串相连接的内容最终都会原样转成字符串输出
		System.out.println("float型的最大值:"+Float.MAX_VALUE);//3.4028235E38
		System.out.println("long型的最大值:"+Long.MAX_VALUE);//9223372036854775807
		System.out.println("double型的最大值:"+Double.MAX_VALUE);//1.7976931348623157E308
		System.out.println(Long.MAX_VALUE-Float.MAX_VALUE);//结果是-3.4028235E38,说明float型表示的范围比long型的大
	
		float f = 3.4f;//所有的小数默认是double型的,要表示float型,在数的后面加f
		double d = 3.4;
		
		//练习boolean型
		boolean boo = true;
		
		//练习字符
		char c = 'a';
		System.out.println((int)c);//得到字符对应的ASCII码
		
		//注意点:
		//1.数据类型之间的转换
		//数据的类型等级高低(根据数据的范围划分):从低到高:byte,char-short-int-long-float-double
		/*
		 * 自动类型转换:从低等级到高等级,不会造成数据的损失,但是可能浪费一些内存.
		 * 强制类型转换:从高等级到低等级.有可能造成数据的损失.
		 */
		
		byte bb = 23;//00010111
		short ss = bb;//00000000 00010111
		System.out.println(bb+"    "+ss);
		
		short s1 = 256;//00000001 00000000
		byte b1 = (byte)s1;//      00000000  第二个字节被砍掉了,造成了数据的损失
		
		//强制类型转换的实例:
		int num = 128;
		byte num1 = (byte)num; //num1 = -128
		System.out.println(num1);
		
		//实例二:整数默认是int型
		byte num2 = 20;
		num2 = (byte)(num2 + 2);
		
		//实例三
		char c1 = 'c';
		int c2 = c1;
		System.out.println((int)c1);
		System.out.println((char)(c1+2));
		
	}
}
