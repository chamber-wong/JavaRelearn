package homework;

import java.util.Scanner;
import java.util.function.LongBinaryOperator;

/**
 * 使用if判断QQ是否合法
 * 
 * @author 弄风
 *
 */
public class HomeWork1 {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		loop : while(true) {
			System.out.println("请输入您的QQ号:");
			String string = scanner.next();
			char[] cs = string.toCharArray();
			for (char c : cs) {
				if (!(c >= 38 && c <=57)) {
					System.out.println("您输入的数字中包含非法字符,请重新输入:");
					continue loop;
				}
			}
			if (cs.length<5 || cs.length>13) {
				System.out.println("您输入的QQ号长度不正确,请重新输入:");
				continue;
			}else if(cs[0] == '0'){
				System.out.println("QQ开头不能为0,请重新输入:");
				continue;
			}else {
				System.out.println("输入正确!");
				break;
			}
		}
	}

	
}
