/*
   ��ϵ�����
      >      ����
	  <      С��
	  >=     ���ڵ���
	  <=     С�ڵ���
	  ==     ����
	  !=     ������

	  = �Ǹ�ֵ�����
	  == �ǹ�ϵ�����

	  ��ϵ�������������һ���ǲ������ͣ�true/false

	  ��ϵ�����������ԭ��
	         int a = 10;
			 int b = 10;
			 a > b �Ƚϵ�ʱ�򣬱Ƚϵ���a�б����10���ֵ��b�б����10���ֵ֮��Ĵ�С�Ƚϡ�
			 a == bҲ����ˡ�
*/
public class OperatorTest02
{
	public static void main(String[] args){
	    
		 int a = 10;
		 int b = 10;

		 System.out.println(a > b);//false
		 System.out.println(a >= b);//true
		 System.out.println(a < b);//false
		 System.out.println(a <= b);//true
		 System.out.println(a == b);//true
		 System.out.println(a != b);//false

  }
}
