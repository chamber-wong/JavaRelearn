package com.qianfeng.test;
/*
 * ������ʹ�÷���
 */
public class Demo3 {
	public static void main(String[] args) {
		Student student = new Student();
		Computer computer = new Computer("ƻ��");
		student.setObject(computer);//��̬
		
		//��ȡ����
		//ʹ�÷���֮ǰ
		Object object = student.getObject();
		//����ת��
		Computer computer2 = (Computer)object;//computer2 = object = new Computer("ƻ��")---����ת��
		Phone phone = (Phone)object;//phone = object = new Computer("ƻ��")----����
		
		//ʹ�÷���֮��
		//����:
		Student1<Computer> student2 = new Student1();
		Computer computer1 = new Computer("ƻ��");
		student2.setObject(computer1);
		
		//ȡֵ
		Computer computer3 =  student2.getObject();
		//student2.setObject(new Phone("huawei"));  ͨ����������,�����Ѿ�ȷ����.
	}
}

/*
 * ʹ�÷���ǰ
 */
class Student{
	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {//object = computer   ��̬
		this.object = object;
	}
}
/*
 * ʹ�÷��ͺ�
 * E��������һ����������,����<>�в�һ����E,�����������ַ�
 * ��������ڸ���ʹ�÷���
 * ʹ��:������ȷ���ķ��Ϳ���ֱ���ڳ�Ա��ʹ��
 */
class Student1<E>{
	private E object;

	public E getObject() {
		return object;
	}

	public void setObject(E object) {//object = computer   ��̬
		this.object = object;
	}
}

class Tool{
	String name;

	public Tool(String name) {
		super();
		this.name = name;
	}

	public Tool() {
		super();
	}
}

class Computer extends Tool{
	public Computer(String name) {
		super(name);
	}
}

class Phone extends Tool{
	public Phone(String name) {
		super(name);
	}
}
