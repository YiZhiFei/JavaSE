/*
    在前一个程序的基础之上，计算1~100所有奇数的和

*/
public class ForTest05
{
	public static void main(String[] args){
	   
	   int sum = 0;//从一开始才为0
	   for(int i=1;i <=100;i +=2){
	        //i一定是奇数
			//累加求和
			
			//定义一个变量【盒子】
			//int sum = 0;位置放错了，每次都会归零
			sum += i;
           
			//输出语句放到这里表示每循环依次则输出一个数据
			//System.out.println("sum = " + sum);

	   }
	   
	   //以上的for循环结束之后，最终输出求和的结果
	   System.out.println("sum = " + sum);

	   //=======================================================================
	   //归零
	   sum = 0;

	   for(int i =1;i <=100;i ++){
	       if(i % 2 !=0){//是奇数
		       sum += i;//则累加求和
		   }
	   }
	    System.out.println(sum);
	}
}