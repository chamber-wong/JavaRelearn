package wang.chamber.homework;

import java.io.File;

/**
 * 删除指定目录下的文件及文件夹，包括子目录中的内容(当前的工程目录)
 * 
 * @author 弄风
 *
 */
public class HomeWork2 {
	public static void main(String[] args) {
		File file = new File("G:\\JavaSE\\qianfeng\\day20\\temp6");
		delectAll(file);
	}

	/**
	 * 删除此文件夹下的所有文件和文件夹
	 * @param file
	 */
	public static void delectAll(File file) {
		if (file.isFile()) {
			file.delete();
			return;
		} else {
			File[] files = file.listFiles();
			for (File file2 : files) {
				delectAll(file2);
			}
			file.delete();
		}
	}
}
