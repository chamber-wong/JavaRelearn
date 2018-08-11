package wang.chamber.statisticsChar;

import java.util.Comparator;
import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;

public class StatisticsChar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一句话:");
		String string =scanner.nextLine();
		char[] characters = string.toCharArray();
		
		Map<Character, Integer> map = new TreeMap<>();
		
		//为map赋值
		for (char c : characters) {
			int i = map.containsKey(c) ? map.get(c) : 1;
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		//遍历输出
		for (char c : map.keySet()) {
			int num = map.get(c);
			System.out.print(c+"("+num+")");
		}
	}
}
