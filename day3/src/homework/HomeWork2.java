package homework;

import java.util.Scanner;
/**
 * 计算两个数字的和差积商
 * @author 弄风
 *
 */
public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入算式:");
//		String sp = scanner.next();
//		
		System.out.println("请输入要计算的第一个数字:");
		int a = scanner.nextInt();
		System.out.println("请输入要计算的运算符:");
		String str = scanner.next();
		System.out.println("请输入要计算的第二个数字:");
		int b = scanner.nextInt();
		HomeWork2 hWork2 = new HomeWork2();
		double dou = hWork2.getCount(a, b, str);
		System.out.println("结果为:"+a+str+b+"="+dou);
		scanner.close();
	}
	/**
	 * 根据传入的两个数字和运算符,计算并返回
	 * @param a 第一个数字
	 * @param b 第二个数字
	 * @param symbol 运算符
	 * @return 返回运算结果
	 */
	public double getCount(int a,int b,String symbol) {
		if(symbol.equals("+")) {
			return a+b;
		}else if (symbol.equals("-")) {
			return a-b;
		}else if(symbol.equals("*")){
			return a*b;
		}else{
			return (double)a/(double)b;
		}
		
	}

}
