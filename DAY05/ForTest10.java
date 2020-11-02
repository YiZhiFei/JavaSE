/*
   升级版：
           编写for循环找出1~10000中所有的素数
		   要求每8个换一行输出
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
					 zhishu = false;//定义质数
				}
			}
			    if (zhishu)//筛选质数
			  {
				System.out.print(i + " ");//输出质数
			    count++;
			        if(count%8==0){
			            System.out.println();
			       }
			  }	
		}
		   
	
	//每8个一组：要求不影响质数输出（所以质数输出要在内层），只增加行，质数输出8次，则增加一行。
						
	    }
	}