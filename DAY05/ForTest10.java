/*
   �����棺
           ��дforѭ���ҳ�1~10000�����е�����
		   Ҫ��ÿ8����һ�����
*/
public class ForTest10
{
	public static void main(String[] args){
		int count =0;	   
		for (int i = 2;i <= 10000 ;i ++ )
	    {
			boolean zhishu = true;
			for (int j = 2;j < i-1 ;j ++ )
			{
				if (i%j == 0)
				{
					 zhishu = false;//��������
				}
			}
			    if (zhishu)//ɸѡ����
			  {
				System.out.print(i + " ");//�������
			    count++;
			        if(count%8==0){
			            System.out.println();
			       }
			  }	
		}
		   
	
	//ÿ8��һ�飺Ҫ��Ӱ����������������������Ҫ���ڲ㣩��ֻ�����У��������8�Σ�������һ�С�
						
	    }
	}