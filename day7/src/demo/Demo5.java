package com.qianfeng.test;
/*
 * ���ģʽ:ǰ���ܽ�����ľ���,������ֱ������ʹ��.
 * ���õ����ģʽ:23��,����Ҫѧ���е���,ģ��,װ��,������,����,�����
 * �������ģʽ:һ����ֻ������һ������,�����������Ϊһ��ȫ�ֵķ��ʵ�,�ṩ��ȥ�����ʹ��.
 * ����:
 * 1.�û�ֻ����һ������
 * 2.ȫ�ֵķ��ʵ�:�õ��Ķ������ȫ�ֵķ��ʵ�. �������ȫ��?��staticȥ����
 * 3.����ṩ��ȥ?
 * 4.�����ʹ��?--�����Ĺ���
 * 
 * 
  * �����������:1.����ʵ����������֮��Ĵ�ֵ
  * 2.������ȫ�ַ�Χ�ڵ��úܶ�Ĺ���.
 * �ô�:������������������ȫû�й�ϵ��ǰ����,ʵ��ֵ�Ĵ���,�����������,������ھ���
 * 
 * �����,�ھ�����΢����˵:��������������֮��Ĺ�ϵ
 * �ô�:����Ӧ�þ�������ھ���,���������,������߳���Ľ�׳��,���Ӵ���Ŀ���ֲ��,����ʵ��ģ��������
 * 
 * �����������ϸ��ھ�?
 * �ڴ����������ϵ��ʱ��,����֮��Ĺ�ϵԽ���������Խ��,�ھ���Խ��.��֮,��ϵԽ��ɢ�����Խ��,�ھ���Խ��.
 */


//����������
//����ʽ-�ڶ��������ͬʱ��ɳ�ʼ��
class SingleInstance{
	//2.������ڲ�����һ����ǰ���͵����Բ���ֵ--������ڲ��õ��˵�ǰ���һ������
	//������˽�л�,������޷�ֱ�ӷ���    ��������static����������Ϊȫ�ֵķ��ʵ�
	private static SingleInstance singleInstance = new SingleInstance();
	
	//1.�����췽��˽�л�
	private SingleInstance() {
		
	}
	
	//3.ʹ�ù����ķ��������������ȥ,�����������óɾ�̬��
	public static SingleInstance getInstance(){
		return singleInstance;
	}
}
//����ʽ-��ʼֻ�Ƕ������,ʲôʱ��ʹ��ʲôʱ��ֵ
class SingleInstance1{
	//2.������ڲ�����һ����ǰ���͵����Բ���ֵ--������ڲ��õ��˵�ǰ���һ������
	//������˽�л�,������޷�ֱ�ӷ���    ��������static����������Ϊȫ�ֵķ��ʵ�
	private static SingleInstance1 singleInstance = null;
	
	//1.�����췽��˽�л�
	private SingleInstance1() {
		
	}
	
	//3.ʹ�ù����ķ��������������ȥ,�����������óɾ�̬��
	public static SingleInstance1 getInstance(){
		if (singleInstance == null) {
			singleInstance = new SingleInstance1();
		}
		
		return singleInstance;
	}
	
	
	//4.�����Ĺ�����
	int num;
}

public class Demo5 {
	public static void main(String[] args) {
		SingleInstance1 singleInstance1 = SingleInstance1.getInstance();
		SingleInstance1 singleInstance2 = SingleInstance1.getInstance();
		System.out.println(singleInstance1 == singleInstance2);//true,˵����ȡ������ͬһ������
		
		//ʵ��:��ɵĹ���:��A����num1��ֵ����B������num2
		A a = new A();
		a .num1 = 4;
		
		B b = new B();
		
		//ֱ�Ӹ�ֵ,һ����ĳ�Ա������˽�е�,���Բ��Ƽ�
//		b.num2 = a.num1;
//		//ͨ�����μ�Ӹ�ֵ
//		b.test(a);
		//ͨ������ʵ�ִ�ֵ
		a.ceshi1();
		b.ceshi2();
	}
}

//���Ե����Ĺ���
class A{
	int num1;
	//����ͨ��������ֵ
    public void ceshi1() {
		SingleInstance1 singleInstance = SingleInstance1.getInstance();
		singleInstance.num = num1;
	}
}

class B{
	int num2;
	//ͨ�����θ�ֵ
	public void test(A a){
		num2 = a.num1;
	}
	//����ͨ��������ֵ
	public void ceshi2(){
		SingleInstance1 singleInstance = SingleInstance1.getInstance();
		num2 = singleInstance.num;
	}
}