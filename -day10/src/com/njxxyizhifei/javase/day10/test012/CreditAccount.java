package com.njxxyizhifei.javase.day10.test012;

public class CreditAccount extends Account{
	private double credit;
	public CreditAccount() {
		super();
	}
	
	public double getCredit() {
		return credit;
	}
	public void setCredit(double credit) {
		this.credit = credit;
	}
}