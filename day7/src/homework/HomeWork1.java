package homework;

public class HomeWork1 {
	public static void main(String[] args) {
		ChairMan chairMan = ChairMan.getChairMan("马云", "男", 170, 200000000);
		System.out.println("阿里巴巴主管外部事务的高管给来访的外宾介绍本公司首脑"
				+ chairMan.getName()+chairMan.getGender()+chairMan.getHeight()+chairMan.getSalary());
	}
}

class ChairMan {
	private static ChairMan chairMan = null;
	private String name;
	private String gender;
	private int height;
	private int salary;

	private ChairMan() {

	}

	private ChairMan(String name, String gender, int height, int salary) {
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.salary = salary;
	}

	public static ChairMan getChairMan(String name, String gender, int height, int salary) {
		if (chairMan == null) {
			chairMan = new ChairMan(name, gender, height, salary);
		}
		return chairMan;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}