package com.qianfeng.test;

public class Demo3 {
	public static void main(String[] args) {
		/*
		 * ��������
		 * Ĭ�϶�������
		 * ð������
		 * ѡ������
		 */
		 //* ð������
		int[] arr1 = new int[]{3,1,5,2};
		bubbleSort(arr1);
		for (int i : arr1) {
			System.out.print("ð������:"+i);
		}
		
		System.out.println();
		 //* ѡ������
		int[] arr2 = new int[]{3,1,5,2};
		SelectSort(arr2);
		for (int i : arr2) {
			System.out.print("ѡ������:"+i);
		}
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
}
