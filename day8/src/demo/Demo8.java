package demo;
/*
 *��̬�µ�--һ��Ҫ�Ƕ�̬
 *����ת��:�൱���Զ�����ת��,�ɵ����͵�������
 *			����:�����������ת�ɸ��������.ע��:ֻ�ǽ����ý���ת��,��=����Ķ����޹�
 *����ת��:�൱��ǿ������ת��,�ɸ����͵�������
 *          ����:�����������ǿ��ת�������������.---�����������еķ���
 */
public class Demo8 {
	public static void main(String[] args) {
		//����ת��
		Animal2 animal = new Dog2();//��̬
		
		//����ת��
		Dog2 dog = (Dog2)animal;
		dog.show();//�����������еķ���
		
		//ע���:
		//1.���ﲻ������ת��,���Ǵ���.������ͼ�����������ָ����Ķ���.
		//Dog2 dog2 = new Animal2();
		
		//2.���ﲻ������ת��,����ת�͵�ǰ���Ƕ�̬
		Animal2 animal2 = new Animal2();//���ﲻ�Ƕ�̬
//		Dog2 dog2 = (Dog2)animal2;
		
		
	}
	
}

class Animal2{
	String name;
	public Animal2(String name) {
		super();
		this.name = name;
	}
	public Animal2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void play(){
		System.out.println("Animal-play");
	}
}

class Dog2 extends Animal2{
	public void  show() {
		System.out.println("Dog-show");
	}
}

class Cat2 extends Animal2{
	public void eat(){
		System.out.println("Cat-eat");
	}
}



