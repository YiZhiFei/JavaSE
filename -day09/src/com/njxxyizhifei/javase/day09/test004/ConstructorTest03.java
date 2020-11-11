package com.njxxyizhifei.javase.day09.test004;

public class ConstructorTest03 {
    
	public static void main(String[] args){
    	
    Customer c1 = new Customer();
    System.out.println("c1.getNo()");
    System.out.println("c1.getName()");
    System.out.println("c1.getBirth()");
    
    Customer c2 = new Customer(111,"zhangsan","1980-9-9");
    System.out.println("c2.getNo()");
    System.out.println("c2.getName()");
    System.out.println("c2.getBirth()");
    
    
    }
}
