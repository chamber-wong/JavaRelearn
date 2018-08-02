package day2homeworkOther;
import java.util.Scanner;
class a5 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入要相加多少项");
		int n=sc.nextInt();
		int fz=2,fm=1,sum=0,m;
		for(int i=1;i<n;i++)
		{
			sum+=fz/fm;
			m=fm;
			fm=fz;
			fz=fz+m;
		}
		System.out.println(sum);
	}
}
