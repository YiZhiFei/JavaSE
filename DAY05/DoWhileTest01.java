
/*
  do...whileѭ����
    1.do...whileѭ�����﷨�ṹ��
	   do{
	        ѭ����;
		}while(�������ʽ);


    2.do...whileѭ����ִ��ԭ��

	3.do...whileѭ����ִ�д�����

		 do...whileѭ����ѭ�������Ƭ��ִ�д����ǣ� 1-N�Ρ�����1�Ρ�

	4.do...whileѭ����ע�����

	     do...whileѭ�����������һ�����ֺš����ˡ�

*/
public class DoWhileTest01
{
	public class static void main(String[] args)
	{
		int i =10;
		do
		{
			System.out.println(i);
		}
		while (i > 100);

		System.out.println("-------------------------------------------------");

		while (i>100)
		{
			System.out.println("i-->" + i);
		}

		System.out.println("-------------------------------------------------");

		int i = 1;
		do
		{
			System.out.println(i);//1 2 3 4 5 6 7 8 9 10
			i++;
		}
		while (i <= 10);
	}
}