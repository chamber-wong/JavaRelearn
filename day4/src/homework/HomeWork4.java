package homework;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 万年历(运行根据提示查看效果)
 * @author 弄风
 *
 */
public class HomeWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = scanner.nextInt();
		System.out.println("请输入月份:");
		int month = scanner.nextInt();
		scanner.close();
		
		HomeWork4 hWork4 = new HomeWork4();
		//计算这一年到1900年一月一日的总天数
		int yearSumDays = hWork4.yearSumDays(year);
		//计算到当年1月一日的总天数
		int monthSumDays = hWork4.monthSumDays(month, year);
		//计算这个月到1900年1月1日的总天数
		int sumDays = hWork4.sumDays(yearSumDays, monthSumDays);
		//计算这个月1日时星期几
		int weekDay = hWork4.weekDays(sumDays);
		//格式化打印
		hWork4.printCalendar(weekDay, hWork4.getDays(month, year));
	}
	/**
	 * 根据输入的参数判断是否闰年
	 * @param year 年份
	 * @return 是否为闰年
	 */
	public boolean isLeap(int year) {
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		else
			return false;
	}
	/**
	 * 根据用户输入的月份判断月的天数
	 * @param month 月份
	 * @return 参数月的天数
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
	 * 计算参数年份距1900年1月1日的总天数
	 * @param year 年份
	 * @return 参数年份距1900年1月1日的总天数
	 */
	public int yearSumDays(int year) {
		int leapYears = 0;
		//计算从1900到输入的年份一共有多少个闰年
		for(int i = 1900;i<year;i++) {
			if (isLeap(i)) {
				leapYears++;
			}
		}
		//计算平年有多少个
		int norYears = year - 1900 - leapYears;
		//计算总天数,平年365天,闰年366天
		int sumDay = norYears*365 + leapYears*366;
		return sumDay;
	}
	/**
	 * 计算参数月份距输入年份的一月一日共多少天
	 * @param month 月份
	 * @param year 年份
	 * @return 月份距输入年份的一月一日共多少天
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
	 * 计算总天数
	 * @param yearSumDays 当前年到1900年一月一日的天数
	 * @param monthSumDays 当前月到当前年一月一日的天数
	 * @return 总天数
	 */
	public int sumDays(int yearSumDays,int monthSumDays) {
		int sumDays = yearSumDays + monthSumDays;
		return sumDays;
		
	}
	/**
	 * 根据参数的总天数来计算输入月的第一天的星期数
	 * @param sumDays 总天数
	 * @return 星期数
	 */
	public int weekDays(int sumDays) {
		int weekDay = (sumDays+1) % 7;
		if (weekDay == 0) {
			return 7;
		}
		return weekDay;
		
	}
	/**
	 * 根据第一天的星期数格式化输出这个月的日历
	 * @param weekDays 星期数
	 * @param monthDaas 月份
	 */
	public void printCalendar(int weekDays,int monthDays) {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s","星期一","星期二","星期三","星期四","星期五","星期六","星期日"+"\n");
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
