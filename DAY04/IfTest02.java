
/*
   ����
        ����ϵͳ����һ���˵����䣬������Ҫ�Ӽ�������
		�����������ж�����˴����������ĸ��׶Σ����������[ 0-150 ]
		[0-5]    �׶�
		[6-10]   �ٶ�
		[11-18]  ������
		[19-35]  ����
		[36-55]  ����
		[56-150] ����
*/
public class IfTest02
{
	public static void main(String[] args){

  
	   //1.���ռ������룺���䡾�����ʱ������������֡�
	   java.util.Scanner s = new java.util.Scanner(System.in);

	   System.out.print("�������������䣺");
	   //System.out.println("�������������䣺")��//�������ỻ��
	   int age = s.nextInt();//����age�����Ա䡣
	   //ͣ�����ȴ��û������룬����֮���Զ����գ���ֵ��age������
	   //System.out.println( "age = "+ age );

       //2.�����������ҵ���߼��ж�
	   String str = "����";
	   if( age < 0 || age > 150 ){
	      str = "���ṩ�����䲻�Ϸ�������ֵ��Ҫ��[0-150]֮��";
	   }else if (age <= 5)
	   {
		   str = "�׶�";
	   }else if (age <= 10)
	   {
		   str = "�ٶ�";
	   }else if (age <= 18)
	   {
		   str = "������";
	   }else if (age <= 35)
	   {
		   str = "����";
	   }else if (age <= 55)
	   {
		   str = "����";
	   }
	   
	   System.out.println("�����������ڵģ�" + str + "�׶�");
	   //�ó�������150������bug�����Ҳ��ø�

	


/*
 �Լ���ĳ��������
  
		java.util.Scanner s = new java.util.Scanner (System.in);
		
		int num = s.nextInt();

		String age = ("����˴��������� ���� �׶�");
		if ( num < 0 || num > 150 )
		{
			age =("��������������ֲ��Ϸ�");
		}
		else if ( num <= 5 )
		{
           age = ("����˴��������� �׶� �׶�");
		}
		else if ( num <= 10 )
		{
			age = ("����˴��������� �ٶ� �׶�");
		}
		else if ( num <= 18 )
		{
			age = ("����˴��������� ������ �׶�");
		}
		else if ( num <= 35 )
		{
			age = ("����˴��������� ���� �׶�");
		}
		else if ( num <= 55 )
		{
			age = ("����˴��������� ���� �׶�");
		}
		else//����û�в�����䣡
		{
            age = ("����˴��������� ���� �׶�");
		}
		System.out.println( age );
*/

    }
}