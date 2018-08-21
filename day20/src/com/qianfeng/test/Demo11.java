package com.qianfeng.test;
/*
 * 递归:定义:有条件的自己调用自己(方法)
 * 
 * 条件:1.要给一个出口负责结束当前的递归
 * 2.循环次数不能太多,否则占用内存太多,死机
 * 
 * 死循环:1.自己调用自己(方法)
 * 2.方法之间互相调用
 * 
 * 实例:求1-10之间的和
 */
public class Demo11 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i<=10 ; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		Person person = new Person();
		person.run();
	}
	

}
class Person{
	static int sum = 0;
	static int i = 1;
	
	public void run() {
		
		sum += i;
		if (i++ == 11) {
			return ;
		}
		System.out.println(sum);
		run();
		
	}
}