package com.qianfeng.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class HomeWord2 {
	public static void main(String[] args) {
		File file = new File("src/com/qianfeng/homework/test.txt");
//		System.out.println(file.getPath());

//		File1 file1 = new File1(file, 1);
//		file1.subtractFile();
//		file1.pasteFile();

		File1 file1 = new File1(file, 1);

		SubtractFile sFile = new SubtractFile(file1);
		PasteFile pFile = new PasteFile(file1);

		Thread thread1 = new Thread(sFile);
		Thread thread2 = new Thread(pFile);

		thread1.start();
		thread2.start();

	}
}

class SubtractFile implements Runnable {
	File1 file;

	public SubtractFile(File1 file) {
		super();
		this.file = file;
	}

	public void run() {
		file.subtractFile();
	}
}

class PasteFile implements Runnable {
	File1 file;

	public PasteFile(File1 file) {
		super();
		this.file = file;
	}

	public void run() {
		file.pasteFile();
	}
}

class File1 {
	File file;
	ArrayList<Integer> list = new ArrayList<>();
	int num;
	boolean flag = false;

	public File1(File file, int num) {
		super();
		this.file = file;
		this.num = num;
	}

	public synchronized void subtractFile() {

		FileInputStream fStream = null;
		try {
			int length = (int) (file.length() / num);
			fStream = new FileInputStream(file);
			for (int i = 0; i < num; i++) {
				if (flag) {
					wait();
				}
				int index = 0;
				for (int j = 0; j < length; j++) {
					index = fStream.read();
					if (index == -1)
						break;
					list.add(index);
				}
				System.out.println(list);
				list.clear();
				flag = true;
				notify();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void pasteFile() {

		File file1;
		FileOutputStream fos = null;
		try {
			String newFile = file.getParent() + "/test(1).txt";
			file1 = new File(newFile);
			if (!file1.isFile())
				file1.createNewFile();
			fos = new FileOutputStream(file1, true);
			for (int i = 0; i < num; i++) {
				if (!flag) {
						wait();
				}
				for (Integer integer : list) {
					System.out.println(integer);
					fos.write(integer);
				}
				flag = false;
				notify();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			flag = false;
//			notify();
		}
	}

}