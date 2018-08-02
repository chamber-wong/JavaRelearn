package demo;
/*
 * 封装性:(根据对属性的封装来说明)把对成员变量的访问进行私有化,通过一个公共的方法间接的实现了访问.
 * 好处:提高了代码的安全性,提高了代码的可读性和复用性.
 * 
 * 快捷键:shift+alt+s
 */
public class Demo2 {
	public static void main(String[] args) {
		/*
		 * 开枪射击
		 */
		Gun gun = new Gun();
		//在程序中出现的不符合逻辑的数据称为脏数据
		/*
		 * 原因:直接将数据交给了成员变量
		 * 解决:1.不要将数据直接赋值给成员变量--将成员变量私有化
		 * 2.通过方法间接的访问他,在方法内先过滤,再赋值
		 */
		
		//gun.bulletNumber = -5;
		gun.addBullet(5);
		gun.shoot();
		/*
		 * 因为对所有的属性都需要进行赋值,取值,所以系统指定了一套规范---set,get方法
		 * set---赋值的过程
		 * 构成:  修饰词   返回值类型  方法名(参数列表){方法体
		 * 		返回值
		 * }
		 * 返回值类型:不需要--void
		 * 方法名:set+成员变量的名字,但是成员变量的首字母需要大写
		 * 参数列表:一个方法完成对一个属性的赋值,所以只需要一个参数.参数的类型与成员变量的一致,参数的名字与成员变量一致
		 * 方法体:this.成员变量 = 形参的名字
		 * 
		 * get---取值的过程
		 * 构成:  修饰词   返回值类型  方法名(参数列表){方法体
		 * 		返回值
		 * }
		 * 返回值类型:类型与成员变量一致
		 * 方法名:get+成员变量的名字,但是成员变量的首字母需要大写
		 * 参数列表:不需要参数
		 * 方法体:return 成员变量
		 */
	}
}

class Gun{
	//private:是修饰词,被他修饰的成员只在当前类中可见
	private int bulletNumber;
	private String name;
	private int height;
	private int weight;
	private int model;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getBulletNumber() {
		return bulletNumber;
	}

	public void addBullet(int number){
		//过滤
		if (number >= 0) {
			this.bulletNumber = number;
		}else {
			this.bulletNumber = 0;
		}
	}
	
	public void setBulletNumber(int bulletNumber){
		//过滤
		if (bulletNumber >= 0) {
			this.bulletNumber = bulletNumber;
		}else {
			this.bulletNumber = 0;
		}
		
	}
	
	//射击
	public void shoot(){
		if (bulletNumber>0) {
			--bulletNumber;
		}
		
		System.out.println("剩余的子弹数量:"+ bulletNumber);
	}
}
