package com.njxxyizhifei.javase.day10.test013;

public class Parrot extends Bird {

	//这里move覆盖的是Bird里的move
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		System.out.println("鹦鹉飞不起来");
	}
	
}
