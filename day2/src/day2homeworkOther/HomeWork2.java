package day2homeworkOther;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("������һ��������:");
		int a = sca.nextInt();
		int sum = 0;
		for(;;) {
			if(a>=1) {
				sum += a%10;
				a /= 10;
			}else {
				break;
			}
		}
		System.out.println("�����������λ���ֵĺ�Ϊ:"+sum);
		sca.close();
	}

}
