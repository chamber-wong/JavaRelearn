package wang.chamber.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * 有五个学生，每个学生有3门课的成绩， 从键盘输入以上数据（包括姓名，三门课成绩）， 输入的格式：如：zhagnsan，30，40，60计算出总成绩，
 * 并把学生的信息和计算出的总分数高低顺序存放在磁盘文件"stud.txt"中。
 * 
 * @author 弄风
 *
 */
public class HomeWork2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		TreeSet<Student> set = new TreeSet<>();
		for (int i = 0; i < 5; i++) {			String string = scanner.nextLine();
			String[] strings = string.split(",");
			System.out.println(Arrays.toString(strings));
			Student student = new Student(strings[0], Integer.parseInt(strings[1]), Integer.parseInt(strings[2]), Integer.parseInt(strings[3]));
			set.add(student);
			System.out.println(student.getName() + "的总成绩为:"+student.getSum());
		}
		System.out.println(set);
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter("stud.txt"));
			for (Student student : set) {
				writer.write("姓名:"+student.getName() + "\t");
				writer.write("成绩1:"+student.getG1() + "\t");
				writer.write("成绩2:"+student.getG2() + "\t");
				writer.write("成绩3:"+student.getG3() + "\t");
				writer.write("总成绩"+student.getSum() + "\t");
				writer.newLine();
				writer.flush();
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

class Student implements Comparable<Object> {
	private String name;
	private int g1;
	private int g2;
	private int g3;
	private int sum;

	public Student(String name, int g1, int g2, int g3) {
		super();
		this.name = name;
		this.g1 = g1;
		this.g2 = g2;
		this.g3 = g3;
		setSum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getG1() {
		return g1;
	}

	public void setG1(int g1) {
		this.g1 = g1;
	}

	public int getG2() {
		return g2;
	}

	public void setG2(int g2) {
		this.g2 = g2;
	}

	public int getG3() {
		return g3;
	}

	public void setG3(int g3) {
		this.g3 = g3;
	}

	public int getSum() {
		return sum;
	}

	private void setSum() {
		this.sum = g1 + g2 + g3;
	}
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", g1=" + g1 + ", g2=" + g2 + ", g3=" + g3 + ", sum=" + sum + "]";
	}

	@Override
	public int compareTo(Object o) {
		if (!(o instanceof Student)) {
			throw new ClassCastException();
		}
		Student student = (Student) o;
		int num = student.getSum() - sum;
		return num == 0 ? student.getName().compareTo(name) : num;
	}

}
