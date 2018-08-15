package wang.chamber.homework;

import java.util.Arrays;

public class HomeWork1 {

	public static void main(String[] args) {
		String string = "aa@sohu.com,bb@163.com,cc@sina.com";
		String[] strings = splitEMails(string);
		for (int i = 0; i < strings.length; i++) {
			String[] strings2 = substringEMail(strings[i]);
			System.out.println(Arrays.toString(strings2));
		}
	}
	public static String[] substringEMail(String str) {
		String user = str.substring(0, str.indexOf("@"));
		String email = str.substring(str.indexOf("@+1"),str.length());
		String[] strings = {user,email};
		return strings;
	}
	public static String[] splitEMails(String str) {
		String[] strings = str.split(",");
		return strings;
	}

}
