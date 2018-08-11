package demo;

public class Demo6 {
	public static void main(String[] args) {
		Person1 person = new Person1();
		person.baby = new Person1();
	}
}

//实例:人有一个孩子
//一个类型一旦创建出来,就是一个独立的数据类型.在它可见的范围都是可以使用的,包括自己的内部.
class Person1{
	String name;
	
	Person1 baby;
}
