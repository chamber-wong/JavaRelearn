package day2homeworkOther;
import java.util.Scanner;
class a4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请先输入几个数相加");
		int n=sc.nextInt();
		System.out.println("请输入一个数字");
		int a=sc.nextInt();int sum=0,t;
		for(int i=1;i<=n;i++)
		{
            t=a%10;
			sum=sum+a;
			a=a*10+t;
		}
		System.out.println(sum);

	}
}
