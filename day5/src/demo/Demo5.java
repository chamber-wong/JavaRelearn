package com.qianfeng.test;

public class Demo5 {
	public static void main(String[] args) {
		/*
		 * BigData1712����:�ɼ�����:20,15,100,80,59,79.
		 * Ҫ��:�ҳ��ɼ�Ϊ80����.
		 */
		int[] arr = {20,15,100,80,59,79};
		bubbleSort(arr);
		int index = erFenSerach(arr, 80);
		System.out.println(index);
	}
	
	 //* ð������
		public static void bubbleSort(int[] arr){
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
			return -1;
		}
}
