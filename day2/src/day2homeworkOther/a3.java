package day2homeworkOther;
import java.util.Scanner;
class a3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数");
		int n=sc.nextInt(),sum=1;
		int i=1;
		if (n!=0)
		{
			while(i<=n)
			{
				sum*=i;
				i++;
			}
			System.out.println(sum);
		}
		else
			System.out.println(1);
	}
}
