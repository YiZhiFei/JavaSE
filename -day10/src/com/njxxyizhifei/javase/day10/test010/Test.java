package com.njxxyizhifei.javase.day10.test010;
/**
 * ʵ�������/���顾�˽����ݣ�ʵ�����÷ǳ��١�
 * �ڹ��췽��ִ��֮ǰִ��
 * 1. ʵ���������Ա�д�����Ҳ����ѭ���϶��µ�˳��ִ��
 * 2.ʵ��������ڹ��췽��֮ǰִ�У����췽��ִ��һ�Σ�ʵ��������Ӧִ��һ�Ρ�
 * 3.ʵ�������Ҳ��java����Ϊ����Ա׼��һ�������ʱ�����������ʱ������Ϊ�������ʼ��ʱ����
 *
 */
public class Test {
	public Test(){
		System.out.println("Test���ȱʡ������ִ��");
	}
	{
		System.out.println(1);
	}
	{
		System.out.println(2);
	}
	{
		System.out.println(3);
	}
	public static void main(String[] args) {
		System.out.println("main begin");
		new Test();
		new Test();
	}

}
