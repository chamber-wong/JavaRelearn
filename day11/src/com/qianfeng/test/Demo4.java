package com.qianfeng.test;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * �ɱ��ַ���:(�ַ���������)
		 * StringBuffer:(jdk1.0),���̰߳�ȫ��,Ҫ�����̰߳�ȫ����.
		 * StringBuilder:(jdk1.5),���̲߳���ȫ��,����Ҫ�����̰߳�ȫ����.
		 * 
		 * ����:
		 * �ڲ������̰߳�ȫ��ǰ����,����ʹ��StringBuilder,Ч�ʸ�,�ٶȿ�.
		 */
		//�����յĿɱ��ַ�������
		StringBuffer stringBuffer = new StringBuffer();
    	//1.�洢��
    	//StringBuffer append(boolean b)   ��������
		stringBuffer.append("1000");
		stringBuffer.append("phone");
		System.out.println(stringBuffer);
        //StringBuffer insert(int offset, boolean b)   ��ָ��λ�ò���
		stringBuffer.insert(0, true);
		System.out.println(stringBuffer);
        //2.ɾ����
        //StringBuffer delete(int start, int end) 
		stringBuffer.delete(0, 4);
		System.out.println(stringBuffer);
        //StringBuffer deleteCharAt(int index)
        //3.�޸ģ�
        //StringBuffer replace(int start, int end, String str)  �滻ָ�������ַ���
        //void setCharAt(int index, char ch) �޸�һ���ַ�
		stringBuffer.replace(0, 4, "9999");
		System.out.println(stringBuffer);
		
        //4.��ȡ��
        //char charAt(int index) 
		char c = stringBuffer.charAt(1);
    	//int indexOf(String str)
		int index = stringBuffer.indexOf("pho");
		System.out.println(index);//4
    	//int indexOf(String str, int fromIndex)
		int index1 = stringBuffer.indexOf("pho", 6);//-1
		System.out.println(index1);
    	//int lastIndexOf(String str) 
        //����ָ�����ַ���(���ұ߿�ʼ����)�ڴ��ַ�����һ�γ���ʱ������
        //int lastIndexOf(String str, int fromIndex) 
        //����ָ�����ַ���(���ұ߿�ʼ����,��Χ:��ǰָ����λ��-0)�ڴ��ַ�����һ�γ���ʱ������ 
        //int length() 
        //���س��ȣ��ַ������� 
		System.out.println(stringBuffer.length());
        //5.��ת��
        //StringBuffer reverse()
		System.out.println(stringBuffer.reverse());
	}
}
