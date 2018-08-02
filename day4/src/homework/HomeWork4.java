package homework;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * ������(���и�����ʾ�鿴Ч��)
 * @author Ū��
 *
 */
public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������:");
		int year = scanner.nextInt();
		System.out.println("�������·�:");
		int month = scanner.nextInt();
		scanner.close();
		
		HomeWork4 hWork4 = new HomeWork4();
		//������һ�굽1900��һ��һ�յ�������
		int yearSumDays = hWork4.yearSumDays(year);
		//���㵽����1��һ�յ�������
		int monthSumDays = hWork4.monthSumDays(month, year);
		//��������µ�1900��1��1�յ�������
		int sumDays = hWork4.sumDays(yearSumDays, monthSumDays);
		//���������1��ʱ���ڼ�
		int weekDay = hWork4.weekDays(sumDays);
		//��ʽ����ӡ
		hWork4.printCalendar(weekDay, hWork4.getDays(month, year));
	}
	/**
	 * ��������Ĳ����ж��Ƿ�����
	 * @param year ���
	 * @return �Ƿ�Ϊ����
	 */
	public boolean isLeap(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		else
			return false;
	}
	/**
	 * �����û�������·��ж��µ�����
	 * @param month �·�
	 * @return �����µ�����
	 */
	public int getDays(int month ,int year) {
		if(month == 1 || month == 3  || month == 5  || month == 7  
				|| month == 8  || month == 10  || month == 12) {
			return 31;
		}else if (month == 2 && !isLeap(year)) {
			return 28;
		}else if(month == 2 && isLeap(year)) {
			return 29;
		}else {
			return 30;
		}
	}
	/**
	 * ���������ݾ�1900��1��1�յ�������
	 * @param year ���
	 * @return ������ݾ�1900��1��1�յ�������
	 */
	public int yearSumDays(int year) {
		int leapYears = 0;
		//�����1900����������һ���ж��ٸ�����
		for(int i = 1900;i<year;i++) {
			if (isLeap(i)) {
				leapYears++;
			}
		}
		//����ƽ���ж��ٸ�
		int norYears = year - 1900 - leapYears;
		//����������,ƽ��365��,����366��
		int sumDay = norYears*365 + leapYears*366;
		return sumDay;
	}
	/**
	 * ��������·ݾ�������ݵ�һ��һ�չ�������
	 * @param month �·�
	 * @param year ���
	 * @return �·ݾ�������ݵ�һ��һ�չ�������
	 */
	public int monthSumDays(int month,int year) {
		int sumDays = 0;
		for (int i = 1; i < month; i++) {
			int days = getDays(i, year);
			sumDays += days;
		}
		return sumDays;
	}
	/**
	 * ����������
	 * @param yearSumDays ��ǰ�굽1900��һ��һ�յ�����
	 * @param monthSumDays ��ǰ�µ���ǰ��һ��һ�յ�����
	 * @return ������
	 */
	public int sumDays(int yearSumDays,int monthSumDays) {
		int sumDays = yearSumDays + monthSumDays;
		return sumDays;
		
	}
	/**
	 * ���ݲ����������������������µĵ�һ���������
	 * @param sumDays ������
	 * @return ������
	 */
	public int weekDays(int sumDays) {
		int weekDay = (sumDays+1) % 7;
		if (weekDay == 0) {
			return 7;
		}
		return weekDay;
		
	}
	/**
	 * ���ݵ�һ�����������ʽ���������µ�����
	 * @param weekDays ������
	 * @param monthDaas �·�
	 */
	public void printCalendar(int weekDays,int monthDays) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s","����һ","���ڶ�","������","������","������","������","������"+"\n");
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1;i<weekDays;i++) {
			list.add(0);
		}
		for(int i = 1 ; i<= monthDays ; i++) {
			list.add(i);
		}
		for(int i = 0;i<list.size();i++) {
			if (list.get(i) == 0) {
				System.out.printf("%s\t"," ");
			}else if ((i+1) % 7 == 0) {
				System.out.printf("%s\t\n",list.get(i));
			}else {
				System.out.printf("%s\t",list.get(i));
			}
		}
	}

}
