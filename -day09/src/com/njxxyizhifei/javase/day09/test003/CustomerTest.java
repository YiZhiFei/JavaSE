package com.njxxyizhifei.javase.day09.test003;

public class CustomerTest {

	public static void main(String[] args) {
        
		Customer c = new Customer();
        
		// ������ڱ����ֻ��ͨ��set��get�������з���
		//��set������get����ִ�й����п��Խ��а�ȫ����
		 c.setId(12);
         c.setName("YiZhiFei");
         c.setAge(20);
         c.setAddr("�Ͼ���");
         
         System.out.println(c.getId());
         System.out.println(c.getName());
         System.out.println(c.getAge());
         System.out.println(c.getAddr());
	}

}
