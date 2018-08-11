package 文件写入;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			System.out.println(file.getAbsolutePath());
			FileWriter fWriter = new FileWriter(file);
			BufferedWriter bWriter = new BufferedWriter(fWriter);
			bWriter.write("在这写入一句话!");
			bWriter.close();
			System.out.println("文件创建成功");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
