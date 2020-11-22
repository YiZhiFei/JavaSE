package com.njxxyizhifei.javase.day10.test013;
/**
 * �ع�java���Ե��з��������أ�
 *     1.���������ֳ�ΪOverload
 *     2.��������ʲôʱ��ʹ�ã�
 *        ��ͬһ���൱�У�������ɵĹ��������Ƶģ����鷽������ͬ�������������Ա�ĳ���
 *        �������һ�������Ƶġ��������ۡ�
 *        
 *     3.ʲô��������֮�󹹳ɷ������أ�
 *        * ��ͬһ���൱��
 *        * ��������ͬ
 *        * �����б���ͬ�����͡�˳�򡢸���
 *        
 *     4.�������غ�ʲô�޹أ�
 *        * �ͷ����ķ���ֵ�����޹�
 *        * �ͷ��������η��б��޹�
 *        
 * ����java���Ե��з����ĸ��ǣ�
 *   1.���������ֱ���Ϊ������д��Ӣ�ﵥ��Override[�ٷ�]/overwrite
 *   
 *   2.ʲôʱ��ʹ�÷�����д��
 *       �������еķ����Ѿ��޷����㵱ǰ�����ҵ������
 *       �����б�Ҫ�������м̳й����ķ����������±�д��
 *       ������±�д�Ĺ��̳�Ϊ��������/��������
 *       
 *   3.ʲô��������֮�󷽷��ᷢ����д�أ�����������ʲô����֮�󣬾͹��ɷ����ĸ����أ���
 *       * ������д�����ھ��м̳й�ϵ���൱��
 *       * ������ֵ������ͬ����������ͬ���β��б���ͬ
 *       * ����Ȩ�޲��ܸ��ͣ�ֻ�ܸ��ߣ�public ���ܱ�Ϊ private��
 *       * �׳��쳣���ܸ��ֻ࣬�ܸ��١��Ժ󽲡�
 *       
 *   4.������дʱ�ø���ճ������Ҫ��д�����׳���������û�в������ǡ�
 *   
 *   5.ע�⣺
 *       ˽�з������ܼ̳У����Բ��ܸ��ǡ�
 *       ���췽�����ܼ̳У����Բ��ܸ��ǡ�
 *       ��̬���������ڸ��ǡ��������̬֮����͡�
 *       ����ֻ��Է�������̸���ԡ�
 *
 */
public class OverrideTest01 {

	public static void main(String[] args) {
		
	//�����������
	Animal a = new Animal();
	a.move();
	
	//����è���ද�����
	Cat c = new Cat();
	c.move();
	
	//���������ද�����
	Bird b = new Bird();
	b.move();
	
	Parrot p = new Parrot();
	p.move();
  }
}