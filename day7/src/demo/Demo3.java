package demo;
/*
 * 重写:当子类有与父类同名(方法名,参数等完全相同)的方法,我们称为重写.
 * 注意点:相当于子类的同名方法将父类的覆盖了,不会再去调用父类的方法.
 * 
 * 作用:在不改变父类方法名字的前提下,在父类原有方法的功能基础上,实现一些自己的功能.实现了对原有功能的扩充.
 * 
 * this:是一种引用数据类型,代表当前的对象.保存的是当前对象的地址
 * super:不是一种引用数据类型.可以通过super调用父类的成员
 * 
 * 注意事项:
 * 1.私有方法不能被重写
 * 2.子类的同名方法的权限大于等于父类的同名方法
 * 3.静态的方法只能覆盖静态的方法
 */
public class Demo3 {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.color = "玫瑰金";//调用父类的成员变量
		iphone.gui = "贵";//调用的自己的成员变量
		/*
		 * 子类调用父类方法的原理:首先由引用找到当前的子类对象,在当前的对象里找这个方法,找到了,直接调用.如果没有,再去
		 * 父类中找,找到了调用,找不到再继续向上找,一直找到Object,如果还是没有找到,说明没有这个方法.
		 */
		iphone.callPhone();//调用的父类的成员方法
		iphone.fangShui();//调用自己的成员方法
	}
}

//注意:一个类如果没有写父类,默认是Object
class Phone {
	//提取的共同的属性和行为
	String color;
	int model;
	public void callPhone(){
		System.out.println("打电话");
	}
	
	public static void play(){
		
	}
}

//创建Iphone类
//子类  extends 父类
class Iphone extends Phone{
//	String color;
//	int model;
	String gui;
	
	public void fangShui(){
		
		System.out.println("防水");
	}
	
	//重写了父类的方法
	public void callPhone(){
		//this.callPhone();//调到的是本对象的callPhone方法--死循环
		super.callPhone();//直接调用的是父类的方法
		
		System.out.println("自己特有的功能");
	}
	
	//静态的方法只能覆盖静态的 
	public static void play(){
		
	}
}
//创建HuaWei类
class HuaWei extends Phone{
//	String color;
//	int model;
//	public void callPhone(){
//		System.out.println("打电话");
//	}
	
	//特有的方法
	public void Niu(){
		System.out.println("牛");
	}
}