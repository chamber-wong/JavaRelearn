package phoneBook;
/**
 * 联系人管理系统
 * LinkMan联系人类
 * @author 弄风
 *
 */
public class LinkMan {
	private String name;
	private int age;
	private String gender;
	private String number;

	public LinkMan() {

	}
	

	public LinkMan(String name, int age, String gender, String number) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.number = number;
	}


	public String toString() {
		return name + "\t" + age + "\t" + gender + "\t" + number;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
