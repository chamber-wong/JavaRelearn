package com.qianfeng.test;
/*
 * ���췽��:����ʱ��Ĺ���:����+()
 * ����:�Զ�������Խ��г�ʼ��,������ǲ��Լ��������췽��,ϵͳ�����Ĭ�ϵ��޲ι��췽��.
 * 
 * �����Լ��Ĺ��췽��:
 * ����:
 * �޲εĹ��췽��:�Ὣ��Ա������ʼ����null��0��false��
 * �вεĹ��췽��:�Ὣ��Ա�������г�ʼ������ֵ(��ֵ��ͨ�����������ֵ)
 * 
 * ����ʱ�Ļ�������:
 * ���δ�    ������(�����б�){
 * 		������
 * }
 * ע���:1.û�з���ֵ��һ��   2.�����������뵱ǰ��������ͬ
 * 
 * 
 * ʹ�ù��췽����ע���:
 * 1.һ���������Լ��Ĺ��췽��,�Ͳ�����ȥ����ϵͳĬ�ϵĹ��췽��.
 * 2.������췽��֮�������صĹ�ϵ
 * 
 * this:��һ���ؼ���,��һ��������������,�������ǵ�ǰ�Ķ���.������ǵ�ǰ����ĵ�ַ.
 * ����:���ڵ�ǰ����ڲ��õ���ǰ��������õ�ʱ��ʹ��this
 * 
 * this������:1.���ֳ�Ա�����;ֲ�����
 * 2.�����ڹ��췽���е����������صĹ��췽��,��ߴ���ĸ�����,�򻯴���.
 * 
 * ����this ��ע���:
 * 1.����Ϊ������ʱ��,ֻ�����ڹ��췽��.
 * 2.�����Լ������Լ�--��ѭ��
 * 3.�����໥����--��ѭ��
 * 4.�ڹ��췽���е����������صĹ��췽��,���뷽����һ��
 * 5.�ھ�̬�������޷�ʹ��this
 */
public class Demo4 {
	public static void main(String[] args) {
		Student student = new Student();//���췽��--ϵͳĬ�ϴ����Ĺ��췽��
		student.name = "bingbing";
		
		Student student1 = new Student("����");
		System.out.println(student1.name);
	}
}

class Student{
	String name;
	int age;
	int weight;
	
	public void study() {
		System.out.println(name+"��ѧϰ");
	}
	
	//�����޲εĹ��췽��
	public Student(){
		//�ڹ��췽�����ڲ����Զ��Ľ������Եĳ�ʼ��.
		//this();//�Լ������Լ��������ѭ��
		System.out.println("�޲ι��췽��");
	}
	
	//�вεĹ��췽��
	//���ﵱ��Ա�������βε�����һ��ʱ,�����ڲ�ʶ������β�.���ݵ��Ǿͽ�ԭ��
	//�ͽ�ԭ���Ǵ��ڴ�ĽǶȿ���Զ��.
	public Student(String name){
		this.name = name;//�������������ɸ�ֵ
		System.out.println("�вι��췽��");
	}
	
	public Student(String name,int age){
		//ͨ��this�����������췽����ʱ�������ڵ�ǰ�����ĵ�һ��.
		this(name);
		this.age = age;
	}
	
	public Student(String name,int age,int weight){
		this(name, age);//�����ڵ������������Ĺ��췽��
		this.weight = weight;
	}
}