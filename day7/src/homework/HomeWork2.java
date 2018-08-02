package homework;

public class HomeWork2 {
	String name;
	public static void buyDog(Dog dog) {
		System.out.println("贵妇购买了宠物狗:");
		System.out.println("购买宠物狗的名字为:"+dog.name);
		System.out.println("购买宠物狗的性别为:"+dog.gender);
		System.out.println("购买宠物狗的年龄为:"+dog.age);
		System.out.println("购买宠物狗的品种为:"+dog.breed);
	}
	public static void buyCat(Cat cat) {
		System.out.println("贵妇购买了宠物猫:");
		System.out.println("购买宠物猫的名字为:"+cat.name);
		System.out.println("购买宠物猫的性别为:"+cat.gender);
		System.out.println("购买宠物猫的年龄为:"+cat.age);
		System.out.println("购买宠物猫的品种为:"+cat.breed);
	}
	public static void party() {
		System.out.println("举办派对!");
	}
	public static void introduceDog(Dog dog) {
		System.out.println("贵妇为大家介绍宠物狗:");
		System.out.println("宠物狗的名字为:"+dog.name);
		System.out.println("宠物狗的性别为:"+dog.gender);
		System.out.println("宠物狗的年龄为:"+dog.age);
		System.out.println("宠物狗的品种为:"+dog.breed);
	}
	public static void introduceCat(Cat cat) {
		System.out.println("贵妇为大家介绍宠物猫:");
		System.out.println("宠物猫的名字为:"+cat.name);
		System.out.println("宠物猫的性别为:"+cat.gender);
		System.out.println("宠物猫的年龄为:"+cat.age);
		System.out.println("宠物猫的品种为:"+cat.breed);
	}
	public static void main(String[] args) {
		Dog dog = new Dog("小白", "公", 18, "拉布拉多");
		Cat cat = new Cat("小黄", "母", 1, "橘猫");
		buyDog(dog);
		buyCat(cat);
		party();
		introduceDog(dog);
		introduceCat(cat);
	}
}
class Pet{
	String name;
	String gender;
	int age;
	String breed;
	
	public Pet(String name,String gender, int age ,String breed ) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.breed = breed;
	}
	public void eat() {
		System.out.println("动物都能吃");
	}
}
class Dog extends Pet{
	public Dog(String name, String gender, int age, String breed) {
		super(name, gender, age, breed);
		// TODO Auto-generated constructor stub
	}
	public void lookHouse() {
		System.out.println("看家");
	}
	public void eat() {
		this.eat();
		System.out.println("eat bone");
	}
}
class Cat extends Pet{
	public Cat(String name, String gender, int age, String breed) {
		super(name, gender, age, breed);
		// TODO Auto-generated constructor stub
	}
	public void catchMouse() {
		System.out.println("catch mouse");
	}
	public void eat() {
		this.eat();
		System.out.println("猫吃鱼");
		
	}
}
