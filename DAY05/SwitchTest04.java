
/*
  实现计算器中的加减乘除求余数的计算
  + - * / %
  实现思路：
     1.选择所有数据从键盘输入
	 2.使用switch语句进行判断
	 3.需要从控制台输入三次
	     *第一个数字
		 *运算符
		 *第二个数字

  最终在控制台上是这样一个场景：
      欢迎使用简单计算器系统：
	  请输入第一个数字：10
	  请输入运算符：+ - * / %
	  请输入第二个数字：20
	  运算结果：10 + 20 = 30
*/
public class SwitchTest04
{
	public static void main(String[] args){
	
	     System.out.println("欢迎使用简单计算器系统");
		 java.util.Scanner s = new java.util.Scanner(System.in);
		 System.out.print("请输入第一个数字：");
		 int a = s.nextInt();
		 System.out.print("请输入想要做的计算：");
		 String operator = s.next();
		 System.out.print("请输入第二个数字：");
		 int b = s.nextInt();		 
		 switch (operator)
		 {
		 case "+":
			 System.out.println(a+ "+"+ b + "=" +(a + b));
		 break;
		 case "-":
			 System.out.println(a+ "-"+ b + "=" +(a - b));
		 break;
		 case "*":
			 System.out.println(a+ "*"+ b + "=" +(a * b));
		 break;
		 case "/":
			 System.out.println(a+ "/"+ b + "=" +(a / b));
		 break;
		 case "%":
			 System.out.println(a+ "%"+ b + "=" +(a % b));
		 break;
		 default :
			 System.out.println("您输入的数字可能不合法");
		 }//可改良：先int rusult = 0;
		  // 最后打印出算式 （详见if的第一例）

	}
}

		 