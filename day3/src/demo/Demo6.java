package demo;

public class Demo6 {
	public static void main(String[] args) {
		/*
		 * 实例:使用函数求两个数的最大值?
		 */
		
		//测试
		int max = getMax(4, 5);
		System.out.println(max);
	}
	
	public static int getMax(int a,int b){
		//三目运算符
		//int c = a>b?a:b;
		
		//if
		int c = 0;
		if (a>b) {
			c = a;
		}else {
			c = b;
		}
		
		return c;
	}
}
