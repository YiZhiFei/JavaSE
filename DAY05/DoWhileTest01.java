
/*
  do...while循环：
    1.do...while循环的语法结构：
	   do{
	        循环体;
		}while(布尔表达式);


    2.do...while循环的执行原理

	3.do...while循环的执行次数：

		 do...while循环的循环体代码片段执行次数是： 1-N次【至少1次】

	4.do...while循环的注意事项：

	     do...while循环语句最终由一个“分号”别丢了。

*/
public class DoWhileTest01
{
	public class static void main(String[] args)
	{
		int i =10;
		do
		{
			System.out.println(i);
		}
		while (i > 100);

		System.out.println("-------------------------------------------------");

		while (i>100)
		{
			System.out.println("i-->" + i);
		}

		System.out.println("-------------------------------------------------");

		int i = 1;
		do
		{
			System.out.println(i);//1 2 3 4 5 6 7 8 9 10
			i++;
		}
		while (i <= 10);
	}
}