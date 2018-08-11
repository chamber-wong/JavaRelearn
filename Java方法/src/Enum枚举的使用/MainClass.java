package Enum枚举的使用;
/**
 * enum的简单定义和使用
 * 详解在csdn博客(https://blog.csdn.net/qq_27093465/article/details/52180865)
 * @author 弄风
 *
 */
enum Car {
	lamborghini, tata, audi, fiat, honda;
}

public class MainClass {

	public static void main(String[] args) {
		Car c;
		c = Car.lamborghini;
		switch (c) {
		case lamborghini:
			System.out.println("你选择了 lamborghini!");
			break;
		case tata:
			System.out.println("你选择了 tata!");
			break;
		case audi:
			System.out.println("你选择了 audi!");
			break;
		case fiat:
			System.out.println("你选择了 fiat!");
			break;
		case honda:
			System.out.println("你选择了 honda!");
			break;
		default:
			System.out.println("我不知道你的车型。");
			break;
		}

	}

}
