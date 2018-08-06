package 获取年份月份等;

import java.util.Calendar;

public class GetYear {

	public static void main(String[] args) {
		//获取calendar对象,同时获取当前时间
		Calendar calendar = Calendar.getInstance();
		//获取当前年份
		int year = calendar.get(Calendar.YEAR);
		//获取当前月份
		int month = calendar.get(Calendar.MONTH);
		//获取当前日期
		int day = calendar.get(Calendar.DATE);
		//获取当前是一个星期中的第几天
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		//获取当前是一个月中的第几天
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		//获取当前是一年中的第几天
		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("当前时间是:"+calendar.getTime());
		System.out.println("当前年份为:"+year);
		System.out.println("当前月份为:"+month);
		System.out.println("当前日期为:"+day);
		System.out.println("当前是一个星期中的第几天:"+dayOfWeek);
		System.out.println("当前是一个月中的第几天:"+dayOfMonth);
		System.out.println("当前是一年中的第几天:"+dayOfYear);
	}

}
