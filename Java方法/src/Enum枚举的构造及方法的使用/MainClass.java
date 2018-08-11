package Enum枚举的构造及方法的使用;
/**
 * Enum枚举的构造函数及方法的使用
 * 详解在csdn博客(https://blog.csdn.net/qq_27093465/article/details/52180865)
 * @author 弄风
 *
 */
enum Car{
	//要想在常量中使用参数,必须在构造函数中定义接收此变量
	lamborghini("兰博基尼",1000), tata("塔塔",10), audi("奥迪",100), fiat("菲亚特",5), honda("本田",2);
	
	private String name;
	private int money;
	
	
	private Car(String name , int money) {
		this.money = money;
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
public class MainClass {
	public static void main(String[] args) {
		Car car;
		for (Car car2 : Car.values()) {
			System.out.println("车名为:"+car2.getName());
			System.out.println("价格为:"+car2.getMoney());
		}
	}
}
