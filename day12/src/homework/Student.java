package homework;

public class Student {
	private String name;
	private String calss1;
	private int score;

	public Student(String name, String calss1, int score) {
		super();
		this.name = name;
		this.calss1 = calss1;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCalss1() {
		return calss1;
	}

	public void setCalss1(String calss1) {
		this.calss1 = calss1;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
