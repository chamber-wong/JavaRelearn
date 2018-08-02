package com.qianfeng.test;

public class ArrayTools {
	
	//* ð������
	public static  void bubbleSort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {//ȷ��������Ĵ���,��Ԫ�صĸ�����һ��
			for(int j=0;j<arr.length-1-i;j++){//ȷ��һ��Ԫ�ص�ʱ����Ҫ�ȽϵĴ���
				//��ǰ������Ⱥ��������,������������ֵ
				if (arr[j] > arr[j+1]) {
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
	}
	
	 //* ѡ������
	public static void SelectSort(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {//ȷ��������Ĵ���,��Ԫ�صĸ�����һ��
			for(int j=i;j<arr.length-1;j++){//ȷ��һ��Ԫ�ص�ʱ����Ҫ�ȽϵĴ���
				//��ǰ������Ⱥ��������,������������ֵ
				if (arr[i] > arr[j+1]) {
					arr[i] = arr[i] ^ arr[j+1];
					arr[j+1] = arr[i] ^ arr[j+1];
					arr[i] = arr[i] ^ arr[j+1];
				}
			}
		}
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
