package demo;

import demo.Outer.Inner;

/*
 * �ֲ��ڲ���:������һ����ķ����е���
 * 
 * ���÷�Χ:�Ӷ�������ʼ�����ڵķ�������
 * 
 * ����:���ڵ�ǰ��show����,�൱�ڽ�����һ���ֹ������������,�γ��˾ֲ��ڲ���.�ȱ�֤�˴����˽�л��ֶԴ���
 * ����������,�����˿ɶ���,������,�򻯴���,�����˸�����.
 * 
 * �˽�:�ֲ��ڲ������ڵķ����оֲ�������ʹ��.
  * �ֲ�������������:���������ʼ����������
 * final:��final���εı����ᱻ���ڳ�����,����������ֵ���ڵ�ʱ��Ҫ���ھֲ��������ڵķ���,�൱�ڴ�ԭ���Ļ�����������������
 *
 * ԭ��:
 * ��������ͬʱ���ھֲ��ڲ������Ա����ʱ,��Ա������ʹ�÷�Χ�ͻ��ԭ���Ļ����Ͻ�������.
 * ԭ��:�ڵ�ǰ�������,�����Ĭ����finalȥ����height.���Ե��ֲ��������ڵķ���������ʱ��,����û�б��ͷ�,�����ֵ����.
 * 
 * ���ڱ���ǰ���final:
 * ǰ��:����������ֲ��ڲ���ͬʱ����.
 * ��jdk1.7֮ǰҪ�뱣ס�ֲ�������ֵ,Ҫ�ֶ����final
 * ��jdk1.7֮��,java���ڲ������Ѿ��ڱ�����ǰ��Ĭ�������final
 */
public class Demo4 {

}

class Outer1{
	public  void  show() {
		int age = 10;
		System.out.println("Outer-show");
		
		class Inner{//�ֲ��ڲ���
			int height = 20;
			
			public void play(){
				System.out.println("Inner-play"+age);
			}
		}
		
		//�൱����ʹ��Inner
		Inner inner = new Inner();
		inner.play();
	}
}

class Test{

	
	public void play() {
		//����ͨ���ֲ��ڲ���ʵ���˹��ܵ�˽�л�,���Է����ڲ��Ĵ������������,��ǿ�˴���Ŀɶ��ԺͿɲ�����.
		
		//��Ϊ�����Ķ��岻��Ƕ��,��������Ҫͨ���ֲ��ڲ���ʵ��
//		public void gongneng1(){
//			System.out.println("����1");
//		}
//		public void gongneng2(){
//			System.out.println("����2");
//		}
		
		class Inner{
			public void gongneng1(){
				System.out.println("����1");
			}
			public void gongneng2(){
				System.out.println("����2");
			}
		}
		
		Inner inner = new Inner();
		inner.gongneng1();
		inner.gongneng2();
	}
	
	public void run(){
		//��Ϊ����������play�ľֲ��ڲ��෽��.play֮�ⲻ�ɼ�
//		gongneng1();
//		gongneng2();
	}
}
