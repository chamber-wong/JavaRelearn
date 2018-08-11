package com.qianfeng.test;

import java.util.HashSet;

public class Demo7 {
    /*
     * Set:�����,�����ظ���
     * 		HashSet:�ײ��ǹ�ϣ��,�̲߳���ȫ��
     *      TreeSet:�ײ��Ƕ�����,�̲߳���ȫ��
     *      
     *      
     *HashSet���ʵ��ȥ��:
     *��ͨ������Ԫ���ڲ���hashCode��equals����ʵ��ȥ��.���ȵ���hashCode����,�Ƚ�����Ԫ�صĹ�ϣֵ,�����ϣֵ��ͬ,ֱ��
     *��Ϊ����������,ֹͣ�Ƚ�.�����ϣֵ��ͬ,��ȥ����equals����,����true,��Ϊ��һ������.����false,��Ϊ����������.
     
     *ʵ��:ʹ��HashSetʵ�ֶ�Person1������ȥ��
     *����:Ҫȡ��дPerson1��hashCode��equals����
     *�Լ�ָ���ȽϹ���:��������������Ƚ�
     *
     *ע��:1.hashSet������ʵ������
     *2.�����Զ������,Ҫ�밴���Լ��ƶ��ıȽϹ������ȥ��,������дhashCode��equals����
     */
	
	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		//��String������д��hashCode��equals����
		//��add�ڲ�ʵ�ֵ�ȥ�صĹ���.Ĭ�ϵ��õ����ַ�����hashCode��equals����,ʵ��ȥ��
		set.add("java1");
		set.add("java2");
		set.add("java4");
		set.add("java3");
		set.add("java3");
		
		System.out.println(set);
		
		//ʵ��
		HashSet set1 = new HashSet<>();
		set1.add(new Person1("bingbing", 20));
		set1.add(new Person1("bingbing1", 19));
		set1.add(new Person1("bingbing2", 24));
		set1.add(new Person1("bingbing", 20));
		
		System.out.println(set1);
	}
}

class Person1{
	String name;
	int age;
	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + "]";
	}
	
	//��дhashCode����
	//��������������Ƚ�,ֻҪ������������ͬ����Ϊ��һ����
	@Override
	public int hashCode() {
		return age*1000+name.hashCode();
	}
	
	//��дequals����---�����Լ��Ĺ�����бȽ�
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person1)) {
			throw new ClassCastException();
		}
		
		//����ת��
		Person1 person = (Person1)obj;
		return age==person.age && name.equals(person.name);
	}
}

