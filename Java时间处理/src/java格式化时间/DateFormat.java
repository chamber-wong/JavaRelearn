package java格式化时间;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * 使用 SimpleDateFormat 类的 format(date) 方法来格式化时间
 * @author 弄风
 *
 */
public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.getTime());
		String strDateFormat = "HH:mm:ss yyyy-MM-dd";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
	}

}
