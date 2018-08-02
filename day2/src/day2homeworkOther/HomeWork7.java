package day2homeworkOther;

import java.util.Scanner;

public class HomeWork7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入人数:");
		int a = sca.nextInt();
		int sum = 0;
		System.out.println("请输入成绩:");
		for(int i = 0;i<a;i++) {
			sum += sca.nextInt();
		}
		System.out.println("该班级的平均成绩为:"+sum/a);
		sca.close();
	}

}
