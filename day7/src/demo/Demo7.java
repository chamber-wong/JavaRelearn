package demo;

public class Demo7 {
	/*
	 * final:���յ�,���ɸı��
	 * �������ε�
	 * 1.��:�಻�ܴ�������
	 * 2.��Ա����:����������д
	 * 3.��Ա����:������ֵ�ͱ����һ����ֵ,���Ա�final���εı��������ȸ�һ��ֵ.
	 * 4.�ֲ�����:��final���εı��������ȸ�һ��ֵ
	 */
}

class Fu{
	final String name = "bingbing";//��final���εı��������ȸ�һ��ֵ.
	public  void play(){
		final int a = 9;
	}
}

class Zi extends Fu{
	//��д
	public void play() {
		// TODO Auto-generated method stub
		super.play();
	}
}
