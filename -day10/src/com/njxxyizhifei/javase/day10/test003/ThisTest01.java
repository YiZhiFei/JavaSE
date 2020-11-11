package com.njxxyizhifei.javase.day10.test003;

public class ThisTest01 {

    //实例
	String name;
    
    //实例
	public void doSome(){
				
	}
	  
	//带有static
    public static void main(String[] args) {
		
    	//这里没有this
    	
    	//System.out.println(name);
		//doSome();
    	
    	ThisTest01 tt = new ThisTest01();
    	System.out.println(tt.name);
    	tt.doSome();

	}

}
