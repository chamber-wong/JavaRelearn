package demo;

public class Demo6 {
	public static void main(String[] args) {
		/*
		 * ʵ��:ʹ�ú����������������ֵ?
		 */
		
		//����
		int max = getMax(4, 5);
		System.out.println(max);
	}
	
	public static int getMax(int a,int b){
		//��Ŀ�����
		//int c = a>b?a:b;
		
		//if
		int c = 0;
		if (a>b) {
			c = a;
		}else {
			c = b;
		}
		
		return c;
	}
}
