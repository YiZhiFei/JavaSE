package com.njxxyizhifei.javase.day09.test004;

public class Customer {
    private int no; 

	//参数构造器
    public Customer(int no, String name, String birth) {
		super();
		this.no = no;
		this.name = name;
		this.birth = birth;
	}
	//无参数构造器
	public Customer() {
		super();
	}
	private String name;
	private String birth;
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
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}

