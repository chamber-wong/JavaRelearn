package day2homeworkOther;
import java.util.Scanner;
class a2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个正整数");
		int n=sc.nextInt();
		int sum=0,i;
		while(n!=0)
		{
			i=n%10;
			n=n/10;
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
