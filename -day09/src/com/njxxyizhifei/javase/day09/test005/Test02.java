package com.njxxyizhifei.javase.day09.test005;
/*
   ���ս��ۣ�
      �������õ�ʱ���漰���������ݵ����⣬���ݵ�ʱ��Javaֻ��ѭһ��
      �﷨���ƣ����ǽ������б���ġ�ֵ�����ݹ�ȥ�ˣ�ֻ�����е�ʱ�����ֵ
      ��һ������ֵ10���е�ʱ�����ֵ����һ��java������ڴ��ַox1234
*/
public class Test02 {
  public static void main(String[] args){
	  User u = new User(20);
	  //User u = ox1234��
	  //����u��add������ʱ��ʵ���ϴ��ݵ���u�����б����ֵ��ֻ�������ֵ��һ��java������ڴ��ַ��
	  add(u);
	  System.out.println("main-->" + u.age);
  }
  public static void add(User u){
	  u.age++;
	  System.out.println("add-->"+ u.age);
  }
}

class User{
	
	//ʵ������
	int age;
	
	//���췽��
	public User(int i){
		age = i;
	}
}