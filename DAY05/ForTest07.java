
/*
    for循环嵌套
*/
public class ForTest07
{
	public static void main(String[] args){
	    
		for (int i =0;i<10 ;i++ )
		{			
			//这里的代码片段执行10遍
			for (int j=0;j<1 ;j++ )//循环1次，输出0
			{
				System.out.println("j -->" + j);
			}
			/*
			   结果：Begin 0 Over(10个)
			*/

			for(int i=1;i<=5;i++){
			   
			   System.out.println("开始");

			   for(int j=i;j <=5;j++){
                  
				   //System.out.pritnln(j);
				   System.out.println(i * j);
			   }

			   System.out.println("结束");
			}
			/*
			 结果：开始 1 2 3 4 5 结束 
			       开始 2 4 6 8 10 结束
				   开始 3 6 9 12 15 结束
				   开始 4 8 12 16 20 结束
				   开始 5 10 15 20 25 结束
			    
		}
	}
}