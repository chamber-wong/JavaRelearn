package com.qianfeng.test;
/*
 * ����������:����ͬһ�����еĺ���,������������ͬ,�����Ĳ�������ͬ,���ǽ����ǵĹ�ϵ��Ϊ����.
 * 
 * ԭ��:�ڳ�����ڲ�����ʶ������ʱ��,ʶ����Ǻ�����+���в���������.
 * 
 * ע��:���صĺ����������ǲ�ͬ�ĺ���
 * 
 * �ܵ�ע���:
 * 1.������������ͬ
 * 2.�������벻ͬ:�����ĸ���,λ��,���Ͷ��в�ͬ
 * 3.�����뷵��ֵ�޹�
 * 
 * ����:�򻯴���,�������ǲ���.
 */
public class Demo9 {
	public static void main(String[] args) {
		
	}
	
	//1.
	public static int sum(int a,int b){//sum_int_int
		return a+b;
	}
	
	//2.��1������,�����ĸ�����ͬ
	public static int sum(int a,int b,int c){//sum_int_int_int
		return a+b+c;
	}
	
	//3.��1��������,��ͬһ������,����������������޹�
//	public static int sum(int c,int d){//sum_int_int
//		return a+b;
//	}
	//4.��1������,���������Ͳ�ͬ
	public static int sum(float a,int b){//sum_float_int
		return 4;
	}
	
	
	//5.��1��������,�����Ƿ���ֵ��ͬ,�������޹�,���ǽ����������Ϊ����
//	public static void sum(int a,int b){//sum_int_int
//		return a+b;
//	}
	
	//6.��4������,������λ�ò�ͬ
	public static int sum(int a,float b){//sum_int_float
		return 4;
	}
}
