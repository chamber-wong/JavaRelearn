package com.qianfeng.test;
/*
 * �ַ���:java�����ַ�����ص��������������,�γɵ���ͽ��ַ�����,��ʾ����:""
 * 
 * �ֳ�����:
 * 1.���ɱ��ַ���--String:˵�����ַ�������û�з����仯,�������޹�---����
 * 2.�ɱ��ַ���----StringBuffer/StringBuilder:˵�����ַ���������Ըı�,������Ҳ�޹�.
 * 
 * �ַ��������ı���λ��:������,������Ϊ�Ƕ����е�һ������������.
 * �ַ����������ص�:ͬһ�����ֵ��ַ����������ڴ���ֻ�������һ��.
 */
public class Demo2 {
	public static void main(String[] args) {
//		//���ɱ��ַ���
//		String s1 = "1000phone";
//		//�ɱ��ַ���
//		StringBuffer s2 = new StringBuffer("helloworld");
		
		//���ⲻ�ɱ��ַ���
		/*
		 * ��ִ��s1��ʱ��,�ᵽ�������ҽ�1000phone���ַ���,�����ֱ����s1�������ĵ�ַ,���û��,���ڳ���������һ���
		 * �ռ��1000phone.
		 * ִ��s2��ͬ��s1
		 * ִ��s3ʱ,���ڽ�����new,һ�������ڶ��п���һ����ռ�,��1000phone����Ϊ���������˶���.�������˶����һ��String
		 * ���͵ĳ�Ա������,����ֱ���ж�s1��s3����ͬ.
		 * ִ��s4ͬ��s3
		 */
		String s1 = "1000phone";
		String s2 = "1000phone";
		String s3 = new String("1000phone");
		String s4 = new String("1000phone");
		
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		System.out.println(s1 == s4);//false
		System.out.println(s3 == s4);//false
		//˵���ַ�����д��equals����,����ָ���˱ȽϵĹ���.������:��s1��s3���Եĵ�ַ�Ƚ�
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		
		//�ܽ�:�Ժ�Ƚ��ַ���ʱ����ʹ��equals
	}
}
