package com.njxxyizhifei.javase.day10.test003;
/**
 * ���ս��ۣ�
 *     �ڴ���static�ķ������в��ܡ�ֱ�ӡ�����ʵ��������ʵ��������
 *     ��Ϊʵ��������ʵ����������Ҫ����Ĵ��ڡ�
 *     ��static�ķ���������û��this�ġ�Ҳ����˵��ǰ�����ǲ����ڵġ�
 *     ��ȻҲ���޷����ʵ�ǰ�����ʵ��������ʵ��������
 *
 */
public class ThisTest {

    //����static
	//������
	public static void main(String[] args) {
		//����doSome
		ThisTest.doSome();
		
		//����doSome
	    doSome();
	    
	    //����doOther����
	    //���������
	    //ThisTest.doOther();//ʵ�����������ȴ�������ͨ������.�ķ�ʽ����
	    
	    //doOther��ʵ������
	    //ʵ���������ñ����ж���Ĵ���
	    //���´����ʾ�ĺ��壺���õ�ǰ�����doOther����
	    //��������main������û��this,�������·������ܵ��á�
	    //�������doOther();/this.doOther();
	    
	    ThisTest tt = new ThisTest();
	    tt.doOther();
	    
	    tt.run();
	
	}
	
	//����static
	public static void doSome(){
		System.out.println("do Some!");
	}
	
	public void doOther(){
		//this��ʾ��ǰ����
		System.out.println("do other!");
	}
	
	//run��ʵ������������run����һ�����ж�����ڵġ�
	//һ�����ȴ�����һ��������ܵ���run����
	public void run(){
		
		//�ڴ������еĴ���ִ�й��̵���һ���Ǵ��ڡ���ǰ���󡱵ġ�
		//Ҳ����˵����һ�����С�this���ġ�
		System.out.println("run execute!");
		
		//doOther��һ��ʵ��������ʵ���������ñ����ж���Ĵ���
		//���´����ʾ�ĺ�����ǣ����õ�ǰ�����doOther����
		doOther();//this.�󲿷�����¶��ǿ���ʡ�Ե�
		//this.doOther();//�Ƚ�������д��
	}

}
