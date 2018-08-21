package wang.chambert.homework;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeWork2 {
	public static void main(String[] args) {
		BufferedWriter writer = null ;
		try {
//			File file = new File
			writer = new BufferedWriter(new FileWriter("all of word.txt"));
			for(int i = 0; i<65535 ;i++) {
				writer.write((char)i);
				if (i% 100 == 0) {
					writer.newLine();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
