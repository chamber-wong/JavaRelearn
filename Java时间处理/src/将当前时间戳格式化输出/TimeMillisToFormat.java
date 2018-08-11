package 将当前时间戳格式化输出;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeMillisToFormat {
	public static void main(String[] args) {
		long timeMillis = System.currentTimeMillis();
		System.out.println("当前时间的时间戳为:"+timeMillis);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
		String string = simpleDateFormat.format(new Date(timeMillis));
		System.out.println(string);
	}
}
