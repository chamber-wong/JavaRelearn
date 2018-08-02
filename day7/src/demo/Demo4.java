package demo;

public class Demo4 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.play();
		dog.setName("sa");
	}
}
class Animal{
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String name) {
	}
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Dog extends Animal{
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	public void play() {
		System.out.println("play");
	}
}
