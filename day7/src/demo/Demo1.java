package demo;
/**
 * 射击游戏
 * @author 弄风
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		/*
		 * 开枪射击
		 */
		Gun gun = new Gun();
		gun.addBullet(5);
		gun.shoot();
	}

}

class Gun{
	//private:是修饰词,被他修饰的成员只在当前类中可见.
	private int bulletNumber;
	private int height;
	private int weight;
	private String name;
	
	//射击方法
	public void shoot() {
		if (bulletNumber > 0) {
			--bulletNumber;
		}
		System.out.println("剩余的子弹数量:"+ bulletNumber);
	}
	
	public void addBullet(int number) {
		//过滤
		if (number >= 0) {
			bulletNumber = number;
		}else {
			bulletNumber = 0;
		}
	}

	public int getBulletNumber() {
		return bulletNumber;
	}

	public void setBulletNumber(int bulletNumber) {
		this.bulletNumber = bulletNumber;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
