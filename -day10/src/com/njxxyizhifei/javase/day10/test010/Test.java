package com.njxxyizhifei.javase.day10.test010;
/**
 * 实例代码块/语句块【了解内容，实际运用非常少】
 * 在构造方法执行之前执行
 * 1. 实例代码块可以编写多个，也是遵循自上而下的顺序执行
 * 2.实例代码块在构造方法之前执行，构造方法执行一次，实例代码块对应执行一次。
 * 3.实例代码块也是java语言为程序员准备一个特殊的时机，这个特殊时机被称为：对象初始化时机。
 *
 */
public class Test {
	public Test(){
		System.out.println("Test类的缺省构造器执行");
	}
	{
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
	{
		System.out.println(3);
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		new Test();
		new Test();
	}

}
