package demo;
/*
 * �˽�:��̬���ڲ���
 * 
 * ע��:
 * 1.��̬���ڲ����п���û�о�̬�ĳ�Ա
 * 2.�о�̬��Ա��һ���Ǿ�̬���ڲ���
 */
public class Demo7 {
	public static void main(String[] args) {
		//��̬�Ķ���
		//Ҫ��֤�ڲ��౾���Ǿ�̬��
		//����:new  �ⲿ��.�ڲ���+()
		Out1.In1 in1 = new Out1.In1();
		//���÷Ǿ�̬����
		in1.play();
		//���þ�̬�ķ���
		in1.song();
		Out1.In1.song();
	}
}

class Out1{
	 static  class In1{//��̬���ڲ���
		 //�Ǿ�̬�ķ���
		public void play() {
			System.out.println("play");
		}
		 //��̬�ķ���
		public static void song() {
			System.out.println("song");
		}
	}
}
