package homework;

import java.util.Scanner;

/**
 * 使用自定义异常判断QQ是否合法
 * 
 * @author 弄风
 *
 */
public class HomeWork2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的QQ号:");
		String string = scanner.next();
		QQ qq = new QQ();
		try {
			qq.setQq(string);
			System.out.println("输入正确!");

		} catch (NotNumberException e) {
			e.printStackTrace();
			main(null);
		} catch (LengthException e) {
			e.printStackTrace();
			main(null);
		} catch (FirstIsZeroException e) {
			e.printStackTrace();
			main(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class QQ {
	private String qq;

	public void reScan() {

	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) throws NotNumberException, LengthException, FirstIsZeroException {
		char[] cs = qq.toCharArray();
		for (char c : cs) {
			if (!(c >= 38 && c <= 57)) {
				throw new NotNumberException("您输入的数字中包含非法字符,请重新输入:");
			}
		}
		if (cs.length < 5 || cs.length > 13) {
			throw new LengthException("您输入的QQ号长度不正确,请重新输入:");
		} else if (cs[0] == '0') {
			throw new FirstIsZeroException("QQ开头不能为0,请重新输入:");
		} else {
			this.qq = qq;
		}

	}

}

class FirstIsZeroException extends Exception {

	public FirstIsZeroException() {
		super();

	}

	public FirstIsZeroException(String message) {
		super(message);

	}

}

class NotNumberException extends Exception {

	public NotNumberException() {
		super();

	}

	public NotNumberException(String message) {
		super(message);

	}

}

class LengthException extends Exception {

	public LengthException() {
		super();

	}

	public LengthException(String message) {
		super(message);

	}

}