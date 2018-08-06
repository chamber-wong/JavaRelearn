package 获取当前时间;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用 Date 类及 SimpleDateFormat 类的 format(date) 方法来输出当前时间：
 * @author 弄风
 *
 */
public class GetDate {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:ss:mm");
		System.out.println(simpleDateFormat.format(date));
	}
}
