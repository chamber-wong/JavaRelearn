package com.qianfeng.homework;

import java.util.Comparator;
import java.util.TreeSet;
/**
 * 使用两种方式实现TreeSet的排序和去重
 * @author 弄风
 *
 */
public class HomeWork1 {

	public static void main(String[] args) {
		//使用系统排序(重写compareTo)
		//使用了姓名排序
		TreeSet<Person> set = new TreeSet<>();
		set.add(new Person("c", 118));
		set.add(new Person("a", 118));
		set.add(new Person("d", 118));
		set.add(new Person("b", 118));
		set.add(new Person("b", 117));
		System.out.println("使用系统排序--使用了姓名排序:"+set);
		
		//使用手动排序
		//使用了年龄排序
		TreeSet<Person> set1 = new TreeSet<>(new ComWithAge());
		set1.add(new Person("c", 10));
		set1.add(new Person("a", 3));
		set1.add(new Person("d", 0));
		set1.add(new Person("b", 1));
		set1.add(new Person("a", 0));
		System.out.println("使用手动排序--使用了年龄排序:"+set1);
	}

}
class Person implements Comparable<Object>{
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object object) {
		if (!(object instanceof Person)) {
			throw new ClassCastException();
		}
		Person person = (Person)object;
		//按照姓名排序
		int num = name.compareTo(person.name);
		return num == 0? age-person.age : num;
	}
	
}
class ComWithAge implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		if (!(o1 instanceof Person)) {
			throw new ClassCastException();
		}
		if (!(o2 instanceof Person)) {
			throw new ClassCastException();
		}
		Person person1 = (Person)o1;
		Person person2 = (Person)o2;
		int num = person1.age-person2.age;
		return num == 0 ? person1.name.compareTo(person2.name) : num;
	}
	
}