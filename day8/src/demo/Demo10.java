package demo;

public class Demo10 {
	public static void main(String[] args) {
		//�̳���ϵ��
//		Zi zi = new Zi();
//		System.out.println(zi.age);//8
		
		
		//��̬��ϵ��
		/*
		 * �����������ඨ����ͬ��������:
		 * ��Ա����:�����ʱ���ܲ��ܷ��ʿ�����,���е�ʱ��Ҳ������
		 * ��Ա����:�����ʱ�򿴸���,���е�ʱ������
		 * ��̬��Ա����:�������ж�������
		 */
		Fu fu = new Zi();//��̬
		System.out.println(fu.age);//5
		fu.song();
		fu.run();
		
		//ִ��show����--����ת��
	}
}

class Fu{
	int age = 5;
	
	public void run(){
		System.out.println("Fu-run");
	}
	
	public static void song() {
		System.out.println("Fu-song");
	}
}

class Zi extends Fu{
	int age = 8;
	
	public void show(){
		System.out.println("Zi-show");
	}
	
	
	public static void song() {
	    System.out.println("Zi-song");
	}
}
