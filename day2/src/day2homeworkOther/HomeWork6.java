package day2homeworkOther;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		while(true) {
			System.out.println("������һ������:");
			int a = sca.nextInt();
			
			for(int i = 0;i <= a; i++) {
				System.out.print((char)i+" ");
				if(i==a) {
					System.out.println();
				}
			}
			System.out.println("�Ƿ�Ը���ٴμ���ͬ���Ĺ���?Y/N");
			if(sca.next().equals("n")) 
				break;
			
		}
		sca.close();
	}

}
