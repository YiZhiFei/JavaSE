/*
   �����߼���������������������
      &      �߼��롾���ҡ������ߵ����Ӷ���true,�������true��
	  |      �߼��򡾻��ߡ������ߵ�����ֻҪ��һ����true���������true��
	  !      �߼��ǣ�ȡ������false����true,!true����false������һ����Ŀ�������
	  ^      �߼�������ߵ�����ֻҪ��һ��,�������true��

	  &&     ��·��
	  ||     ��·��

  1.�߼������Ҫ�����ߵ����Ӷ��ǲ������ͣ������߼���������յ�������Ҳ��һ���������͡�
  2.��·����߼������յ�����������ͬ�ģ�ֻ������·����ڶ�·����
  3.��·����߼������յ�����������ͬ�ģ�ֻ������·����ڶ�·����
  4.ʲô����·�����·�����أ�
  5.ʲôʱ��ѡ��ʹ���߼����������ʲôʱ��ѡ��ʹ�ö�·���������

*/
public class OpreratorTest03
{
	public static void main(String[] args){
	
	      System.out.println(5 > 3 & 5 > 2);//true
		  System.out.println(5 > 3 & 5 > 6 );//false
		  System.out.println(5 > 3 | 5 > 6 );//true

		  System.out.println(true & true);//true
		  System.out.println(true & false);//false
		  System.out.println(false & true); //false
		  System.out.println(false & false);//false
		  
		  
		  System.out.println(true | false);//true
		  System.out.println(false | false);//false

		  System.out.println(!false);//true
		  System.out.println(!true);//false

		  System.out.println(true ^ false);//true
		  System.out.println(false ^ false);//false
		  System.out.println(true ^ true);//false

		  /*
		  //�߼���Ͷ�·��
		  int x = 10;
		  int y = 8;
  
	      //�߼���
		   System.out.println(x < y & ++x < y );
		  System.out.println(x);//11 ˵��ִ����������ı��ʽ
		  */

		  //�߼���Ͷ�·��
		  int x = 10;
		  int y = 8;
		 
		  //��·��
		  System.out.println(x < y && ++x < y );
		  System.out.println(x);//10 ˵��û��ִ����������ı��ʽ
		  //��������ж�·����

		  //��ĳ���Ƕȿ���·������ܡ����ں���ı��ʽ���ܲ�ִ��
		  //����ִ��Ч�ʽϸߡ����ַ�ʽ��ʵ�ʵĿ�����ʹ�ý϶ࡣ��·����߼���
		  //ʹ�õĶ࣬��·�������

		  //���ǣ���ĳЩi�����ҵ���߼����У�Ҫ����������ߵ����ӱ���ȫ��ִ��
		  //��ʱ����ʹ���߼��룬����ʹ�ö�·�룬 ʹ�ö�·����ܵ����ұߵı��ʽ��ִ�С�
		 

		 /*
            ʲô����·�����·��
			   * ��һ�����ʽִ�н����true���ᷢ����·��

			ʲô����·�����·�룿
			   * ��һ�����ʽִ�н����false���ᷢ����·�롣
		 */

     


	}
}