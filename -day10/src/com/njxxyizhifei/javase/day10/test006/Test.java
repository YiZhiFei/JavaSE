package com.njxxyizhifei.javase.day10.test006;

public class Test {


		
		//����static�ķ���
		public static void method1(){
			//����doSome
			//ʹ��������ʽ����
			//ʹ��ʡ�Է�ʽ����
			Test.doSome();//��������
			doSome();//ʡ�Ե���
			
			//����doOther
			//ʹ��������ʽ����
			//ʹ��ʡ�Է�ʽ���ã�û�У���
           Test tt = new Test();
           tt.doOther();//��������
           			
			//����i
			//ʹ��������ʽ����
			//ʹ��ʡ�Է�ʽ����(û�У�)
             System.out.println(tt.i);
			
		}
		
		//û��static�ķ���
		public void method2(){
			//����doSome
			//ʹ��������ʽ����
			//ʹ��ʡ�Է�ʽ����
			Test.doSome();//��������
			//doSome();//ʡ�Ե���?���ʣ�������ô������
			
			//����doOther
			//ʹ��������ʽ����
			//ʹ��ʡ�Է�ʽ����(û�У�)
			this.doOther();
			doOther();
			
			//����i
			//ʹ��������ʽ����
			//ʹ��ʡ�Է�ʽ����
	        System.out.println(this.i);
	        System.out.println(i);
			
		}

		//������
		public static void main(String[] args) {
			//Ҫ���������д�������method1
			//ʹ��������ʽ����
			//ʹ��ʡ�Է�ʽ����
			Test.method1();
			method1();
			
			//Ҫ���������д�������method2
			//ʹ��������ʽ����
			//ʹ��ʡ�Է�ʽ����(û�У�)
			Test t = new Test();
			t.method2();
		}
		
		//û��static�ı���
		int i = 10;
		
		//����static�ķ���
		public static void doSome(){
			System.out.println("do Some!");
		}
		
		//û��static�ķ���
		public void doOther(){
			System.out.println("do Other!");
		}

	}

