package com.qianfeng.test;

public class Demo4 {
	public static void main(String[] args) {
		//���� 
		/*
		 * ע���:1.�鵽ֵʱ-�����±�
		 * 2.�鲻��ֵ--����-1
		 * 3.����ͬ��ֵʱ--���ز鵽�ĵ�һ��ֵ���±�,ֹͣ����
		 * 
		 * ��ͨ����:
		 * ���ֲ���:
		 */
		 //* ��ͨ����:
		int[] arr = {2,5,1,7,9};
		int value1 = search(arr,9);
		System.out.println("��ͨ����:"+value1);
		 //* ���ֲ���:��������������
		int[] arr1 = {3,5,7,9,19};
		int value2 = erFenSerach(arr1,19);
		System.out.println("���ֲ���:"+value2);
	}
	 //* ��ͨ����:
	public static int search(int[] arr,int key){
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		
		return -1;
	}
	 //* ���ֲ���:
	public  static int  erFenSerach(int[] arr,int key) {
		int l = 0;
		int h = arr.length-1;
		
		while(l<=h){
			int m = (l+h)>>1;
		    if (key == arr[m]) {
				return m;
			}else if (key > arr[m]) {
				l = m+1;
			}else if (key < arr[m]) {
				h = m-1;
			}   
		}
		
		return -1;//û�в鵽ֵ
	}
}
