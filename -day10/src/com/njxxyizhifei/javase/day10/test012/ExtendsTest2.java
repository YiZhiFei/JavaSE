package com.njxxyizhifei.javase.day10.test012;
/**
 * 
 *
 */
public class ExtendsTest2 {
	public static void main(String[] args) {
		C c = new C();
		c.doSome();//������õ�doSome�����Ǵ�B�м̳й�����
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
