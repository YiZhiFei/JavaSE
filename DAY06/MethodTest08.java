
/*
   �����ķ���ֵ���Ͳ���void��ʱ��

     1.����ֵ���Ͳ���void��ʱ��
	     Ҫ�󷽷����뱣֤�ٷְٵ�ִ�С�return ֵ;������������ֵ�ķ��ء�
	     û�������䣬�������ᱨ��

	 2.һ�������з���ֵ��ʱ�򣬵����ǵ������������ʱ�򣬷���������һ��ֵ��
	   ���ڵ�������˵���������ֵ����ѡ����գ�Ҳ����ѡ�񲻽��ܡ�
	   ���Ǵ󲿷���������Ƕ���ѡ����ܵġ�
*/
public class MethodTest08
{
	public static void main(String[] args){
		//���÷���
		//divide(10,3);//����û�н�����������ķ�������

		//�������һ�·���ִ�н���֮��ķ���ֵ
		//���ñ�������
		//����������������Ҫ�ͷ���ֵ������������ͬ�����߿����Զ�����ת����
		//boolean b = divide(10,3);
		
		//��ֵ��������ұ���ִ�У���ִ�н����ֵ��ߵı���
		int i = divide(10,3);
		System.out.println(i);

		long x = divide(10,3);
		System.out.println(x);
		//Ҳ����System.out.println(divide(10,3))
	
	}
	/*
	  ����
	       �붨�岢ʵ��һ���������÷������Լ�������int�������ݵ���
		   Ҫ�����յļ���ṹ���ظ�������
	*/

	//���뱨��ȱ�ٷ������
	//public static int divide(int a,int b){}
	
	
	//���뱨��ȱ�ٷ���ֵ
	/*public static int divide(int a,int b){
	      return;
		  }*/

	//����ֵ���Ͳ�����Ҳ����~

	//���ԣ����Ǿ���ķ������б�д�Ĵ����޷����㵱ǰ������
	/*
	 public static int divide(int a,int b){
	    return 1;
	 }
	 */

	/*
	public static int divide(int a,int b){
	     int c =a/b;
		 return c;
	 }
	*/
	
	public static int divide(int a,int b){
	     return  a/b ;
	 }
}