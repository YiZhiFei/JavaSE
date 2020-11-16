package com.njxxyizhifei.javase.day11.test001;

//猫类
public class Cat extends Animal {

	//重写父类中继承过来的方法
	public void move(){
		System.out.println("猫在走猫步");
	}		
		//不是从父类中继承过来的方法
		//这个方法是子类对象特有的行为【不是所有动物都能抓老鼠嘻嘻】
		public void catchMouse(){
			System.out.println("猫抓老鼠");
		}	
}
