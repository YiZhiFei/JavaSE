package com.njxxyizhifei.javase.day10.test003;

public class ThisTest01 {

    //ʵ��
	String name;
    
    //ʵ��
	public void doSome(){
				
	}
	  
	//����static
    public static void main(String[] args) {
		
    	//����û��this
    	
    	//System.out.println(name);
		//doSome();
    	
    	ThisTest01 tt = new ThisTest01();
    	System.out.println(tt.name);
    	tt.doSome();

	}

}