/*
   continue��䣺
      1.continue��ʾ������/go on/��һ��

	  2.continueҲ��һ��continue�ؼ��ּ�һ���ֺŹ���һ��������������Java��䣬��Ҫ
	  ����ѭ����䵱����������ѭ����ִ�С�

	  3.break��continue������
	      *break��ʾѭ����ִ����,����ѭ������ֹѭ��
		  *continue��ʾֱ�ӽ�����һ��ѭ������ִ��

	  4.continueҲ���������﷨��
	     continueѭ�����ƣ�����Ϊ��
*/
public class ContinueTest01
{
	public static void main(String[] args){
	
	     for (int i =0;i< 10 ;i++ )
	     {
			 if (i==5)
			 {
				 break;//1 2 3 4
			 }
			 System.out.println("i =" + i);
	     }

		 System.out.println("Hello World!");
	
	     for (int i =0;i< 10 ;i++ )
	     {
			 if (i==5)
			 {
				 continue;// 1 2 3 4 6 7 8 9 
			 }
			 System.out.println("i =" + i);
	     }

		   myFor:for (int i =0;i< 10 ;i++ )
	     {
			 if (i==5)
			 {
				 continue myFor;//  51 2 3 4 6 7 8 9 
			 }
			 System.out.println("i =" + i);
	     }


	}
}
     