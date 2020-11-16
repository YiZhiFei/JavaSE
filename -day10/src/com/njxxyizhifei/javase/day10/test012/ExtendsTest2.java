package com.njxxyizhifei.javase.day10.test012;
/**
 * 
 *
 */
public class ExtendsTest2 {
	public static void main(String[] args) {
		C c = new C();
		c.doSome();//这里调用的doSome方法是从B中继承过来的
	}

}
class A{
	public void doSome(){
		System.out.println("do Some!");
	}
}
class B extends A{
	
}
class C extends B{

}
