package demo;
/*
 * ��̬������:������ļ��ض�����,����������Ĺ�����ִֻ��һ��.ִ��˳��������main
 * ����: static+{����}
 * ���������:���Ŷ���ļ��ض�����,ÿ�δ������󶼻�ִ��һ��,ִ��˳�������ڹ��췽��
 * ����:{����}
 */
public class Demo8 {
	static {
		System.out.print("a");
	}
	public static void main(String[] args) {
		System.out.print("g");
		Cat cat = new Cat();
		Cat cat1 = new Cat();

		cat.eat();
		System.out.println();
		//��֤��������������Ŷ���ļ��ض�����
		Pig.play();//��ӡ����oplay
	}
	static {
		System.out.print("b");
	}
}
class Cat{
	static {
		System.out.print("e");
	}
	{
		System.out.print("f");
	}
	public Cat() {
		System.out.print("c");
	}
	public void eat(){
		System.out.print("d");
	}
}

class Pig{
	static {
		System.out.print("o");
	}
	{
		System.out.println("k");
	}
	public static void play(){
		System.out.println("play");
	}
}
