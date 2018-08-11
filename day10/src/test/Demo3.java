package test;
/**
 * 为了解释fushuexcption构造方法中的参数如何在打印方法中显示
 * @author 弄风
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("除数为负数了");
		teacher.printStackTrace();
	}
}
class Person{
	private String message;

	public Person() {
		super();
	}

	public Person(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void printStackTrace() {
		System.out.println(this.getMessage());
	}
}
class Teacher extends Person{

	public Teacher() {
		super();
	}

	public Teacher(String message) {
		super(message);
	}
	
}