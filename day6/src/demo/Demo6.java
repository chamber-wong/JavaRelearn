package demo;

public class Demo6 {
	public static void main(String[] args) {
		Person1 person = new Person1();
		person.baby = new Person1();
	}
}

//ʵ��:����һ������
//һ������һ����������,����һ����������������.�����ɼ��ķ�Χ���ǿ���ʹ�õ�,�����Լ����ڲ�.
class Person1{
	String name;
	
	Person1 baby;
}
