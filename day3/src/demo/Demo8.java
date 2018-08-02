package com.qianfeng.test;
/*
 * 局部变量:我们将定义在函数,for,if中的变量及形参称为局部变量
 * 全局变量:我们一般把直接定义在类中的变量称为全局变量
 * 
 * 生命周期:从定义当前的变量开始到变量被销毁的过程
 * 作用域:在生命周期内变量可以起作用的范围.
 * 
 * 全局变量的作用域:整个类,除了static修饰的方法
 * 局部变量的作用域:从定义当前的变量开始到变量所在的函数,for,if等结束.
 * 
 * 生命周期结束意味着变量被释放.
 * 
 * 区别:对于全局变量,如果不赋值也可以使用,系统会赋一个默认值--0
 * 		对于局部变量,必须先赋值后使用.
 * 
 * 
 */
public class Demo8 {
	int a;//全局变量

    public static void main(String[] args) {
    	
		int b;//局部变量
		
		if (true) {
			int c;//局部变量
		}
	}
    
    public void test(int d){//局部变量
    	for(int i=0;i<4;i++){
    		int e;//局部变量
    		e = a;
    	}
    }
}
