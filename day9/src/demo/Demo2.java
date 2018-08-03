package demo;
/*
 * 类与类之间的关系:
 * 1.继承--从现实的关系考虑当可以使用谁是谁描述
 * 2.组合--从现实的关系考虑当可以使用谁属于谁描述
 * 3.传参
 * 
 * 传参的内聚性最高,耦合性最低
 */
public class Demo2 {
	public static void main(String[] args) {
		//实例:根据轮子的个数比较两辆车
		Car car1 = new Car(3);
		Car car2 = new Car(2);
		boolean isTrue =  car1.comWithWheels(car2);
		System.out.println(isTrue);
		
		//学习equals
		//默认的比较规则是按照地址比较,我们通过重写它,可以按照自己的比较规则进行.
		boolean istrue1 = car1.equals(car2);
		System.out.println(istrue1);
		
		//hashCode()方法--获取到是对象的哈希值,可以理解成当前对象的身份证
		System.out.println(car1.hashCode());//31168322  十进制的哈希值
		System.out.println(car2.hashCode());
		
		System.out.println(Integer.toHexString(car1.hashCode()));//1db9742  十六进制的哈希值
		
		//toString()默认得到的是包名+类名+@+哈希值
		System.out.println(car1.toString());//com.qianfeng.test.Car@1db9742
//		System.out.println(car1);/com.qianfeng.test.Car@1db9742  说明默认调用的toString()方法
		
		
		//了解:getClass():获取的是当前对象的字节码文件,相当于将系统处理事务的过程面向对象了形成了Class类
		Class class1 = car1.getClass();
		System.out.println(class1);//class com.qianfeng.test.Car  得到的就是字节码文件
		//自己拼出默认的toString()
		System.out.println(class1.getName()+"@"+Integer.toHexString(car1.hashCode()));
	}
}

class Car{
	int wheels;
	public Car(int wheels) {
		super();
		this.wheels = wheels;
	}

	//根据轮子的个数比较两辆车
	public boolean comWithWheels(Car car){
		return this.wheels > car.wheels;
	}
    
	//重写equals方法
	public boolean equals(Object obj) {
		//自己制定比较的规则
		//1容错处理
		if (!(obj instanceof Car)) {
			System.out.println("类型错误");
			//退出程序
			System.exit(0);
		}
		
		//2.向下转型
		Car car = (Car)obj;
		
		return this.wheels > car.wheels;
	}
	
	@Override
	public String toString() {
		return "Car [wheels=" + wheels + "]";
	}
     
}
