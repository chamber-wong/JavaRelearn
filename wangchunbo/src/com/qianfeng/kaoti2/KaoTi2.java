package com.qianfeng.kaoti2;

import java.io.File;
import java.io.IOException;

public class KaoTi2 {
	public static void main(String[] args) {
		mkFile();
	}
	public static void mkFile() {
		File file = new File("./src/com/qianfeng/kaoti2/ExemFile");
		file.mkdirs();
		if (file.isDirectory()) {
			for (int i = 1; i < 6; i++) {
				String string = "./src/com/qianfeng/kaoti2/ExemFile/"+"Company"+i+".cy";
				File file2 = new File(string);
				try {
					file2.createNewFile();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}else {
			file.mkdirs();
		}
		
	}
}
