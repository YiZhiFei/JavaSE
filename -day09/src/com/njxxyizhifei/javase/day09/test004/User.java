package com.njxxyizhifei.javase.day09.test004;

public class User {

	
	// �޲������췽�� 
	public User(){ 
		  System.out.println("User's Default Constructor Invoke!");
	  }
	 

	// �в����Ĺ��췽��
	public User(int i) {
		System.out.println("����int���͵Ĺ�����");
	}
	// �в����Ĺ��췽��
	public User(String name){
		System.out.println("����String���͵Ĺ�����");
	}
	// �в����Ĺ��췽��
	public User(int i,String name){
		System.out.println("����int,String���͵Ĺ�����");		
	}
}