/*
   ��дforѭ���ҳ�1~100�����е�����
*/
public class ForTest09
{
	public static void main(String[] args){
		
		for (int i = 2;i <= 100 ;i++ )
		{
			boolean zhishu = true;
			for (int j = 2;j < i-1 ;j++ )
			{
				if(i%j == 0)
				{
                    zhishu = false;
				}				
				//System.out.print(i + "/" + j + "=" + i/j + " ");
			}
			if (zhishu)
				{
					System.out.println(i);
				}
		}
	
	   
	}
}


