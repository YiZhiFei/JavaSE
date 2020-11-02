
/*
   需求：
        假设系统给定一个人的年龄，年龄需要从键盘输入
		根据年龄来判断这个人处于生命的哪个阶段，年龄必须在[ 0-150 ]
		[0-5]    幼儿
		[6-10]   少儿
		[11-18]  青少年
		[19-35]  青年
		[36-55]  中年
		[56-150] 老年
*/
public class IfTest02
{
	public static void main(String[] args){

  
	   //1.接收键盘输入：年龄【输入的时候必须输入数字】
	   java.util.Scanner s = new java.util.Scanner(System.in);

	   System.out.print("请输入您的年龄：");
	   //System.out.println("请输入您的年龄：")；//这里它会换行
	   int age = s.nextInt();//这里age这块可以变。
	   //停下来等待用户的输入，输入之后自动接收，赋值给age变量。
	   //System.out.println( "age = "+ age );

       //2.根据需求进行业务逻辑判断
	   String str = "老年";
	   if( age < 0 || age > 150 ){
	      str = "您提供的年龄不合法，年龄值需要在[0-150]之间";
	   }else if (age <= 5)
	   {
		   str = "幼儿";
	   }else if (age <= 10)
	   {
		   str = "少儿";
	   }else if (age <= 18)
	   {
		   str = "青少年";
	   }else if (age <= 35)
	   {
		   str = "青年";
	   }else if (age <= 55)
	   {
		   str = "中年";
	   }
	   
	   System.out.println("处于生命周期的：" + str + "阶段");
	   //该程序输入150以上有bug，暂且不好改

	


/*
 自己编的程序可运行
  
		java.util.Scanner s = new java.util.Scanner (System.in);
		
		int num = s.nextInt();

		String age = ("这个人处于生命的 老年 阶段");
		if ( num < 0 || num > 150 )
		{
			age =("您输入的年龄数字不合法");
		}
		else if ( num <= 5 )
		{
           age = ("这个人处于生命的 幼儿 阶段");
		}
		else if ( num <= 10 )
		{
			age = ("这个人处于生命的 少儿 阶段");
		}
		else if ( num <= 18 )
		{
			age = ("这个人处于生命的 青少年 阶段");
		}
		else if ( num <= 35 )
		{
			age = ("这个人处于生命的 青年 阶段");
		}
		else if ( num <= 55 )
		{
			age = ("这个人处于生命的 中年 阶段");
		}
		else//这里没有布尔语句！
		{
            age = ("这个人处于生命的 老年 阶段");
		}
		System.out.println( age );
*/

    }
}