/*
   continue语句：
      1.continue表示：继续/go on/下一个

	  2.continue也是一个continue关键字加一个分号构成一个单独的完整的Java语句，主要
	  出现循环语句当中用来控制循环的执行。

	  3.break和continue的区别？
	      *break表示循环不执行了,跳出循环，终止循环
		  *continue表示直接进入下一次循环继续执行

	  4.continue也有这样的语法：
	     continue循环名称：【作为】
*/
public class ContinueTest01
{
	public static void main(String[] args){
	
	     for (int i =0;i< 10 ;i++ )
	     {
			 if (i==5)
			 {
				 break;//1 2 3 4
			 }
			 System.out.println("i =" + i);
	     }

		 System.out.println("Hello World!");
	
	     for (int i =0;i< 10 ;i++ )
	     {
			 if (i==5)
			 {
				 continue;// 1 2 3 4 6 7 8 9 
			 }
			 System.out.println("i =" + i);
	     }

		   myFor:for (int i =0;i< 10 ;i++ )
	     {
			 if (i==5)
			 {
				 continue myFor;//  51 2 3 4 6 7 8 9 
			 }
			 System.out.println("i =" + i);
	     }


	}
}
     