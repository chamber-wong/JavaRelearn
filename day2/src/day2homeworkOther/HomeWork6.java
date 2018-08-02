package day2homeworkOther;

import java.util.Scanner;

public class HomeWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		while(true) {
			System.out.println("请输入一个数字:");
			int a = sca.nextInt();
			
			for(int i = 0;i <= a; i++) {
				System.out.print((char)i+" ");
				if(i==a) {
					System.out.println();
				}
			}
			System.out.println("是否愿意再次继续同样的过程?Y/N");
			if(sca.next().equals("n")) 
				break;
			
		}
		sca.close();
	}

}
