/*
   ����java������䵱�е�break��䣺

     1.break��Java���Ե��еĹؼ��֣�������Ϊ���ж�/�۶ϡ�

	 2.break + ";" ���Գ�Ϊһ��������������java��䣺 break;
	
	 3.break���ʹ����switch��䵱�У�������ֹswitch�����ִ�С�

	 4.break���ͬ������ʹ����ѭ����䵱�У�������ֹѭ����ִ��

	 5.break��ֹ�ĸ�ѭ���أ�

	 6.break;���ʹ����for,while,do...whileѭ����䵱����������ѭ������ֹѭ����ִ�С�
	 ��Ϊ������ѭ����ĳ��������ʱ�򣬺�����ѭ��û��Ҫִ���ˣ���ִ��Ҳ�Ǻķ���Դ������
	 ������ֹѭ��������������߳����ִ��Ч�ʡ�

	 7.������forѭ��Ϊ������break;��䡣
	 
	 8.��Ĭ������£�break�����ֹ�������������ѭ�����

	 9.����ָ����ֹĳ��ѭ��
*/

public class BreakTest01
{
	public static void main(String[] args){

		for(int i=0;i<10;i++){
		   if(i == 5){
		       break;//��ֹ����forѭ�����
		   }
		   System.out.println("i-->" + i);
		}
		System.out.println("Hello World!");//��ѭ���޹�
        
		for(int j=0;j<3;j++){
             for(int i=0;i<10;i++){
		         if(i == 5){
		         break;//��ֹ����forѭ�����
		        }
		   System.out.println("i-->" + i);
		}
		}
		System.out.println("--------------------------------------------------")
		//�����﷨�õĽ���	
		//��forѭ������for1
		 for1:for (int j=0;j<3 ;j++ )
		 {
			 for2:for(int i=0;i<10;i++){
			     break for1;//��ֹfor1ѭ��
			 }
			 System.out.println(" i--> " + i );
		 }
	}
}