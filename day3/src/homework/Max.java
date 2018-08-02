package homework;

import java.util.Scanner;
/**
 * 使用函数
 * 计算两个数字中最大的数
 * @author 弄风
 *
 */
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入第一个值:");
		int a = sca.nextInt();
		System.out.println("请输入第二个值:");
		int b = sca.nextInt();
		Max main = new Max();
		int max = main.max(a, b);
		System.out.println("这个这两个数中的最大值为:"+max);
		sca.close();
	}
	public int max(int a,int b) {
		int max;
		if(a >= b) {
			max=a;
		}else {
			max=b;
		}
		return max;
	}

}
