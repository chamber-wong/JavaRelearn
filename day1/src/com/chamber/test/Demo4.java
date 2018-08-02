package com.qianfeng.test;
/*
 * 讲解分支语句
 * 
 * 实例:判断当前的月份属于哪个季节?
 * 分析:要使用分支
 * 季节:春(3,4,5)夏(6,7,8)秋(9,10,11)冬(12,1,2)
 */
public class Demo4 {
	public static void main(String[] args) {
		int a = 3;
		if (a == 3) {
			System.out.println("春");
		}else if (a == 4) {
			System.out.println("春");
		}else if (a == 5) {
			System.out.println("春");
		}else if (a == 6) {
			System.out.println("夏");
		}else if (a == 7) {
			System.out.println("夏");
		}else if (a == 8) {
			System.out.println("夏");
		}else if (a == 9) {
			System.out.println("秋");
		}else if (a == 10) {
			System.out.println("秋");
		}else if (a == 11) {
			System.out.println("秋");
		}else if (a == 12) {
			System.out.println("冬");
		}else if (a == 1) {
			System.out.println("冬");
		}else {
			System.out.println("冬");
		}
		
		//利用运算符优化代码
		if (a == 3 || a == 4 || a==5) {
			System.out.println("春");
		}else if (a == 6 || a == 7 || a==8) {
			System.out.println("夏");
		}else if (a == 9 || a == 10 || a==11) {
			System.out.println("秋");
		}else {
			System.out.println("冬");
		}
		
		//3<a<5    a>3 && a<5
		if (a>=1 && a<=12) {
			if (a>=3 && a<=5) {
				System.out.println("春");
			}else if (a == 6 || a == 7 || a==8) {
				System.out.println("夏");
			}else if (a == 9 || a == 10 || a==11) {
				System.out.println("秋");
			}else {
				System.out.println("冬");
			}
		}else {
			System.out.println("输入错误");
		}
		
		//注意点:
		//如果if()后面没有加{},默认只能跟一条语句,如果想写多条加{}.
		if (a>4) 
			System.out.println("ok");
		//后面可以直接跟空语句
		if (a>4) ;
		
		//学习switch
		//当把break删掉,程序会继续执行下面的代码直到遇到break再结束.我们把break的这种行为称为穿透性
		//switch(a) :关于a:整型,字符串型(jdk1.8开始允许使用的),枚举.
		switch (a) {
		case 3://注意:case后面不能放boolean型的判断条件
		case 4:case 5:
			System.out.println("春");
			break;//结束switch的作用,
		case 6:case 7:case 8:
			System.out.println("夏");
			break;
		case 9:case 10:case 11:
			System.out.println("秋");
			break;
		default:
			System.out.println("冬");
			break;
		}
		
		//比较if和switch?
		//分支少的时候用if,分支多的时候用switch
	}
}
