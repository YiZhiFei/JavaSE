
/*
    ��������/Overload:
	    1.ʲôʱ����ʹ�÷������أ�
		     * �������Ƶ�ʱ�򣬾������÷�������ͬ

			 �����ǣ����ܲ�ͬ/�����Ƶ�ʱ�򣬾������÷�������ͬ����

		2.ʲô��������֮�󹹳��˷������أ�
		     * ��ͬһ���൱��
			 * ��������ͬ
			 * �����б�ͬ��
			    - ������ͬ
				- ˳��ͬ
				- ���Ͳ�ͬ

		3.�������غ�ʲô�й�ϵ����ʲôû�й�ϵ��
		     * �������غͷ�����+�����б��й�ϵ
			 * �������غͷ���ֵ�����޹�
			 * �������غ����η��б��޹�
*/
public class OverloadTest03
{
	public static void main(String[] args){
	
	     m1();
		 m1(10);

		 m2(1,2.0);
		 m2(2.0,1);

		 m3(10);
		 m3(2.0);

	}
	//��������������������
	public static void m(){}
	public static void m(int a){}

	//��������������������
	public static void m2(int a,double b){}
	public static void m2(double a,int b){}

	//��������������������
	public static void m3(int x){}
	public static void m3(double x){}

	//public static void x(){}
	//public static int x(){}

	//void y(){}
	//public static void y(){}
	
	}
}