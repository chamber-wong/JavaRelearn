package demo;

import java.util.Scanner;//导入类

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * 函数的功能:简化了代码,增加了代码的复用性,提高了代码的安全性,简化了相应的操作.
		 * 
		 * 函数的构成  修饰词    返回值类型    函数名(参数列表){//函数体
		 *      执行的代码;
		 *      return 返回值;
		 * }
		 * 
		 * 修饰词:确定当前函数的使用范围,现在使用的是public,先暂时不考虑.
		 * 返回值类型:告诉别人当前函数返回值的类型.:注意:返回值可以没有,但是这里不能什么都不写,如果有返回值写对应的类型,如果没有写void
		 * 函数名:是当前函数的名字.不能省略.命名规则:遵守小驼峰原则(一个函数名可以由多个单词组成,除第一个单词以外,其他的每个单词的首字母大写)
		 * 		要求:尽量做到见名知意
		 * 参数列表:执行函数时传入函数的数据,可以有0个或多个.多个参数之间以,隔开.如果没有参数,函数名后面的()不能省略.
		 * 函数体:函数真正实现功能的地方
		 * 执行的代码:实现的功能
		 * return :是一个动词,向函数外抛出返回值的意思.类型与返回值类型一致.
		 * 	   注意:1.如果没有返回值,不用写return.如果有,return后面只能返回一个值.
		 * 			2.还有结束的意思.return后面的代码不会执行.
		 * 
		 * 总结:我们在创建一个函数的时候,要求每个函数只完成一个功能.强调函数功能的单一性.
		 */
		//求两个数的和?
		//注意点:1.函数的定义不能嵌套,函数的调用可以.
		//2.我们要向使用定义好的函数,必须通过调用实现
		//3.函数调用的基本构成:函数名+()
		//4.通常在面向过程的语言中我们称为函数,在面向对象的语言中称为方法.
		//函数的调用
        qiuhe();
		
        qiuhe();
	}
	
	//函数的定义
	public static void qiuhe(){
		Scanner  scanner = new Scanner(System.in);//可以让我们到控制台接收数据
		System.out.println("请输入第一个数:");
		int num1 = scanner.nextInt();//获取一个整数
		System.out.println("请输入第二个数:");
		int num2 = scanner.nextInt();//获取一个整数
		
		int sum = num1+num2;
		System.out.println("和:"+sum);
	}
}
