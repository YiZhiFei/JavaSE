package com.njxxyizhifei.javase.day09.test004;

//�˺���
public class Account {
   //�˺�
	private String actno;//ʵ������/���������Ҳ����˵���������ж�������ж�Ӧ��ʵ��������
	
  public Account(String s){
	  actno = s;
	  //balance = 0.0;
  }   
  public Account(double d){
	  balance = d;
	  //actno = null;
  }
	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	//���
	private double balance;
	
	//�޲���������
	public Account(){
		//��ʼ��ʵ���������ڴ�ռ�
		
		
	}
}