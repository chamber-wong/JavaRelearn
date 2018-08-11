package wang.chamber.homework;

import java.util.HashMap;
import java.util.Map;

public class HomeWork1 {
	public static void main(String[] args) {
		Student student1 = new Student("王春博", 18, "信息工程");
		Student student2 = new Student("马文超", 19, "信息工程");
		Student student3 = new Student("李立", 20, "信息工程");
		Student student4 = new Student("赖世豪", 21, "信息工程");
		Student student5 = new Student("王梅杰", 22, "信息工程");
	
		Map<Integer, Student> map = new HashMap<>();
		map.put(1, student1);
		map.put(2, student2);
		map.put(3, student3);
		map.put(4, student4);
		map.put(5, student5);
		
		for (Integer num : map.keySet()) {
			System.out.println("学生信息为:学号:"+num+"  姓名:"+map.get(num).getName()
					+"  年龄:" + map.get(num).getAge()
					+"  专业:" + map.get(num).getSpecialty());
		}
	}
}

class Student {

	private String name;
	private int age;
	private String specialty;

	public Student(String name, int age, String specialty) {
		super();
		this.name = name;
		this.age = age;
		this.specialty = specialty;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	
}
