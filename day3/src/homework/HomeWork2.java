package homework;

import java.util.Scanner;
/**
 * �����������ֵĺͲ����
 * @author Ū��
 *
 */
public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
//		System.out.println("��������ʽ:");
//		String sp = scanner.next();
//		
		System.out.println("������Ҫ����ĵ�һ������:");
		int a = scanner.nextInt();
		System.out.println("������Ҫ����������:");
		String str = scanner.next();
		System.out.println("������Ҫ����ĵڶ�������:");
		int b = scanner.nextInt();
		HomeWork2 hWork2 = new HomeWork2();
		double dou = hWork2.getCount(a, b, str);
		System.out.println("���Ϊ:"+a+str+b+"="+dou);
		scanner.close();
	}
	/**
	 * ���ݴ�����������ֺ������,���㲢����
	 * @param a ��һ������
	 * @param b �ڶ�������
	 * @param symbol �����
	 * @return ����������
	 */
	public double getCount(int a,int b,String symbol) {
		if(symbol.equals("+")) {
			return a+b;
		}else if (symbol.equals("-")) {
			return a-b;
		}else if(symbol.equals("*")){
			return a*b;
		}else{
			return (double)a/(double)b;
		}
		
	}

}
