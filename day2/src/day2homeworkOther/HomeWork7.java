package day2homeworkOther;

import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("����������:");
		int a = sca.nextInt();
		int sum = 0;
		System.out.println("������ɼ�:");
		for(int i = 0;i<a;i++) {
			sum += sca.nextInt();
		}
		System.out.println("�ð༶��ƽ���ɼ�Ϊ:"+sum/a);
		sca.close();
	}

}
