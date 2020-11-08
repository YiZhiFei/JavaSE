package com.njxxyizhifei.javase.day09.test003;

public class CustomerTest {

	public static void main(String[] args) {
        
		Customer c = new Customer();
        
		// 操作入口变成了只能通过set和get方法进行访问
		//在set方法和get方法执行过程中可以进行安全过滤
		 c.setId(12);
         c.setName("YiZhiFei");
         c.setAge(20);
         c.setAddr("南京市");
         
         System.out.println(c.getId());
         System.out.println(c.getName());
         System.out.println(c.getAge());
         System.out.println(c.getAddr());
	}

}
