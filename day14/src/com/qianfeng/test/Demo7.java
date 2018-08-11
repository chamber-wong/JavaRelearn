package com.qianfeng.test;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo7 {
	public static void main(String[] args) {
		//�������� <? super E>
		//TreeSet(Comparator<? super E> comparator) :�����E��TreeSet����ķ�������һ��,��������EӦ�ñ�ʾ��Student3
		
		//����Student3��ıȽ�������
		ComWithStu comWithStu = new ComWithStu();
		//����Teacher1��ıȽ�������
		ComWithTea comWithTea = new ComWithTea();
		//����Person1��ıȽ�������
		ComWithPerson comWithPerson = new ComWithPerson();
		//����GoodStudent��ıȽ�������
		ComWithGood comWithGood = new ComWithGood();
		
		TreeSet<Student3> set = new TreeSet<>(comWithStu);//��Ϊ�������Ƶ���Student3�����ĸ���
		//TreeSet<Student3> set = new TreeSet<>(comWithTea);//������ʹ��,��ΪTeacher2����Student3��û�й�ϵ
		//TreeSet<Student3> set = new TreeSet<>(comWithPerson);//����  ,��ΪPerson2����Student3��ĸ���
		//TreeSet<Student3> set = new TreeSet<>(comWithGood);//������,��ΪGoodStudent����Student3�������
		set.add(new Student3("bingbing"));
		set.add(new Student3("bingbing1"));
		set.add(new Student3("bingbing2"));
	}
}
//����Student3��ıȽ���
class ComWithStu implements Comparator<Student3>{

	public int compare(Student3 o1, Student3 o2) {
		
		return o1.name.compareTo(o2.name);
	}
}
//����Teacher2��ıȽ���
class ComWithTea implements Comparator<Teacher2>{
	public int compare(Teacher2 o1, Teacher2 o2) {
		
		return 0;
	}
}
//����Person2��ıȽ���
class ComWithPerson implements Comparator<Person2>{
	public int compare(Person2 o1, Person2 o2) {
        return 0;
	}
}

//����GoodStudent��ıȽ���
class ComWithGood implements Comparator<GoodStudent>{
	public int compare(GoodStudent o1, GoodStudent o2) {
		return 0;
	}
}

class Person2{
	 String name;

	public Person2(String name) {
		super();
		this.name = name;
	}

	public String toString() {
		return "Person2 [name=" + name + "]";
	}
}

class Teacher2 extends Person2{
	public Teacher2(String name) {
		super(name);
	}
}
class Student3 extends Person2{
	public Student3(String name) {
		super(name);
	}
}

class GoodStudent extends Student3{
	public GoodStudent(String name) {
		super(name);
	}
}

