/*
   ������Ԫ���������Ŀ�����/�����������
         1.�﷨����
		     �������ʽ ? ���ʽ1 : ���ʽ2
		
		 2.��Ԫ�������ִ��ԭ��
		     ���������ʽ�Ľ����true��ʱ��ѡ����ʽ1��Ϊ�������ʽ��ִ�н��
			 ���������ʽ�Ľ����false��ʱ��ѡ����ʽ2��Ϊ�������ʽ��ִ�н��


*/

public class OperatorTest06
{
	public static void main(String[] args){
	    
         //����һ��������Java���
		 //10;

		 //����һ��������Java���
		 //'��';

		 //�������ͱ���
		 boolean sex = false;
		 
		 //�������³����Ƿ���Ա���ͨ����
		 //��Ҳ����һ��������Java���
  		 //sex ? '��' : 'Ů';

		 char c = sex ? '��' : 'Ů';
		 System.out.println(c);

		 sex = true;
		 char c = sex ? '��' : 'Ů';
		 System.out.println(c);

		 //�﷨���󣬱��뱨�����������string,Ҳ������char������ǰ�߲�����char���������ݡ�
         //���Ͳ�����
         //char c1 = sex ?"��" ��'Ů'

		 //����������Ͳ�����
		 /*
		 sex = false;
		 char c1 = sex ? "��" ��'Ů';
		 */

		 System.out.println(10);
		 System.out.println("10");
		 System.out.println('10');

		 //���ԣ���������мȿ������ַ���Ҳ�������ַ�
		 System.out.println(sex ? "��" :'Ů');
	}
}