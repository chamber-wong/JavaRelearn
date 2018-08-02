package day2homeworkOther;
import java.util.Scanner;
class a7 
{
	public static void main(String[] args) 
	{
		double score,sum=0,ave;
		int count;
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入该班级的人数");
        count=sc.nextInt();
		for(int i=1;i<=count;i++)
		{
			System.out.println("请输入第"+i+"个学员的成绩");
			score=sc.nextDouble();
			sum+=score;
		}
		ave=sum/count;
		System.out.println("该班的平均成绩是："+ave);
	}
}
