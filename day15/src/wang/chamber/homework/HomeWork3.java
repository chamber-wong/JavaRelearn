package wang.chamber.homework;

public class HomeWork3 {
	public static void main(String[] args) {
		new Thread1().start();
		new Thread2().start();
		new Thread3().start();
		new Thread4().start();
		new Thread5().start();
		new Thread6().start();
		new Thread7().start();
	}
}
class Thread1 extends Thread{

	public void run() {
		System.out.println("开除不靠谱的副总经理");
	}
}
class Thread2 extends Thread{

	public void run() {
		System.out.println("给各部门总监开会");
	}
}
class Thread3 extends Thread{

	public void run() {
		System.out.println("陪VIP客户吃饭,打牌,KTV,桑拿,按摩...");
	}
}
class Thread4 extends Thread{

	public void run() {
		System.out.println("去香港给妻子买个6 Plus作为生日礼物");
	}
}
class Thread5 extends Thread{

	public void run() {
		System.out.println("去机场接女儿送到公司旁边的希尔顿饭店休息");
	}
}
class Thread6 extends Thread{

	public void run() {
		System.out.println("陪老妈去医院看腰间盘突出");
	}
}
class Thread7 extends Thread{
	public void run() {
		System.out.println("辅导儿子做作业");
	}
}