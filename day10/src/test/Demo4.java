package test;

/**
 * 使用自定义的异常类 老师用电脑上课 老师发生上课异常 上课时电脑发生蓝屏或冒烟异常
 * 
 * @author 弄风
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		Teacher1 teacher = new Teacher1();
		Computer computer = new Computer();
		try {
			teacher.attendClass(0);
			computer.useComputer(0);
		} catch (TeacherException e) {
			e.printStackTrace();
			System.out.println("老师出现异常,请同学们自由活动!");
		} catch (ComputerException e) {
			e.printStackTrace();
			System.out.println("电脑出现异常,请同学们自由活动!");
		}
	}
}

class Teacher1 {
	public void attendClass(int problem) throws TeacherException {
		if (problem == 0) {
			throw new TeacherException("老师出现异常!");
		} else {
			System.out.println("老师正常上课!");
		}
	}
}

class Computer {
	// 设定当前状态值
	int status = 2;

	public void useComputer(int problem) throws ComputerException {
		switch (status) {
		case 1://蓝屏
			//异常1
			break;
		case 2://异常
			//异常2
			break;

		default:
			break;
		}
	}

	// 重启
	public void reset() {
		System.out.println("重启电脑");
	}

	public void name() {

	}
}

class TeacherException extends Exception {

	public TeacherException() {
		super();
	}

	public TeacherException(String message) {
		super(message);
	}

}

class ComputerException extends Exception {

	public ComputerException() {
		super();
	}

	public ComputerException(String message) {
		super(message);
	}

}