package com.njxxyizhifei.javase.day10.test010;

public class MainTest {
/**
 * public��ʾ�����ģ����κ�λ�ö��ǿ��Է��ʵ�
 * static��ʾ��̬�ģ�ʹ�á�����.���ķ������ɷ��ʣ�����Ҫ�������󣬾Ϳ��Ե���main����
 * void��ʾmain����ִ�н���֮�󲻷����κ�ֵ
 * main��main�����ķ�����
 * (String[] args)��main��������ʽ�����б�
 */
	public static void main(String[] args) {
		main(10);
	}
	
	public static void main(int i){
		System.out.println(i);//��main����������ͨ����
	}

}
