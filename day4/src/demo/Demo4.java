package com.qianfeng.test;

public class Demo4 {
	public static void main(String[] args) {
		/*
		 * java���ڴ�Ľṹ:ջ��,����,������,���ط�����,�Ĵ���
		 * ջ��:������ݵ��ص���:�Ƚ����.���ǽ��ֲ������ͺ�������ջ��,���ݵ��ص���ʹ���������ͷ�
		 * ����:��ŵ���ʵ��(����,����),ʵ�����ͬʱ�洢�������.ʵ���ڲ��ı����������ֵ,����Ǽ���������
		 * 			��Ĭ�ϳ�ʼ������,������������ͻ��ʼ����null(��)
		 * 
		 * �˽�:
		 * �����ڲ������ݻ���ĳ��ʱ�̱��ͷ�--ͨ���������ջ���
		 * �������ջ�����ͨ��һ���߳̿��Ƶ�,����̵߳ĵȼ��Ƚϵ�,���Բ��ᱻ�����ͷ�.
		 */
		//ʹ�ú����������������ֵ
		int max = getMax(7, 3, 5);
		System.out.println(max);
	}
	
	public static int getMax(int a,int b,int c){
		int temp = 0;
		//��һ��
//		if (a>b) {
//			if (a>c) {
//				temp = a;
//			}else {
//				temp = c;
//			}
//		}else {
//			if (b>c) {
//				temp = b;
//			}else {
//				temp = c;
//			}
//		}
//		
//		return temp;
		//�ڶ���
		temp = a>b?a:b;
		return temp>c?temp:c;
	}
}
