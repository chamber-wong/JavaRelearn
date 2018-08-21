package wang.chambert.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class HomeWork1 {
	public static void main(String[] args) {
		BufferedWriter writer = null;
		try {
			Random random = new Random();
			writer = new BufferedWriter(new FileWriter("random.txt"));
			for(int i = 1;i<=100;i++) {
				writer.write(i+" ");
				writer.write(""+random.nextInt(100));
				writer.newLine();
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
