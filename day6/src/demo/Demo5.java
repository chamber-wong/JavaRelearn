package demo;

public class Demo5 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "��������";
		
		//��������:û�����ֵĶ���.
		new Dog().name = "haha";
		
		//ʹ�ó���:������Ϊ��������
		//����:�򻯴���
		feedDog(new Dog());
		
		//ʵ��:
		new Dog().name = "�»�";
		new Dog().age = 30;
		System.out.println(new Dog().name+"   "+new Dog().age);//null   0
	}
	
	public static void feedDog(Dog dog1) {//dog1 = new Dog()
		dog1.name = "��ë";
	}
}

class Dog{
	String name;
	int age;
}
