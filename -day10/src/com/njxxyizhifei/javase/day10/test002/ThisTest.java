package com.njxxyizhifei.javase.day10.test002;

public class ThisTest {
	
	//ʵ������������.�ķ�ʽ���ʣ�
	int num = 10;

	//����static�ķ���
	//JVM�������main������JVM����ô���õģ�
	//ThisTest.main(String[]);
	public static void main(String[] args) {
		
	//û�е�ǰ����this
	
		//���´���ʲô��˼��
		//���ʡ���ǰ���󡱵�num����
		//System.out.println(num);//�������
		
		//System.out.println(this.num);//�������
		
		//�����num��ô�죿
		ThisTest tt = new ThisTest();
		System.out.println(tt.num);

	}

}