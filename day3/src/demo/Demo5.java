package demo;

import java.util.Scanner;
/*
 * �βκ�ʵ�ε�ע���:���ǵĸ���,λ��,���ͱ���һ��
 * ��ʵ�ʸ�ֵ��ʱ��,����ᰴ��˳��ʵ�ε�ֵ���θ����β�,ʵ�ʲ�����������β�.
 * 
 * return�Ĺ���:
 * 1.ͨ��return���Խ�������ֵ��������
 * 2.return�н�������˼,return����Ĵ��벻��ִ��
 * 3.��������з���ֵ,Ҫ��֤���κ�����¶��з���ֵ
 * 
 * �����Ķ���:����ĳ���ض����ܵ�һ�δ���
 */
public class Demo5 {
	public static void main(String[] args) {
		Scanner  scanner = new Scanner(System.in);//���������ǵ�����̨��������
		System.out.println("�������һ����:");
		int num1 = scanner.nextInt();//��ȡһ������
		System.out.println("������ڶ�����:");
		int num2 = scanner.nextInt();//��ȡһ������
		
		//���õ�ǰ�ĺ���
		int mysum = qiuhe(num1, num2);//ʵ��:ʵ�ʵĲ���.�������õĴ�������Ϊʵ��
		
		System.out.println("��:"+mysum);
	}
	//�����Ķ���
	//						�β�:��ʽ�ϵĲ���.����������Ĳ�����Ϊ�β�.�ص�:�������ʵ�ε�ֵ����������
							//	�����õķ�Χ�ǵ�ǰ�ĺ���
	public static int qiuhe(int a,int b){//������ִ�е�ʱ��,�൱����һ�����صĴ���:a = num1   b = num2
		int sum = a+b;
		return sum;
	}
	
	/*
	 *  * return�Ĺ���:
	 	* 1.ͨ��return���Խ�������ֵ��������
	 	* 2.return�н�������˼,return����Ĵ��벻��ִ��
	 	* 3.��������з���ֵ,Ҫ��֤���κ�����¶��з���ֵ
	 */
	public int test(int a){
//		return 2;
//		System.out.println("hello");//2.return�н�������˼,return����Ĵ��벻��ִ��
		
		//3.��������з���ֵ,Ҫ��֤���κ�����¶��з���ֵ
		if (a > 5) {
			
		}else {
			
		}
		return 5;
	}
}


