package com.njxxyizhifei.javase.day09.test003;

public class UserTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// ����User����
		User user = new User();
		
		//���뱨����age����˽�л������ⲿ�����в���ֱ�ӷ���
		//�Ӵ�֮��age���Էǳ���ȫ�������е�̫��ȫ��
		//����Ŀǰ�ĳ�����˵���������ⲿ���ʲ�����
		//System.out.println(user.age);
		
		//�޸�
		user.setAge(-100);
		
		//��ȡ
		System.out.println(user.getAge());
	}

}