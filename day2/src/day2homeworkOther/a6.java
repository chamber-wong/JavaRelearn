package day2homeworkOther;
import java.util.Scanner;
class a6 
{
	public static void main(String[] args) 
	{
		int a;
		do{
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ������");
		int n=sc.nextInt();
		for (char i=0;i<=n;i++)
		{
			System.out.print(i+"\t");
		}
		  
		System.out.println("���Ƿ�Ը���ٴμ���ͬ���Ĺ��̣�Ը���밴��������˳��밴1");
		 a=sc.nextInt();
		  }
		while (a!=1);
	}
}
