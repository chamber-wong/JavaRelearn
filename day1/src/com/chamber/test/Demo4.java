package com.qianfeng.test;
/*
 * �����֧���
 * 
 * ʵ��:�жϵ�ǰ���·������ĸ�����?
 * ����:Ҫʹ�÷�֧
 * ����:��(3,4,5)��(6,7,8)��(9,10,11)��(12,1,2)
 */
public class Demo4 {
	public static void main(String[] args) {
		int a = 3;
		if (a == 3) {
			System.out.println("��");
		}else if (a == 4) {
			System.out.println("��");
		}else if (a == 5) {
			System.out.println("��");
		}else if (a == 6) {
			System.out.println("��");
		}else if (a == 7) {
			System.out.println("��");
		}else if (a == 8) {
			System.out.println("��");
		}else if (a == 9) {
			System.out.println("��");
		}else if (a == 10) {
			System.out.println("��");
		}else if (a == 11) {
			System.out.println("��");
		}else if (a == 12) {
			System.out.println("��");
		}else if (a == 1) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		
		//����������Ż�����
		if (a == 3 || a == 4 || a==5) {
			System.out.println("��");
		}else if (a == 6 || a == 7 || a==8) {
			System.out.println("��");
		}else if (a == 9 || a == 10 || a==11) {
			System.out.println("��");
		}else {
			System.out.println("��");
		}
		
		//3<a<5    a>3 && a<5
		if (a>=1 && a<=12) {
			if (a>=3 && a<=5) {
				System.out.println("��");
			}else if (a == 6 || a == 7 || a==8) {
				System.out.println("��");
			}else if (a == 9 || a == 10 || a==11) {
				System.out.println("��");
			}else {
				System.out.println("��");
			}
		}else {
			System.out.println("�������");
		}
		
		//ע���:
		//���if()����û�м�{},Ĭ��ֻ�ܸ�һ�����,�����д������{}.
		if (a>4) 
			System.out.println("ok");
		//�������ֱ�Ӹ������
		if (a>4) ;
		
		//ѧϰswitch
		//����breakɾ��,��������ִ������Ĵ���ֱ������break�ٽ���.���ǰ�break��������Ϊ��Ϊ��͸��
		//switch(a) :����a:����,�ַ�����(jdk1.8��ʼ����ʹ�õ�),ö��.
		switch (a) {
		case 3://ע��:case���治�ܷ�boolean�͵��ж�����
		case 4:case 5:
			System.out.println("��");
			break;//����switch������,
		case 6:case 7:case 8:
			System.out.println("��");
			break;
		case 9:case 10:case 11:
			System.out.println("��");
			break;
		default:
			System.out.println("��");
			break;
		}
		
		//�Ƚ�if��switch?
		//��֧�ٵ�ʱ����if,��֧���ʱ����switch
	}
}
