package demo;
/*
 * ���һ������Ҫ���صĹ���:
 * 1.����:���ش��շ�ԭ��
 * 2.����:����С�շ�ԭ��
 * 3.��Ϊ:����С�շ�ԭ��
 * 
 * ʵ��:
 * ����
 * ����:Person   ----- �������
 * ����:����(name)   ���� age    -----����ʡ��
 * ��Ϊ:�Է� eat   ��绰:callPhone  ---- ����ʡ��
 * 
 * ������Ĺؼ���class    �������������
 */

class Person
{
	//����---��Ա����
	String name;//String:���ַ�����
	int age =20;//����ֱ�Ӹ�һ��ֵ
	
	//��Ϊ---��Ա����
	public void eat() {
		System.out.println(name+"  eat");//name��ȫ�ֱ���,���÷�Χ��������(��static���εķ���),���������ڲ��ķ����п���ֱ��ʹ��
	}
	
	public void callPhone(String num){
		System.out.println("��"+num+"��绰");
	}
}
public class Demo6 {
	public static void main(String[] args) {
		//����Person���͵Ķ���--�Ž�������
		int[] arr = new int[2];
		
		/*
		 * new�Ĺ���:1.�ڶ��￪��һ����ڴ�ռ�     2.����ǰ����ĵ�ַ����
		 * Person():������ĳ�Ա������Ĭ��ֵ,�����Ǽ��������͸�ֵ��0,�������͸�ֵ��null
		 * 
		 * ע��:����ÿ����һ������൱�ڴ�����һ����������
		 * 
		 * =ǰ���per��������������    =�����������Ķ���
		 */
		Person per = new  Person();//Person()����һ������,����ķ���,����:����+().���ǹ̶���д��--���췽��
		
		//��ֵ--ͨ��.�﷨
		//per.age = 18;
		per.name = "����";
		System.out.println(per.age);//ȡֵ
		
		//���÷���
		per.eat();
		per.callPhone("110");
		
		//һ�������ͬʱ�����������,����֮�以��Ӱ��,û�й�ϵ.
		Person per1 = new  Person();
		System.out.println(per1.age);
	}
}
