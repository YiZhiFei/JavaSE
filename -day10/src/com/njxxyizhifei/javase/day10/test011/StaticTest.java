package com.njxxyizhifei.javase.day10.test011;
/**
 * ����ʲôʱ����Ϊ��̬�ģ�
 *   �����������Ƕ����������еĶ���ִ�����������ʱ�����ղ���Ӱ����һ���ģ���ô
 *   ��������Ѿ���������ĳһ���������ˣ����Խ������������Ϊ�༶��Ķ�����ģ��
 *   ����Ķ�����
 *   
 * ��̬�������޷�ֱ�ӷ���ʵ��������ʵ��������
 *
 * ���������������Ϊʵ��������һ��һ����Ϊ����һ�������ڷ�����ʱ�򣬶���Ҫ����Ĳ��롣
 * ����Ҳ�����⣬���磺������������ࡱ�еķ������Ǿ�̬��������Ϊ��������Ƿ����̣�Ϊ��
 * ���㷽���ĵ��ã���Ȼ����Ҫnew��������õġ�
 */
public class StaticTest {
	
	//ʵ������
	int i = 100;
	
	//ʵ������
	public void doSome(){
		
	}
	//��̬��������̬�����ġ�
	public static void main(String[] args) {
		//System.out.println(i);
		//doSome();
		
		StaticTest st = new StaticTest();
		System.out.println(st.i);
		st.doSome();
		
		//ʹ����ѧ������
		System.out.println(MathUtil.sumInt(10, 20));
		System.out.println(MathUtil.devide(40, 20));
		
	}

}
/*
 �ܽ᣺
  class��{
       ��̬�����;
       ʵ�������;
       
       ��̬����
       ʵ������
       
       ���췽��
       
       ��̬����
       ʵ������
}     
*/
