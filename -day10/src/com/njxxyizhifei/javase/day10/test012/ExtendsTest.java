package com.njxxyizhifei.javase.day10.test012;

public class ExtendsTest {
/**
 * ����java���Ե��еļ̳�
 *    1.�̳������������������֮һ�����������ֱ��ǣ���װ���̳С���̬
 *    2.�̳С��������������ǣ�����ĸ��ã����Ǽ̳�����Ҫ�������ǣ����˼̳в������Ժ󡰷����ĸ��ǡ��͡���̬���ơ���
 *    3.�̳е��﷨��ʽ
 *      [���η��б�]class ���� extends ������{
 *          ���� = ���� + ����
 *      }
 *    4.java���Ե��еļ̳�ֻ֧�ֵ��̳У�һ���಻��ͬʱ�̳кܶ��ֻ࣬�ܼ̳�һ���ࡣ��C++��֧�ֶ�̳С�
 *    5.���ڼ̳��е�һЩ���
 *       B��̳�A�࣬���У�
 *            A���Ϊ�����ࡢ���ࡢ���ࡢsuperclass
 *            B���Ϊ�����ࡢ�����ࡢsubclass
 *    6.��java���Ե�������̳и��඼�̳���Щ�����أ�
 *       - ˽�еĲ�֧�ּ̳�
 *       - ���췽����֧�ּ̳�
 *       - �������ݶ����Լ̳�
 *    7.��Ȼjava���Ե���ֻ֧�ֵ��̳У�����һ����Ҳ���Լ�Ӽ̳������࣬���磺
 *      C extends B{
 *      }
 *      B extends A{
 *      }
 *      A extends T{
 *      }
 *      Cֱ�Ӽ̳�B�࣬����C���Ӽ̳�T��A�ࡣ
 *    8.java�����м���һ����û����ʾ�ļ̳��κ��࣬����Ĭ�ϼ̳�JavaSE�⵱���ṩ��java��lang��Object�ࡣ
 *    java�������κ�һ�����Զ���Object����
 */
	//Myeclipse��ݼ����������͡�open type�� -->ctrl + shift + t 
	//                      ��open resource��  ctrl + shift + r
	public static void main(String[] args) {
		ExtendsTest et = new ExtendsTest();
		String s  = et.toString();//�������ͨ���ˣ���˵�����Ե���toString������EctendsTest������toString��������Object���м̳й����ġ�
		System.out.println(s);//����ˣ�com.njxxyizhifei.javase.day10.test012.ExtendsTest@15db9742
		
		CreditAccount act = new CreditAccount();
		act.setNo("act-001");
		act.setBalance(-1000.0);
		act.setCredit(0.99);
	}

}