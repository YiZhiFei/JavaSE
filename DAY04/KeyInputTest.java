
/*
   System.out.println(); ���������̨��������ڴ浽����̨������Ĺ��̣����Ǵ��ڴ��г����ˡ�
   
   �����û��������룬�ӡ����̡������ڴ桱��������Ĺ��̣����ڴ���ȥ��

   ���´����Ȳ�Ҫ��Ϊʲô���̶���д�Ϳ��Խ����û����̵����롣

*/

public class KeyInputTest
{
	public static void main(String[] args){

		//��һ������������ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);
		
		//�ڶ���������Scanner�����next()������ʼ�����û���������
		//����ִ�е������ͣ�������ȴ��û������롣
		//���û������ʱ�򣬲��������ûس�����ʱ�򣬼������Ϣ���Զ���ֵ��userInputContent
		//�����ı������ַ�������ʽ���ա�
		//String userInputContent = s.next();//��ʶ���������淶������֪��

		//�������֡���������int����ʽ�����ա�
		int num = s.nextInt();

		//���ڴ��е��������������̨
		//System.out.println("�������ˣ�" + userInputContent);

		System.out.println("������������ǣ� " + num);
		System.out.println("������������ǣ� " + (num + 100));//���Լ���
	}
}
/*
   �ܽ᣺��ס���룬����ֱ�ӽ����븴��ճ����
   
   java.util.Scanner s = new java.util.Scanner(System.in);
  
   String str = s.next();//�ַ���
   
   ��
   
   int num = s.nextInt();//����
*/

