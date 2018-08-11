package wang.chamber.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 使用map统计一句英文字符中相同字符出现的次数
 * @author 弄风
 *
 */
public class HomeWork3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一句话:");
		String string =scanner.nextLine();
		char[] characters = string.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		//为map赋值
		for (char c : characters) {
			if (map.get(c) != null) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
		
		//遍历输出
		for (char c : map.keySet()) {
			int num = map.get(c);
			System.out.print(c+"("+num+")");
		}
	}
}
