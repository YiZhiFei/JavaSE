package com.njxxyizhifei.javase.day09.test003;

/**
 * 封装的步骤： 1.所有的属性私有化，使用private关键字进行修饰，private表示私有的，修饰所有数据只能在本类中访问
 * 2.对外提供简单的操作入口，也就是说以后外部程序想要访问age属性，必须通过这些简单的入口进行访问： -
 * 对外提供两个公开的方法，分别是set方法和get方法 - 想修改age属性，调用set方法 - 想读取age属性，调用get方法
 * 
 * 3.set方法的命名规范： public void set + 属性名首字母大写（形参）{}
 * 
 * 如：public void setAge(int a){ age = a; }
 * 
 * 4.get方法的命名规范： public int getAge(){ return age; }
 * 
 * 回想以下，一个属性通常访问的时候包括集中访问形式？ - 第一种方式：想读取这个属性的值，读取get - 第二种方式：想修改这个属性的值，修改set
 * 
 * 需要大家先背会以下内容： * setter and getter方法没有static关键字 *
 * 有static关键字修饰的方法怎么调用：类名.方法名（实参）; * 没有static关键字修饰的方法怎么调用：引用.方法名（实参）;
 */
public class User {

	// 属性私有化
	private int age;

	// set方法没有返回值，因为set方法只负责修改数据
	/*
	 * public void setAge(int age){ age =
	 * age;//java有就近原则，这里其实并没有给age属性赋值，这里的age都是局部变量age }
	 */

	// setter
	public void setAge(int a) {
		//编写业务逻辑代码进行安全控制
		//age = a
	     if(a < 0 || a > 150){
	    	 System.out.println("对不起，您提供的年龄不合法");
	    	 return;
	     }	
	     
	     //程序可以执行到这里的话，说明a年龄是合法的，则进行赋值运算。
	     age = a;
	}

	// getter
	public int getAge() {
		return age;
	}
}
