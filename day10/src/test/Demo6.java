package test;
/**
 * 实例:求一个程勋运行的时间
 * 分析:1.知道开始的时间
 * 2.运行的时间
 * 3.结束的时间
 * @author 弄风
 *
 */
public class Demo6 {
	public static void main(String[] args) {
		Zi zi = new Zi();
		double time = zi.getTime();
		System.out.println(time);
	}
}
abstract class Fu{
	public abstract void function();
	public double getTime() {
		long startTime = System.nanoTime();//获取的当前系统时间,单位:纳秒  1秒 = 0.000000001秒
		
		function();
		
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
}
class Zi extends Fu{
	public void function() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	}
	
}