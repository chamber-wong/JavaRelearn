package demo;

public class Demo3 {

}
class Phone{
	String color;
	int model;
	
	public void callPhone() {
		System.out.println("打电话");
	}
	
}
//创建iphone类
class IPhone extends Phone{
//	String color;
//	int model;
	String gui;
	
	public void fangshui() {
		System.out.println("防水");
	}
//	public void callPhone() {
//		System.out.println("打电话");
//	}
}
//创建华为类
class HUAWEI extends Phone{
//	String color;
//	int model;
	
//	public void callPhone() {
//		System.out.println("打电话");
//	}
	
	public void nv() {
		System.out.println("牛逼");
	}
}