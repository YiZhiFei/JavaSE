/*
  ����
       �жϵ�ǰ������
	       ����������ʱ��
		         ����ɡ��
				     �ж��Ա�
					     ���Ա�Ϊ�У���һ�Ѵ��ɡ
						 ���Ա�ΪŮ����һ��С��ɡ

		   ����������ʱ��
		         �ж��������¶ȣ�
				     �������¶���30�����ϣ�
					     ���Ա�Ϊ�У���ī��
						 ���Ա�ΪŮ������ɹ˪

    ��ʾ��
	     1.һ�����õ�Ƕ��
		 2.����״�����¶ȡ��Ա���Ҫ�Ӽ�������
		   ����״����1.��ʾ����2.��ʾ����
		   �¶�ֱ��ʹ�����־ͺ�
		   �Ա�1.��ʾ�� 2.��ʾŮ
*/
public class IfTest03
{
	 public static void main(String[] args){

		 System.out.println("��ӭʹ�ñ�ϵͳ����ͨ����ϵͳ�������һЩ�򵥵��ж�");
		 System.out.println("˵��1��1��ʾ���꣬ 0��ʾ����");
		 System.out.println("˵��2��1��ʾ�� 0��ʾŮ");
		 System.out.println("˵��3���¶�Ϊ����");		 

		 java.util.Scanner s = new java.util.Scanner(System.in);

		 System.out.print("�����뵱ǰ������");
		 
		 int weather = s.nextInt();
         
		 //�ж�����״��
		 if (weather == 1)//������
		 {
			// System.out.println("������");
			System.out.print("���������Ա�:");
			int sex = s.nextInt();			
			if (sex == 0)
			{
				System.out.println("��һ��С��ɡ");
			}else if (sex == 1)
			{
				System.out.println("��һ�Ѵ��ɡ");
			}else 
			{
				System.out.println("��������Ա�զ���£�");
			}


			//�����û����룬�����Ա�
		 }else if (weather == 0)//����
		 {
			// System.out.println("����");
			 System.out.print("�����������£�");
			 int tem = s.nextInt();
			if (tem >45 || tem < -45)
			{
				System.out.print("��������������ֲ��Ϸ�");
			}else 
			{
				   if (tem > 30)
			    {
				   System.out.print("���������Ա�:");
				   int sex = s.nextInt();
				   if (sex == 0)
				   {
					   System.out.println("����ɹ˪");
				   }else if (sex == 1)
				   {
					   System.out.println("��ī��");
				   }else
				   {
					   System.out.println("��������Ա���ɶ");
				   }
			   }else 
				   {
					   System.out.println("ɶҲ���ø�");
				   }

			 } 
		 }
	 }
}