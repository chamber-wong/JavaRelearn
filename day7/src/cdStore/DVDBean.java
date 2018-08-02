package cdStore;

public class DVDBean {
	
	//state为借出状态,0为借出,1为没有借出
	private String name;
	private int state;
	private int date;
	private int count;
	
	public DVDBean(String name,int state,int count) {
		this.name = name;
		this.state = state;
		this.count = count;
	}
	public DVDBean(String name,int state,int date,int count) {
		this(name, state, count);
		this.date = date;
	}
	
	public String toString() {
		String string = "";
		if (getState() == 0) {
			string += "已借出\t";
		}else {
			string += "可借\t";
		}
		string += "《"+getName()+"》\t";
		
		if (getDate() != 0) {
			string += getDate() + "日\t\t";
		}else {
			string += "\t\t";
		}
		string += getCount()+"次";
		return string;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		if (date != 0) {
			this.date = date;
		}else {
			this.date = 0;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
