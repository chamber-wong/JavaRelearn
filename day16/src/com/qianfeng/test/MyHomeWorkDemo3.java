package com.qianfeng.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*
 * 有两个班级,每个班级有多个学生,遍历所有的班级并显示每个班的所有的班级成员
 * 要求:1.创建学生类2.使用map,list3.要进行排序4.使用两种方式遍历
 * 
 * 分析:
 * 由题意可知		每个班级		都对应着  	多个学生
 * 即	班级  	和  	多个学生		是映射的关系  		
 * 由图所示
 *    key             value
 * 	   班级                          多个学生
 *  ———————			 ————————
 * |   1   |        |  A学生    |
 *  ———————			|  B学生    |
 *  				|  .学生    |
 *  				 ————————
 *  ———————			 ————————
 * |   2   |        |  C学生    |
 *  ———————			|  D学生    |
 *  				|  .学生    |
 *  				 ————————
 * 所以第一反应是用map进行存储	班级	和	相应班级成员
 * 即	使	班级为key	相应班级成员为value
 * 但是	map中的	一个key 只能存储一个value
 * 所以为了使用map
 *   key              value
 *   班级                            List 			   多个学生
 *  ———————		  	 ——————		 	 ————————
 * |   1   |        | list |		|  A学生    |
 *  ———————			 ——————			|  B学生    |
 *  								|  .学生    |
 *  				 				 ————————
 *  ———————			 ——————			 ————————
 * |   2   |        | list |		|  C学生    |
 *  ———————			 ——————			|  D学生    |
 *  								|  .学生    |
 *  				 				 ————————
 *  所以最终选择的结构是Map<Integer,List<Student>>
 *  因为我们需要实现的功能，是添加	班级 	和	相对应的学生
 *  所以我们可以把这些功能封装成学校(School)类
 */

public class MyHomeWorkDemo3 {
	private Map<Integer, List<Student>> map = new TreeMap<>();

	// 添加一个学生
	public void addStudent(int classNumber, Student student) {
		// 在向学校添加学生时,有两种情况
		if (map.containsKey(classNumber)) {
			// 第一种,学生的班级已经存在,所以拿到班级所对应的list
			List<Student> list = map.get(classNumber);
			// 向list中添加学生
			list.add(student);
		} else {
			// 第二种,学生的班级不存在
			// 所以需要先new一个list对象
			List<Student> list = new ArrayList<>();
			// 将student存入list中
			list.add(student);
			// 再将list作为value值放入map
			map.put(classNumber, list);
		}
	}

	// 使用keySet()展示学生信息
	public void showAllStudent1() {
		System.out.println("班级\t\t学生姓名\t\t学生年龄");
		// 遍历学生
		for (int classNumber : map.keySet()) {
			// 得到班级对应的List<Student>
			List<Student> list = map.get(classNumber);
			// 对List<Student>进行排序
			Collections.sort(list, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					if (o1.getAge() == o2.getAge()) {
						return o1.getName().compareTo(o2.getName());
					}
					return o1.getAge() - o2.getAge();
				}
			});
			// 遍历list中的学生
			for (Student stu : list) {
				System.out.println(classNumber + "\t\t" + stu.getName() + "\t\t" + stu.getAge());
			}
		}
	}

	// 使用entrySet()遍历学生
	public void showAllStudent2() {
		System.out.println("班级\t\t学生姓名\t\t学生年龄");
		// 遍历学生
		for (Map.Entry<Integer, List<Student>> entry : map.entrySet()) {
			// 得到对应的班级
			Integer classNumber = entry.getKey();
			// 得到对应的List<Student>
			List<Student> list = entry.getValue();
			// 对List<Student>进行排序
			Collections.sort(list, new Comparator<Student>() {
				@Override
				public int compare(Student o1, Student o2) {
					if (o1.getAge() == o2.getAge()) {
						return o1.getName().compareTo(o2.getName());
					}
					return o1.getAge() - o2.getAge();
				}
			});
			// 遍历list中的学生
			for (Student stu : list) {
				System.out.println(classNumber + "\t\t" + stu.getName() + "\t\t" + stu.getAge());
			}
		}
	}

	public static void main(String[] args) {
		MyHomeWorkDemo3 school = new MyHomeWorkDemo3();

		school.addStudent(1, new Student("张三", 48));
		school.addStudent(1, new Student("李四", 28));
		school.addStudent(1, new Student("王五", 38));
		school.addStudent(1, new Student("赵六", 18));
		school.addStudent(2, new Student("巴巴", 38));
		school.addStudent(2, new Student("热热", 28));
		school.addStudent(2, new Student("丽丽", 18));
		school.addStudent(2, new Student("迪迪", 8));

		school.showAllStudent1();
		// school.showAllStudent2();
	}
}

class Student {
	private String name;
	private int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

}