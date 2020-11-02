/*
  需求：
       判断当前的天气
	       当外边下雨的时候：
		         带雨伞：
				     判断性别：
					     当性别为男，带一把大黑伞
						 当性别为女，带一把小花伞

		   当外边晴天的时候：
		         判断天气的温度：
				     当天气温度在30度以上：
					     当性别为男：戴墨镜
						 当性别为女：擦防晒霜

    提示：
	     1.一定会用到嵌套
		 2.天气状况、温度、性别都需要从键盘输入
		   天气状况：1.表示下雨2.表示晴天
		   温度直接使用数字就好
		   性别：1.表示男 2.表示女
*/
public class IfTest03
{
	 public static void main(String[] args){

		 System.out.println("欢迎使用本系统，您通过本系统可以完成一些简单的判断");
		 System.out.println("说明1：1表示下雨， 0表示晴天");
		 System.out.println("说明2：1表示男 0表示女");
		 System.out.println("说明3：温度为数字");		 

		 java.util.Scanner s = new java.util.Scanner(System.in);

		 System.out.print("请输入当前天气：");
		 
		 int weather = s.nextInt();
         
		 //判断天气状况
		 if (weather == 1)//下雨天
		 {
			// System.out.println("下雨天");
			System.out.print("请您输入性别:");
			int sex = s.nextInt();			
			if (sex == 0)
			{
				System.out.println("带一把小花伞");
			}else if (sex == 1)
			{
				System.out.println("带一把大黑伞");
			}else 
			{
				System.out.println("您输入的性别咋回事？");
			}


			//接收用户输入，接收性别
		 }else if (weather == 0)//晴天
		 {
			// System.out.println("晴天");
			 System.out.print("请您输入气温：");
			 int tem = s.nextInt();
			if (tem >45 || tem < -45)
			{
				System.out.print("您输入的气温数字不合法");
			}else 
			{
				   if (tem > 30)
			    {
				   System.out.print("请您输入性别:");
				   int sex = s.nextInt();
				   if (sex == 0)
				   {
					   System.out.println("擦防晒霜");
				   }else if (sex == 1)
				   {
					   System.out.println("戴墨镜");
				   }else
				   {
					   System.out.println("您输入的性别是啥");
				   }
			   }else 
				   {
					   System.out.println("啥也不用干");
				   }

			 } 
		 }
	 }
}