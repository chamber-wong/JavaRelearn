package homework;

import java.util.Scanner;
/**
 * ʹ�ú���
 * ��������������������
 * @author Ū��
 *
 */
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sca = new Scanner(System.in);
		System.out.println("�������һ��ֵ:");
		int a = sca.nextInt();
		System.out.println("������ڶ���ֵ:");
		int b = sca.nextInt();
		Max main = new Max();
		int max = main.max(a, b);
		System.out.println("������������е����ֵΪ:"+max);
		sca.close();
	}
	public int max(int a,int b) {
		int max;
		if(a >= b) {
			max=a;
		}else {
			max=b;
		}
		return max;
	}

}
