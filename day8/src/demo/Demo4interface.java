package demo;

public class Demo4interface {
	//1.��jdk1.7�Ľӿ��п���д������ʵ��,����������default��static��
	//2.�ӿڻ��ǲ���ֱ�Ӵ�������,Ҫͨ������
	/*
	 * �ӿڵ�������д����ע������
	 * ���һ����ʵ�������ӿڣ��������ӿ�ͬʱ����ͬ�ĳ��󷽷���������ֻ��Ҫ��дһ����������� 
	����ӿ�����default���εķ�������Ҫ��д�� 
	��������ӿ���ķ�������ͬ����default����������ķ����岻ͬ����������Ҫ��д�÷����� 
	��������ӿ��з���������������ͬ�ķ�����һ���ӿ��ǳ��󷽷�����һ����default�����з����塣��ʱ����Ҳ������д�÷�����
	 */
	public static void main(String[] args) {
		//һ������һ���ӿڵ����
		
//		//����Test6
//		Test6 test1 = new Test6();
//		test1.run();
//		test1.eat();//���ø����defalut����,����ͨ����������õ���
//		//�ӿ���static���͵ķ���,����ʹ�õ�ǰ�������ڵĽӿ�����ȥ����
//		inter5.bark();
		
		
		
		//һ�����������ӿڵ����
		
		Test5 test = new Test5();
		test.run();
		//�����ӿڵ�ͬ������,��������default���͵�
		test.eat();
		
		//����ľ�̬���������븸�����ͬ,���Ƿ����ڵ��õ�ʹ�ø��Ե��ø��Ե�
		inter5.bark();
		//��������ӿ���ֻ��һ����default����,����Ҫ��д,����ֱ��ʹ��
		test.song();

		Test5.bark();
		
		//�����ӿ��е�ͬ������,һ����default���͵�(��ʵ��),һ���ǳ����
		test.play();
	}
}

interface inter5{
	public void run();
	
	default public void song() {
		System.out.println("song");
	}
	default public void eat(){
		System.out.println("default");
	}
	
	static public void bark(){
		System.out.println("static");
	}
	
	default public void play() {
		System.out.println("play");
	}
}

interface inter6{
	public void run();
	default public void eat(){
		System.out.println("default1");
	}
	
	static public void bark(){
		System.out.println("static1");
	}
	
	public void play();
}

class Test6 implements inter5{


	//
	public void run() {
		System.out.println("Test6");
		
		
	}
	
	//defaultֻ�ܷ��ڽӿ���
		//�����ǰ�ӿ�����һ��default����,����Ҫ��д,����ֱ��ʹ��
	//�������ڵ�eat����
	
	//����ľ�̬���������븸�����ͬ,���Ƿ����ڵ��õ�ʱ����Ե��ø��Ե�
	static public void bark(){
		
		System.out.println("static");
	}
	
}

class Test5 implements inter5,inter6{

	//��������ӿ�������ͬ�ĳ��󷽷�,ֻ��Ҫ��дһ��
	public void run() {
		System.out.println("run");
		
	}
	
	
	
	
	//��������ӿ�������ͬ�Ķ���defaultʵ�ֵķ���,���Ǳ���Ҫ��д
	//����д�����п���ͬʱ���������ӿڵĵ���,Ҳ����ֻ��������һ��
	 public void eat() {
		// TODO Auto-generated method stub
		inter6.super.eat();//����inter1�еķ���
		inter5.super.eat();//����inter�еķ���
		
		//��д�Լ��Ĺ���
		System.out.println("Test-eat");
	}

	//��������ӿ���������ͬ���ķ���,һ����defaultʵ�ֵķ���,һ���ǳ��󷽷�,���Ǳ���Ҫ��д
	//����д�����п���ͬʱ���������ӿڵĵ���,Ҳ���Ե���һ��
	public void play() {
		inter5.super.play();
		System.out.println("");
	}


	//����ľ�̬���������븸�����ͬ,���Ƿ����ڵ��õ�ʱ����Ե��ø��Ե�
	static public void bark(){
		
		System.out.println("substatic");
	}
	
}
