package com.njxxyizhifei.javase.day10.test005;

/**
 * �Զ������������
 * @author WeiJiaHui
 *
 */
public class Date {
      //����
	private int year;
	private int month;
	private int day;
	
	//���캯��
	
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/**
	 * ���󣺵�����Ա���������޲����Ĺ��췽��ʱ��Ĭ�ϴ����������ǡ�1970-1-1��
	 * 
	 */
	public Date(){
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		//���ϴ������ͨ��������һ�����췽�������
		//��ǰ���ǲ��ܴ����µĶ������´����ʾ����һ��ȫ�µĶ���
		//new Date(1970,1,1);
		
		//��Ҫ�������µ��﷨����ɹ��췽���ĵ���
		//���ַ�ʽ���ᴴ���µ�java���󡣵�ͬʱ�ֿ��Դﵽ���������Ĺ��췽����
		this(1970,1,1);
		
	}
	
	
	//setter and getter	
	public void setDay(int day) {
		this.day = day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}	
	public int getDay() {
		return day;
	}
	public int getYear() {
		return year;
	}
	
	//�����ṩһ���������Խ����ڴ�ӡ���������̨
	public void print(){
		System.out.println(this.year + "��" + this.month + "��" + this.day + "��");
	}
	
}