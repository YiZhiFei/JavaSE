
/*
  ���ڷ����ĵݹ����
      1. ʲô�ǵݹ飿
	         ���������������
			 a(){
			   a();
			 }
	  2. �ݹ��㷨�Ǻܺķ��ڴ�ģ����Բ��þͲ��á�

	  3.���³������е�ʱ������������һ�����󡾲����쳣���Ǵ���error��:
	     java.lang.StackOverflowError
		 ջ�ڴ��������
		 �������޷���أ�ֻ��һ���������JVMֹͣ������

	  4. �ݹ�����н���������û�н��������ػᷢ��ջ�ڴ��������

	  5.�ݹ鼴ʹ���˽�����������ʹ������������ȷ�ģ�Ҳ�п��ܷ���ջ�ڴ��������

	  ע�⣺
	     �ݹ���Բ����þ������á�
		 ������Щ����¸ù��ܵ�ʵ�ֱ��������ݹ顣���磺Ŀ¼������
*/
public class RecursionTest01
{
	//������
	public static void main(String[] args){

		  System.out.println("main begin");
	      
            //����doSome����
			doSome()

		  System.out.println("main over");

	}

	//���µĴ���Ƭ����Ȼֻ��һ��
	//���ǿ��Ա��ظ����ã�����ֻҪ����doSome�����ͻ���ջ�ڴ����·���һ���������ڴ�ռ䡣
	public static void doSome(){
	      System.out.println("doSome begin");
		  doSome();//���д��벻��������һ�г����ǲ���ִ�еġ�
		  System.out.println("doSome over")
	}
}