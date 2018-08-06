package com.qianfeng.kaoti2;

public class Company {
	private int no;
	private String name;
	private int num;
	private String founder;
	private String info;

	public Company(int no, String name, int num, String founder, String info) {
		super();
		this.no = no;
		this.name = name;
		this.num = num;
		this.founder = founder;
		this.info = info;
	}

	public Company() {
		super();
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

}
