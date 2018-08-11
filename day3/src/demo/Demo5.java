package demo;

import java.util.Scanner;
/*
 * 形参和实参的注意点:他们的个数,位置,类型必须一致
 * 在实际赋值的时候,程序会按照顺序将实参的值依次赋给形参,实际参与运算的是形参.
 * 
 * return的功能:
 * 1.通过return可以将函数的值传出函数
 * 2.return有结束的意思,return后面的代码不会执行
 * 3.如果函数有返回值,要保证在任何情况下都有返回值
 * 
 * 函数的定义:具有某种特定功能的一段代码
 */
public class Demo5 {
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);//可以让我们到控制台接收数据
		System.out.println("请输入第一个数:");
		int num1 = scanner.nextInt();//获取一个整数
		System.out.println("请输入第二个数:");
		int num2 = scanner.nextInt();//获取一个整数
		
		//调用当前的函数
		int mysum = qiuhe(num1, num2);//实参:实际的参数.函数调用的处参数称为实参
		
		System.out.println("和:"+mysum);
	}
	//函数的定义
	//						形参:形式上的参数.函数定义出的参数称为形参.特点:必须接受实参的值才能起作用
							//	起作用的范围是当前的函数
	public static int qiuhe(int a,int b){//函数在执行的时候,相当于有一段隐藏的代码:a = num1   b = num2
		int sum = a+b;
		return sum;
	}
	
	/*
	 *  * return的功能:
	 	* 1.通过return可以将函数的值传出函数
	 	* 2.return有结束的意思,return后面的代码不会执行
	 	* 3.如果函数有返回值,要保证在任何情况下都有返回值
	 */
	public int test(int a){
//		return 2;
//		System.out.println("hello");//2.return有结束的意思,return后面的代码不会执行
		
		//3.如果函数有返回值,要保证在任何情况下都有返回值
		if (a > 5) {
			
		}else {
			
		}
		return 5;
	}
}


