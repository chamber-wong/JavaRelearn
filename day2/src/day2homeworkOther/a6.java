package day2homeworkOther;
import java.util.Scanner;
class a6 
{
	public static void main(String[] args) 
	{
		int a;
		do{
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个数字");
		int n=sc.nextInt();
		for (char i=0;i<=n;i++)
		{
			System.out.print(i+"\t");
		}
		  
		System.out.println("你是否愿意再次继续同样的过程，愿意请按任意键，退出请按1");
		 a=sc.nextInt();
		  }
		while (a!=1);
	}
}
