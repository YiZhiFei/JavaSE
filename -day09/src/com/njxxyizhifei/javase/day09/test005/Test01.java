package com.njxxyizhifei.javase.day09.test005;

public class Test01 {

	public static void main(String[] args){		
		int i = 10;
		add(i);//add�������õ�ʱ�򣬸�add����������һ������i�����״�����ʲô��
		System.out.println("main -->" + i);//10
	}
	
	public static void add(int i){
		i ++;
		System.out.println("add -->" + i);//11
	}
}
