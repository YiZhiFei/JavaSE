
//ע�⣺��Editplus���У�������ɫΪ��ɫ�ı�ʾһ��������֣������������JavaSE������Դ��ġ�
//�����Զ������MethodTesst01,������ɫ�Ǻ�ɫ���Ǳ�ʶ����
//��ʵJavaSE������Դ����࣬���磺String.class,System.class����Щ�������Ҳ�Ǳ�ʶ����
//ֻҪ��������һ���Ǳ�ʶ����

//�ص㣺�������õ�ʱ���ڲ������ݵ�ʱ��ʵ���ϴ��ݵ��Ǳ����б�����Ǹ�ֵ��
public class MethodTest01
{
	public static void main(String[] args){
	    
		 int a = 10;
		 int b = 20;

		 int retValue = sumInt(a,b);

		 System.out.println("retValue = "+ retValue);

	}

	public static int sumInt(int i,int j){
	     int result = i + j;
		 int num = 3;
		 divide(result,num);
		 return retValue;
	}

	public static int divide(int x,int y){
	      int z = x/y;
		  return z;
	}
}
/*
    ��ͼ���ݣ�
	     1. ֻҪ�漰���������ݵ����⣬���ݵ��Ǳ����б����ֵ
		 2. ��ͼ��ʱ�򣬱�����ѭ���������϶��µ�˳������ִ�С����ԭ��
*/