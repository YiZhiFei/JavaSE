package com.njxxyizhifei.javase.day10.test010;

public class MainTest {
/**
 * public表示公开的，在任何位置都是可以访问的
 * static表示静态的，使用“类名.”的方法即可访问，不需要创建对象，就可以调用main方法
 * void表示main方法执行结束之后不返回任何值
 * main是main方法的方法名
 * (String[] args)是main方法的形式参数列表
 */
	public static void main(String[] args) {
		main(10);
	}
	
	public static void main(int i){
		System.out.println(i);//把main方法看成普通方法
	}

}
