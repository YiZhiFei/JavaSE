
/*
    forѭ��Ƕ��
*/
public class ForTest07
{
	public static void main(String[] args){
	    
		for (int i =0;i<10 ;i++ )
		{			
			//����Ĵ���Ƭ��ִ��10��
			for (int j=0;j<1 ;j++ )//ѭ��1�Σ����0
			{
				System.out.println("j -->" + j);
			}
			/*
			   �����Begin 0 Over(10��)
			*/

			for(int i=1;i<=5;i++){
			   
			   System.out.println("��ʼ");

			   for(int j=i;j <=5;j++){
                  
				   //System.out.pritnln(j);
				   System.out.println(i * j);
			   }

			   System.out.println("����");
			}
			/*
			 �������ʼ 1 2 3 4 5 ���� 
			       ��ʼ 2 4 6 8 10 ����
				   ��ʼ 3 6 9 12 15 ����
				   ��ʼ 4 8 12 16 20 ����
				   ��ʼ 5 10 15 20 25 ����
			    
		}
	}
}