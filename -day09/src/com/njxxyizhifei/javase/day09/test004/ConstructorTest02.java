package com.njxxyizhifei.javase.day09.test004;

/**
 * 
 * ���췽�������ã� 
 *     1.�������� 
 *     2.���������ͬʱ����ʼ��ʵ���������ڴ�ռ䡣����ʵ��������ֵ��
 *     
 * ��Ա����֮ʵ�����������ڶ��󼶱�ı��������ֱ����������ж��������ʵ��������
 * ʵ������û���ֶ���ֵ��ʱ��ϵͳĬ�ϸ�ֵ����ô���ϵͳĬ�ϸ�ֵ����ʲôʱ����ɵ��أ�
 *       ��������ص�ʱ���𣿲��ǣ���Ϊ����ص�ʱ��ֻ�����˴���Ƭ�Σ���û���ü������������Դ�ʱʵ��������û�г�ʼ����
 *       
 * ʵ���ϣ�ʵ���������ڴ�ռ����ڹ��췽��ִ�й��̵�����ɿ��ٵġ���ɳ�ʼ���ġ�
 * ϵͳ��Ĭ�ϸ�ֵ��ʱ��Ҳ���ڹ��췽��ִ�й��̵�����ɵĸ�ֵ��
 * 
 * ʵ������Ĭ��ֵ��
 * byte,short,int,long 0
 * float,double 0.0
 * boolean false
 * ������������null
 * 
 * ʵ�������Ǵ洢��JVM�Ķ��ڴ�java�����ڲ���
 * 
 */
public class ConstructorTest02 {
	public static void main(String[] args){
		
		//��myeclipse������ô�鿴���ʵ����ĸ����ԣ��鿴���ʵ����ĸ�������
		//��ctrl��������ƶ����鿴��Ԫ���ϣ������»��ߵ�ʱ��ʼ������
		//���⣬��һ���൱��Ԫ�ع��࣬����ٲ鿴���ڵ�ǰ����ʹ��ctrl + o��ݼ���Ȼ������Ҫ���ҵ�Ԫ�����ƣ������Ʋ�һ������ȫ����
		//��������
		Account act1 = new Account();
		
		System.out.println("�˺ţ�"+act1.getActno());	
		System.out.println("��"+act1.getBalance());
		
        Account act2 = new Account("110");
		
		System.out.println("�˺ţ�"+act2.getActno());	//110
		System.out.println("��"+act2.getBalance());//0.0
		
        Account act3 = new Account(10000);
		
		System.out.println("�˺ţ�"+act3.getActno());	//null
		System.out.println("��"+act3.getBalance());//10000
		
        Account act4 = new Account("act-001",10000.0);
		
		System.out.println("�˺ţ�"+act4.getActno());	//null
		System.out.println("��"+act4.getBalance());//10000
	}
}
