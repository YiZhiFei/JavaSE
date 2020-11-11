package com.njxxyizhifei.javase.day10.test005;

/**
 * 自定义的日期类型
 * @author WeiJiaHui
 *
 */
public class Date {
      //属性
	private int year;
	private int month;
	private int day;
	
	//构造函数
	
	public Date(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/**
	 * 需求：当程序员调用以下无参数的构造方法时，默认创建的日期是“1970-1-1”
	 * 
	 */
	public Date(){
		/*
		this.year = 1970;
		this.month = 1;
		this.day = 1;
		*/
		//以上代码可以通过调用另一个构造方法来完成
		//但前提是不能创建新的对象，以下代码表示创建一个全新的对象
		//new Date(1970,1,1);
		
		//需要采用以下的语法来完成构造方法的调用
		//这种方式不会创建新的java对象。但同时又可以达到调用其它的构造方法。
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
	
	//对外提供一个方法可以将日期打印输出到控制台
	public void print(){
		System.out.println(this.year + "年" + this.month + "月" + this.day + "日");
	}
	
}
