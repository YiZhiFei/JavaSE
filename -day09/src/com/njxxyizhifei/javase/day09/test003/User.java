package com.njxxyizhifei.javase.day09.test003;

/**
 * ��װ�Ĳ��裺 1.���е�����˽�л���ʹ��private�ؼ��ֽ������Σ�private��ʾ˽�еģ�������������ֻ���ڱ����з���
 * 2.�����ṩ�򵥵Ĳ�����ڣ�Ҳ����˵�Ժ��ⲿ������Ҫ����age���ԣ�����ͨ����Щ�򵥵���ڽ��з��ʣ� -
 * �����ṩ���������ķ������ֱ���set������get���� - ���޸�age���ԣ�����set���� - ���ȡage���ԣ�����get����
 * 
 * 3.set�����������淶�� public void set + ����������ĸ��д���βΣ�{}
 * 
 * �磺public void setAge(int a){ age = a; }
 * 
 * 4.get�����������淶�� public int getAge(){ return age; }
 * 
 * �������£�һ������ͨ�����ʵ�ʱ��������з�����ʽ�� - ��һ�ַ�ʽ�����ȡ������Ե�ֵ����ȡget - �ڶ��ַ�ʽ�����޸�������Ե�ֵ���޸�set
 * 
 * ��Ҫ����ȱ����������ݣ� * setter and getter����û��static�ؼ��� *
 * ��static�ؼ������εķ�����ô���ã�����.��������ʵ�Σ�; * û��static�ؼ������εķ�����ô���ã�����.��������ʵ�Σ�;
 */
public class User {

	// ����˽�л�
	private int age;

	// set����û�з���ֵ����Ϊset����ֻ�����޸�����
	/*
	 * public void setAge(int age){ age =
	 * age;//java�оͽ�ԭ��������ʵ��û�и�age���Ը�ֵ�������age���Ǿֲ�����age }
	 */

	// setter
	public void setAge(int a) {
		//��дҵ���߼�������а�ȫ����
		//age = a
	     if(a < 0 || a > 150){
	    	 System.out.println("�Բ������ṩ�����䲻�Ϸ�");
	    	 return;
	     }	
	     
	     //�������ִ�е�����Ļ���˵��a�����ǺϷ��ģ�����и�ֵ���㡣
	     age = a;
	}

	// getter
	public int getAge() {
		return age;
	}
}
