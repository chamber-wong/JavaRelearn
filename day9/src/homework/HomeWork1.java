package homework;

/**
 * 测试使用接口充当父类的匿名内部类对象---作为参数,返回值.
 * 
 * @author 弄风
 *
 */
interface Father {
	public void job();

	public int getMoney();
}

public class HomeWork1 {
	public static void main(String[] args) {
	}

	// 匿名子类对象充当参数
	public void print() {
		System.out.println(new Father() {

			@Override
			public void job() {
				// TODO Auto-generated method stub

			}

			@Override
			public int getMoney() {
				// TODO Auto-generated method stub
				return 0;
			}

			public String toString() {
				return "返回值";
			}
		}.toString());
	}

	// 匿名子类对象充当返回值
	public Father getReturn() {
		return new Father() {

			@Override
			public void job() {
				System.out.println("工作很累");
			}

			@Override
			public int getMoney() {
				return 100000000;
			}
		};
	}
}
