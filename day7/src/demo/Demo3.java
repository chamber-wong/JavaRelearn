package demo;
/*
 * ��д:���������븸��ͬ��(������,��������ȫ��ͬ)�ķ���,���ǳ�Ϊ��д.
 * ע���:�൱�������ͬ������������ĸ�����,������ȥ���ø���ķ���.
 * 
 * ����:�ڲ��ı丸�෽�����ֵ�ǰ����,�ڸ���ԭ�з����Ĺ��ܻ�����,ʵ��һЩ�Լ��Ĺ���.ʵ���˶�ԭ�й��ܵ�����.
 * 
 * this:��һ��������������,����ǰ�Ķ���.������ǵ�ǰ����ĵ�ַ
 * super:����һ��������������.����ͨ��super���ø���ĳ�Ա
 * 
 * ע������:
 * 1.˽�з������ܱ���д
 * 2.�����ͬ��������Ȩ�޴��ڵ��ڸ����ͬ������
 * 3.��̬�ķ���ֻ�ܸ��Ǿ�̬�ķ���
 */
public class Demo3 {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.color = "õ���";//���ø���ĳ�Ա����
		iphone.gui = "��";//���õ��Լ��ĳ�Ա����
		/*
		 * ������ø��෽����ԭ��:�����������ҵ���ǰ���������,�ڵ�ǰ�Ķ��������������,�ҵ���,ֱ�ӵ���.���û��,��ȥ
		 * ��������,�ҵ��˵���,�Ҳ����ټ���������,һֱ�ҵ�Object,�������û���ҵ�,˵��û���������.
		 */
		iphone.callPhone();//���õĸ���ĳ�Ա����
		iphone.fangShui();//�����Լ��ĳ�Ա����
	}
}

//ע��:һ�������û��д����,Ĭ����Object
class Phone {
	//��ȡ�Ĺ�ͬ�����Ժ���Ϊ
	String color;
	int model;
	public void callPhone(){
		System.out.println("��绰");
	}
	
	public static void play(){
		
	}
}

//����Iphone��
//����  extends ����
class Iphone extends Phone{
//	String color;
//	int model;
	String gui;
	
	public void fangShui(){
		
		System.out.println("��ˮ");
	}
	
	//��д�˸���ķ���
	public void callPhone(){
		//this.callPhone();//�������Ǳ������callPhone����--��ѭ��
		super.callPhone();//ֱ�ӵ��õ��Ǹ���ķ���
		
		System.out.println("�Լ����еĹ���");
	}
	
	//��̬�ķ���ֻ�ܸ��Ǿ�̬�� 
	public static void play(){
		
	}
}
//����HuaWei��
class HuaWei extends Phone{
//	String color;
//	int model;
//	public void callPhone(){
//		System.out.println("��绰");
//	}
	
	//���еķ���
	public void Niu(){
		System.out.println("ţ");
	}
}