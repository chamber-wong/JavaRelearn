package day2homeworkOther;
import java.util.Scanner;
class a7 
{
	public static void main(String[] args) 
	{
		double score,sum=0,ave;
		int count;
		Scanner sc=new Scanner(System.in);
		System.out.println("������ð༶������");
        count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			System.out.println("�������"+i+"��ѧԱ�ĳɼ�");
			score=sc.nextDouble();
			sum+=score;
		}
		ave=sum/count;
		System.out.println("�ð��ƽ���ɼ��ǣ�"+ave);
	}
}
