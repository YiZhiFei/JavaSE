/*
   ���ڰ��ֻ����������͵�Ĭ��ֵ
    ��������             Ĭ��ֵ
---------------------------------------
	 byte,short,int,long   0
	 float,double          0.0
	 boolean               false����c�����У�true��1��false��0��
	 char                  \u0000

 ���ֻ����������͵�Ĭ��ֵ��һ����0���롣

*/
public class DataTypeTest02
{
	//����static�����,�ȱ���Ϊɶ��
	static int k = 1000;

	//��Ա����û���ֶ���ֵ��ϵͳ��Ĭ�ϸ�ֵ���ֲ��������ᣬҪ�ȸ�ֵ�����ܷ���
	static int f;//��Ա����

	public static void main(String[] args){
	      /*
		  int i;//�ֲ�����
		  System.out.println(i);
		  */

		  System.out.println(k);

		  System.out.println(f);//���Ϊ0����Ĭ��ֵ
	}
}