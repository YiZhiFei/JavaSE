/*
     ����switch���
	     1.switchҲ������ѡ��ṹ��Ҳ�Ƿ�֧���
		 2.switch�����﷨�ṹ��
		      
			  һ���Ƚ�������switch���Ӧ��������д��

			  switch (int��String����)//����д��������ֵ
			  {
				  case int��String���͵�����ֵ����� ��
				     java���;
					 ...
					 break;//���breakûд������ƥ�����ֱ�ӽ�����һ����ִ֧��
					 //�������󱻳�Ϊcase��͸����
				  case int��String���͵�����ֵ����� ��
				     java���;
					 ...
					 break;
				  case int��String���͵�����ֵ����� ��
				     java���;
					 ...
					 break;
					...
					default :
					    java���;
						...
			  }
	 3.switch����ִ��ԭ��
	    switch����С���ŵ��еġ����ݡ���case����ġ����ݡ�����һһƥ�䣬ƥ��ɹ��ķ�ִ֧�С�
		�������϶��µ�˳������ƥ�䡣

     4.ƥ��ɹ��ķ�ִ֧�У���֧���������"break;"���Ļ�������switch�����ֹ

	 5.ƥ��ɹ��ķ�ִ֧�У���֧����û��"break;"���Ļ���ֱ�ӽ�����һ����ִ֧�У�������ƥ�䣩��
	 �������󱻳�Ϊcase��͸���󡣡��ṩbreak;�����Ա��⴩͸��

	 6.���з�֧��û��ƥ��ɹ�������default����仰����ִ��default��֧���еĳ���

	 7.switch�����case����ֻ����int����String���͵����ݣ��������������͡�

	      *��Ȼbyte,short,charҲ����ֱ��д��switch��case���棬��Ϊ���ǿ��Խ����Զ�����ת����
		  byte,short.char�����Զ�ת����int����

		  *JDK6�ģ�switch��case����ֻ��̽��int���͡�
     
	 8.case���Ժϲ���
	     int i = 10;
		 switch(i){
		      case 1:case2 :case3:
			     System.out.println("Test code!");
		 }
*/
public class SwitchTest01
{
	public static void main(String[] args){
	
	/*
	long a = 10L;
	int b = a;//���뱨��

	long a = 100L;
	switch(x){}//���뱨��
	*/

	//����������
	long x = 100L;
	switch((int)x){}

	byte b =10;
	switch(b){}

	//short s = 10;
	//switch(s){}

	char cc = 97;
	switch(cc){}

//	switch(true){}//���

/* ��дһ��������switch���
�����û��ڿ���̨�������ֵó���Ӧ�����ڡ�
����1 ����һ
����2 ���ڶ�
...
����7 ������
*/
     java.util.Scanner s =  new java.util.Scanner(System.in);

	 System.out.print("��������һ�����֣�");
    
	 int num = s.nextInt();

	 switch (num)
	 {
	 case 1:
		 System.out.println("����һ");
	 break;
	 case 2:
		 System.out.println("���ڶ�");
	 break;
	 case 3:
		 System.out.println("������");
	 break;
	 case 4:
		 System.out.println("������");
	 break;
	 case 5:
		 System.out.println("������");
	 break;
	 case 6:
		 System.out.println("������");
	 break;
	 case 7:
		 System.out.println("������");
	 break;
	 default :
		 System.out.println("����������ֲ��Ϸ�");
	 
	 }
	 System.out.println("-----------------------------------------");
	 
	 //case��͸
	 
	 switch (num)
	 {
	 case 1:
		 System.out.println("����һ");
	
	 case 2:
		 System.out.println("���ڶ�");
	 
	 case 3:
		 System.out.println("������");
	 default :
		 System.out.println("ʲô��û");
	 }
	 System.out.println("========================================");
	 
	
	 //case�ϲ�
	 
	 switch (num)
	 {
	 case 1: case 0:
		 System.out.println("����һ");
	 break;
	 case 2:
		 System.out.println("���ڶ�");
	 break;
	 case 3:
		 System.out.println("������");
	 }



	
	
	}
}