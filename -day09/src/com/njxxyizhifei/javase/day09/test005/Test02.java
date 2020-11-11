package com.njxxyizhifei.javase.day09.test005;
/*
   最终结论：
      方法调用的时候，涉及到参数传递的问题，传递的时候，Java只遵循一种
      语法机制，就是将变量中保存的“值”传递过去了，只不过有的时候这个值
      是一个字面值10，有的时候这个值是另一个java对象的内存地址ox1234
*/
public class Test02 {
  public static void main(String[] args){
	  User u = new User(20);
	  //User u = ox1234；
	  //传递u给add方法的时候，实际上传递的是u变量中保存的值，只不过这个值是一个java对象的内存地址。
	  add(u);
	  System.out.println("main-->" + u.age);
  }
  public static void add(User u){
	  u.age++;
	  System.out.println("add-->"+ u.age);
  }
}

class User{
	
	//实例变量
	int age;
	
	//构造方法
	public User(int i){
		age = i;
	}
}
