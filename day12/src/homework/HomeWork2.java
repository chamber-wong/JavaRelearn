package homework;

import java.util.ArrayList;

public class HomeWork2 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("王春博", "三班", 100));
		list.add(new Student("马文超", "三班", 90));
		list.add(new Student("李立", "三班", 80));
		list.add(new Student("张三", "二班", 70));
		list.add(new Student("李四", "一班", 60));
		
		for (Student student : list) {
			System.out.println("姓名为:"+student.getName()
			+ "\t班级为:" + student.getCalss1()
			+ "\t成绩为:" + student.getScore());
		}
	}

}
