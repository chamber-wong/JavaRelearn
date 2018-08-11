package demo;
/*
 * 构造方法:调用时候的构成:类名+()
 * 作用:对对象的属性进行初始化,如果我们不自己创建构造方法,系统会调用默认的无参构造方法.
 * 
 * 创建自己的构造方法:
 * 分类:
 * 无参的构造方法:会将成员变量初始化成null或0或false等
 * 有参的构造方法:会将成员变量进行初始化并赋值(赋值成通过参数传入的值)
 * 
 * 定义时的基本构成:
 * 修饰词    方法名(参数列表){
 * 		方法体
 * }
 * 注意点:1.没有返回值这一项   2.方法名必须与当前的类名相同
 * 
 * 
 * 使用构造方法的注意点:
 * 1.一旦创建了自己的构造方法,就不会再去调用系统默认的构造方法.
 * 2.多个构造方法之间是重载的关系
 * 
 * this:是一个关键字,是一种引用数据类型,代表的是当前的对象.保存的是当前对象的地址.
 * 场景:想在当前类的内部拿到当前对象的引用的时候使用this
 * 
 * this的作用:1.区分成员变量和局部变量
 * 2.可以在构造方法中调用其他重载的构造方法,提高代码的复用性,简化代码.
 * 
 * 关于this 的注意点:
 * 1.在作为方法到时候,只适用于构造方法.
 * 2.不能自己调用自己--死循环
 * 3.不能相互调用--死循环
 * 4.在构造方法中调用其他重载的构造方法,必须方法第一行
 * 5.在静态方法中无法使用this
 */
public class Demo4 {
	public static void main(String[] args) {
		Student student = new Student();//构造方法--系统默认创建的构造方法
		student.name = "bingbing";
		
		Student student1 = new Student("冰冰");
		System.out.println(student1.name);
	}
}

class Student{
	String name;
	int age;
	int weight;
	
	public void study() {
		System.out.println(name+"在学习");
	}
	
	//创建无参的构造方法
	public Student(){
		//在构造方法的内部会自动的进行属性的初始化.
		//this();//自己调用自己会造成死循环
		System.out.println("无参构造方法");
	}
	
	//有参的构造方法
	//这里当成员变量与形参的名字一致时,方法内部识别的是形参.依据的是就近原则
	//就近原则是从内存的角度考虑远近.
	public Student(String name){
		this.name = name;//给对象的属性完成赋值
		System.out.println("有参构造方法");
	}
	
	public Student(String name,int age){
		//通过this调用其他构造方法的时候必须放在当前方法的第一行.
		this(name);
		this.age = age;
	}
	
	public Student(String name,int age,int weight){
		this(name, age);//代表在调用两个参数的构造方法
		this.weight = weight;
	}
}
