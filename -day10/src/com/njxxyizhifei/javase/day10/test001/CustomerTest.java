package com.njxxyizhifei.javase.day10.test001;


public class CustomerTest {

	public static void main(String[] args) {

		// ����Customer����
		Customer c1 = new Customer();
		c1.name = "zhangsan";

		// c1����
		c1.shopping();

		// �ٴ���Customer����
		Customer c2 = new Customer();
		c2.name = "Lisi";

		// c2����
		c2.shopping();
		
		//����doSome����(���η��б�����static)
		//���á�����.���ķ�ʽ���ʣ���Ȼ���������ִ�е�ʱ����Ҫ����Ĳμӡ�
		Customer.doSome();
		
		//����doSome����
		Customer.doOther();

	}

}