package com.njxxyizhifei.javase.day10.test009;
/**
 * ʲôʱ���Ա��������Ϊʵ�������أ�
 * - ���ж�����������ԣ�����������Ե�ֵ�����Ŷ���ı仯���仯����ͬ�����������Ծ����ֵ��ͬ��
 *              
 * ʲôʱ���Ա��������Ϊ��̬�����أ�
 * - ���ж�����������ԣ��������ж����������Ե�ֵ��һ���ģ����鶨��Ϊ��̬��������ʡ�ڴ�Ŀ�����
 * 
 * ��̬����������ص�ʱ���ʼ�����ڴ��ڷ������п��٣����ʵ�ʱ����Ҫ��������ֱ��ʹ�á�����.��̬���������ķ�ʽ���ʡ�
 * 
 * ����java�е�static�ؼ��֣�
 *  1.staticӢ�ﵥ�ʷ���Ϊ��̬�ġ�
 *  2.static���εķ����Ǿ�̬������
 *  3.static���εı����Ǿ�̬������
 *  4.����static���ε�Ԫ�ض���Ϊ��̬�ģ�������ʹ�á�����.���ķ�ʽ���ʣ���ȻҲ����������.�ķ�ʽ���ʡ������顿
 *  5.static���ε�����Ԫ�ض����༶����������;���Ķ����޹ء�
 */
public class Chinese {
	
	//����֤�š�ÿһ�����������֤�Ų�ͬ��
	 String id;
	
	//������ÿһ�������������ͬ��
	 String name;
	
	//���������ж��������һ�����������������༶�����������������Ϊ����ģ��������������ڱ���ǰ����static�ؼ������Ρ�
	//��̬��������̬����������ص�ʱ���ʼ��������Ҫ���������ڴ�Ϳ����ˡ�
	//��̬�����洢�ڷ������ڴ���
	static String country = "�й�";//�����ڸ���������������ģ�弶��
	
	public Chinese() {
	}
	
	public Chinese(String id,String name) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

}