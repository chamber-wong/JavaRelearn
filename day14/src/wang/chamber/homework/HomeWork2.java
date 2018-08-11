package wang.chamber.homework;

import java.util.HashMap;
import java.util.Map;

public class HomeWork2 {
	public static void main(String[] args) {
		//保存班级信息
		Map<Integer, Map<Integer, Student1>> map = new HashMap<>();
		//保存一班学生信息
		Map<Integer, Student1> map1 = new HashMap<>();
		//保存二班学生信息
		Map<Integer, Student1> map2 = new HashMap<>();
		
		
		map1.put(1, new Student1("王春博"));
		map1.put(2, new Student1("李立"));
		map1.put(3, new Student1("马文超"));
		
		map2.put(1, new Student1("刘文豪"));
		map2.put(2, new Student1("王梅杰"));
		map2.put(3, new Student1("赖世豪"));
		
		map.put(1, map1);
		map.put(2, map2);
		
		for (Integer classes : map.keySet()) {
			Map<Integer,Student1> m = map.get(classes);
			for (Integer num : m.keySet()) {
				Student1 s = m.get(num);
				System.out.println("学生班级为:"+classes+"  姓名为:"+s.getName()+"  学号为:"+num);
			}
			
		}
		
	}
}

class Student1 {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student1(String name) {
		super();
		this.name = name;
	}

}
