package demo;

public class Demo3 {
    public static void main(String[] args) {
    	 //2.ʹ�ú�����1-10�ĺ�,��,��,��
		int result = jisuan('*', 3, 4);
		System.out.println(result);
	}
	
	public static  int jisuan(char c,int a,int b) {
		int temp = 0;
		if (c == '+') {
			temp = a+b;
		}else if (c == '-') {
			temp = a -b;
		}else if (c == '*') {
			temp = a*b;
		}else {
		    if (b != 0) {
		    	temp = a/b;
			}else {
				temp = 0;
				System.out.println("����Ϊ����");
			}	
		}
		
		return temp;
	}
}
