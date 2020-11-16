package com.njxxyizhifei.javase.day10.test012;

public class Account {
    private String no;
    private double balance;
	public Account() {
	}
	public Account(String no, double balance) {
		this.no = no;
		this.balance = balance;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
