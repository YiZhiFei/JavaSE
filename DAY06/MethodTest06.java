/*
  ��������
       1.���������η��б�����static�ؼ��֣������ĵ��÷�ʽ�ǣ�����.��������ʵ���б�;
	   2.���ǣ��е�ʱ������.������ʡ�ԣ�ʲô����¿���ʡ���أ�

  ʵ�ʿ�����һ��Java�ļ���дһ��class����Ҫ������class
*/
public class MethodTest06
{
	public static void main(String[] args){
	
	//���÷���
	MethodTest06.m();

	//���ڷ��������η��б�����static�ؼ��ֵģ�"����."����ʡ�Բ�д��
	m();

	//���������ࡾ���Ǳ����еġ��еķ���
	A.doOther();

	//ʡ�ԡ�����.������
	//doOther();��ǰ�����Ҳ��������뱨��

	}
	public static void m(){
	    System.out.println("m method execute!")

			//�����ı�д��ʽ
			MethodTest06.m2();

			//ʡ�Եķ�ʽ
			m2();

			//������õ�ǰ���൱�е�m2���������ʱ��ͱ�����ӡ���������
			A.m2();

	}

	public static void m2(){
	    System.out.println("m2 ececute!");
	}
}
class A
{
	public static void doOther(){
	     System.out.println("A's doOther method invoke!");
	}
	public static void m2(){
	   System.out.println("A's m2 method execute!")
	}
}