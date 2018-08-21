package wang.chamber.homework;

import java.io.File;
import java.util.ArrayList;

/**
 * 列出指定目录下满足指定条件的文件的清单，包括子目录(当前的工程目录)
 * 
 * @author 弄风
 *
 */
public class HomeWork1 {

	ArrayList<String> list = new ArrayList<>();

	public static void main(String[] args) {
		File file = new File("G:\\JavaSE\\qianfeng\\day20");
		HomeWork1 hWork1 = new HomeWork1();
		hWork1.allFile(file);
		System.out.println(hWork1.list);
		
		ArrayList<String> list = hWork1.matchString("te");
		System.out.println(list);
		
	}

	/**
	 * 匹配文件名中包含指定字符的文件名
	 * @param match
	 * @return
	 */
	public ArrayList<String> matchString(String match) {
		ArrayList<String> list1 = new ArrayList<>();
		for (String string : list) {
			if (string.matches(".*" + match+".*")) {
				list1.add(string);
			}
		}
		return list1;
	}

	/**
	 * 获取所有文件
	 * 
	 * @param file
	 */
	public void allFile(File file) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				allFile(file2);
			}
		} else {
			list.add(file.getName());
			return;
		}

	}
}
