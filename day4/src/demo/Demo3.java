package demo;

public class Demo3 {
    public static void main(String[] args) {
    	 //2.使用函数求1-10的和,差,积,商
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
				System.out.println("除数为零了");
			}	
		}
		
		return temp;
	}
}
