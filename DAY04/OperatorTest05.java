/*
   关于Java中的“+”运算符：

      1. +运算符在java语言当中有两个作用：
	      * 加法运算，求和
		  * 字符串的连接运算
	  
	  2.当“+”运算符两边的数据都是数字的话，一定是进行加法运算。

	  3.当“+”运算符两边的数据只要有一个数据是字符串，一定会惊醒字符串连接运算。
	  并且，连接运算之后的结果还是一个字符串类型。

	     数字 + 数字 ---->数字【求和】

	     数字 + "字符串"  --->"字符串"【字符串连接】
	  4.在一个表达式中可以出现多个“+”，在没有添加小括号的前提下，
	  遵循自左向右的顺序依次执行。
*/
public class OperatorTest05
{
	public static void main(String[] args){
		   
            System.out.println(10+20+30);
			System.out.println(10+20);
			System.out.println(10+20+"30");//3030 自左向右的顺序依次运行，第一个加号是求和，
			//第二个加号是连接字符串。
			System.out.println(10 + (20 + "30"));//102030是一个字符串

		   int a = 10;
		   int b = 20;

		   //要求在控制台上输出 "10+20=30",以动态方式输出
		   System.out.println("10 + 20 = 30");//这是一个字符串

		   //注意：要求以动态的方式输出
		   System.out.println("10 + 20 ="+ a + b);//这里"10+20="是个字符串，所以这里+是连接符
		   
		   System.out.println("10 + 20 ="+ (a + b));//改进。但是希望前面10+20=是动态的。

		   System.out.println(a + "+" + b + "=" +(a + b));
		   
		   //System.out.println(a "+"b"="(a+b));不算个语句

		   //引用类型String
		   //String是SUN在JavaSE当中提供的字符串类型
		   //String.class字节码文件
		   
		   //int是基本数据类型，i是变量名，10是int类型的字面值
		   int i = 10;
		  
		   //String是引用数据类型，s是变量名，"abc"是String类型的字面值
		   //String s = "abc";

		   //编译错误，类型不兼容
		   //String ss = 10;

		   //定义一个String类型的变量，起名username,赋值"zhangsan"
		   String username = "zhangsan";
		   System.out.println("登录成功，欢迎" + username + "回来");
	 
	



	}
}