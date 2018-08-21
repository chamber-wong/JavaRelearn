package wang.chamber.homework;
/**
 * 将当前的工程目录中后缀名为.txt的文件找出,并将内容添加到名字叫zong.txt的文件中,并将该文件重新放到工程目录/day21/zuoye/third/下面.
 * @author 弄风
 *
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class HomeWork3 {
	
	public static void main(String[] args) throws IOException {
		File file = new File("G:\\JavaSE\\qianfeng\\day20");
		System.out.println(file.getAbsolutePath());
		findTXT(file);

		File file2 = new File("zuoye/third/zong.txt");
		File file3 = new File(file2.getParent());
		file3.mkdirs();
		file2.createNewFile();
		BufferedWriter writer = new BufferedWriter(new FileWriter(file2));
		for (String string : list) {
			writer.write(string);
			writer.newLine();
			writer.flush();
		}
		writer.close();
		
	}
	static ArrayList<String> list = new ArrayList<>();
	
	public static void findTXT(File file){
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File file2 : files) {
				findTXT(file2);
			}
		} else {
			if (file.getName().contains(".txt")) {
				list.add(file.getAbsolutePath());
				return;
			}
		}
	}
}
