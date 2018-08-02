package demo;
/*
 *多态下的--一定要是多态
 *向上转型:相当于自动类型转换,由低类型到高类型
 *			定义:将子类的引用转成父类的引用.注意:只是将引用进行转换,与=后面的对象无关
 *向下转型:相当于强制类型转换,由高类型到低类型
 *          定义:将父类的引用强制转换成子类的引用.---调用子类特有的方法
 */
public class Demo8 {
	public static void main(String[] args) {
		//向上转型
		Animal2 animal = new Dog2();//多态
		
		//向下转型
		Dog2 dog = (Dog2)animal;
		dog.show();//调用子类特有的方法
		
		//注意点:
		//1.这里不叫向上转型,这是错误.不能试图用子类的引用指向父类的对象.
		//Dog2 dog2 = new Animal2();
		
		//2.这里不是向下转型,向下转型的前提是多态
		Animal2 animal2 = new Animal2();//这里不是多态
//		Dog2 dog2 = (Dog2)animal2;
		
		
	}
	
}

class Animal2{
	String name;
	public Animal2(String name) {
		super();
		this.name = name;
	}
	public Animal2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void play(){
		System.out.println("Animal-play");
	}
}

class Dog2 extends Animal2{
	public void  show() {
		System.out.println("Dog-show");
	}
}

class Cat2 extends Animal2{
	public void eat(){
		System.out.println("Cat-eat");
	}
}



