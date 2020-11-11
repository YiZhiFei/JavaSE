package com.njxxyizhifei.javase.day10.test004;
/**
 * "this."什么时候不能省略？
 * 用来区分局部变量和实例变量的时候不能省
 */
public class User {
   
	//属性
	private int id;//实例变量
    private String name;
   
    //构造函数
    public User(){
    	
    }
    /*
     以前的写法：
      public User(int a,String b){
    	id = a;
    	name = b;
    }
     */
    //UserTest：可以这么写
    public User(int id,String name){
    	this.id = id;
    	this.name = name;
    }
  //以下程序的id和实例变量无关，不能采用这种方式
    //Setter and getter;
    /*
    public void setId(int a){
    	id = a;
    }
    */
  
    //以下程序的id和实例变量无关，不能采用这种方式
    /*
    public void setId(int id){
    	id = id;
    }
    */
    
    public int getId(){
    	return id;
    }
    public String getName(){
    	return name;
    }
    
    public void setId(int id){
      this.id = id;
    }
      //等号后面的id是局部变量id
      //等号前边的this.id是实例变量的id
    public void setName(String name){
    	this.name = name;
    }
}
