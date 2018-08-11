package demo;

public class Demo5 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "拉布拉多";
		
		//匿名对象:没有名字的对象.
		new Dog().name = "haha";
		
		//使用场景:可以作为参数传递
		//作用:简化代码
		feedDog(new Dog());
		
		//实例:
		new Dog().name = "柯基";
		new Dog().age = 30;
		System.out.println(new Dog().name+"   "+new Dog().age);//null   0
	}
	
	public static void feedDog(Dog dog1) {//dog1 = new Dog()
		dog1.name = "金毛";
	}
}

class Dog{
	String name;
	int age;
}
