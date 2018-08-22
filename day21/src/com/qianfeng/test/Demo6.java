package com.qianfeng.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 序列化流:是将短期存储的数据实现长期存储
 * 数据的存储分成两类:
 * 1.短期存储:存放在内存中,随着程序的关闭而释放---对象,集合,变量,数组
 * 2.长期存储:存储在磁盘中,即使程序关闭了,数据仍然存在------文件
 * 
 * 序列化:将数据从内存放入磁盘,可以实现数据的长久保存--数据持久化的手段
 * 反序列化:将数据从磁盘放回内存
 * 
 * 进行序列化的步骤:--通过对象的序列化讲解
 * 1.创建一个类
 * 2.使用对应的流将对象存入磁盘中----序列化----ObjectOutputStream
 * 3.使用对应的流将对象从磁盘中取出放回内存--反序列化------ObjectInputStream
 * 4.关闭流
 * 
 * 注意点:序列化流在工作时也要关联对应的输入流和输出流
 */
//创建类用于序列化
//类通过实现 java.io.Serializable 接口以启用其序列化功能。未实现此接口的类将无法使其任何状态序列化或反序列化。
//可序列化类的所有子类型本身都是可序列化的。序列化接口没有方法或字段，仅用于标识可序列化的语义。
/*
 * 解释:
 * 一个类如果没有实现Serializable,进行序列化会报异常:NotSerializableException
 * 
 * 实现了Serializable接口的类可以达到的目的:
 * 1.可以进行序列化
 * 2.进行序列化的类的元素都必须支持序列化
 * 3.接口本身没有方法或字段,只是用来表示可序列化的语义
 * 
 * * 注意点:
 * 1. ClassNotFoundException:当前的类没有找到
 * 分析:将Person对象进行序列化之后,将Person类删除,再进行反序列化的时候出现了异常
 * 原因:反序列化在执行的时候依赖字节码文件,当类没有了,字节码文件无法创建,反序列化失败
 * 
 * 2.java.io.InvalidClassException  无效的类
 * 出现的原因:没有声明自己的serialVersionUID,而使用系统的.在进行反序列化的时候,类被改动了,系统认为现在的类
 * 已经不是原来的类了(在使用系统的id进行识别的时候,重写给Person设置了id),认为此类无效
 * 
 * 3.使用系统的serialVersionUID与自定义的ID的区别?
 * 使用系统的,序列化和反序列化,id不能手动设置,使用的是编译器默认生成的,一旦类发生了改动,id会重新赋值
 * 使用自定义的,序列化和反序列化,id不会发生改变,所以当反序列化的时候,即使对Person类进行了一些改动,也能继续反序列化
 * 
 * 4.总结序列化,反序列化工程的注意点:
 * a.合理使用序列化流和反序列化流,要与输入流与输出流配合使用
 * b.进行序列化的类一定要实现Serializable接口,只要实现了接口就可以序列化.包括集合,包装类等
 * c.进行序列化的类要保证当前类与内部的类都要实现Serializable接口
 * 
 */
class Person  implements Serializable{
    /**
	 * generated:由编译器自动生成的,后面加L表示long型
	 */
	private static final long serialVersionUID = -7224641225172644265L;
//	/**
//	 * default:UID是由用户自己指定的,默认值是1L
//	 */
//	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private int height;
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class Demo6 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		//写出--序列化
		//writeFile();
		//读入--反序列化
		readFile();
	}
	
	//写出--序列化
	public static void writeFile() throws FileNotFoundException, IOException{
		//创建序列化流并关联文件
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("temp4.txt"));
		
		//调用方法实现序列化
		//序列化后的内容不能直接查看,要想查看进行反序列化
		objectOutputStream.writeObject(new Person("bingbing", 20));
		
		objectOutputStream.close();
	}
	//读入--反序列化
	public  static  void readFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("temp4.txt"));
		
		//实现反序列化
		Object object = objectInputStream.readObject();
		
		//向下转型
		//Person person = (Person)object;
		/*
		 * ClassNotFoundException:当前的类没有找到
		 * 分析:将Person对象进行序列化之后,将Person类删除,再进行反序列化的时候出现了异常
		 * 原因:反序列化在执行的时候依赖字节码文件,当类没有了,字节码文件无法创建,反序列化失败
		 */
		System.out.println(object);
		
		objectInputStream.close();
	}
}
