/*
   �������³���������
   main begin
   m1 begin
   m2 begin
   m3 begin
   m3 over
   m2 over
   m1 over
   main over

   ���ڵ�ǰ�ĳ�����˵��
       * main�������ȱ����ã�main����Ҳ�����һ��������
       * �����õķ�����m3�������÷������Ƚ�����

    main��������֮��������������ˡ���仰ֻ�ʺ��ڵ�ǰ�������ݡ���

	���ÿ���ȥ���䣺
	   ֻҪ��ס�����еĴ��������϶��µ�˳������ִ�еļ��ɡ�
	   ��ǰ�еĳ�����û�н�����ʱ����һ�д������޷�ִ�еġ�
*/
public class MethodTest07
{
	public static void main(String[] args){
	    System.out.println("main begin");
		m1();
		System.out.println("main over");
	}
	public static void m1(){
	   System.out.println("m1 begin");
	   m2();
	   System.out.println("m1 over");
	}

	public static void m2(){
	   System.out.println("m2 begin");
       m3();
	   System.out.println("m2 over");
	}
	public static void m3(){
	   System.out.println("m3 begin");
	   System.out.println("m3 over");
	}
}