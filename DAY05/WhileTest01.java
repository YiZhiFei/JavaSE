
/*
   while循环语句：
       1.while循环的语法结构：

	      while(布尔表达式){
		     循环体：
		  }

	   2.while循环的执行原理：

	     先片段布尔表达式的结果：
		      *true
			    -执行循环体
				   *判断布尔表达式的结果：
				     *true
					   -执行循环体
					   .....


	   3.while循环的循环次数：
	     0~N次
		 注意：while循环的循环体可能执行次数为0次。


*/
public class WhileTest01
{
	public static void main(String[] args){
	    
        //死循环
		/*
		while (true)
        {
			System.out.println("死循环");
        }*/
		
		//编译器检测到该程序永远都无法被执行，所以编译报错。
		//System.out.println("HelloWorld!");

		/*
		int i = 10;
		ing j = 3;
		while(i>j){
		  System.out.println("呵呵");
		}
		System.out.println("HelloWorld!")
		//编译器可以编译通过，因为编译过程只检查语法，不做运算。不会运算i>j的结果*/



	}
}