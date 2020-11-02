/*
   关于逻辑运算符（布尔运算符）：
      &      逻辑与【并且】（两边的算子都是true,结果才是true）
	  |      逻辑或【或者】（两边的算子只要有一个是true，结果就是true）
	  !      逻辑非（取反，！false就是true,!true就是false，这是一个单目运算符）
	  ^      逻辑异或（两边的算子只要不一样,结果就是true）

	  &&     短路与
	  ||     短路或

  1.逻辑运算符要求两边的算子都是布尔类型，并且逻辑运算符最终的运算结果也是一个布尔类型。
  2.短路与和逻辑与最终的运算结果是相同的，只不过短路与存在短路现象。
  3.短路或和逻辑或最终的运算结果是相同的，只不过短路或存在短路现象。
  4.什么情况下发生短路现象呢？
  5.什么时候选择使用逻辑与运算符？什么时候选择使用短路与运算符？

*/
public class OpreratorTest03
{
	public static void main(String[] args){
	
	      System.out.println(5 > 3 & 5 > 2);//true
		  System.out.println(5 > 3 & 5 > 6 );//false
		  System.out.println(5 > 3 | 5 > 6 );//true

		  System.out.println(true & true);//true
		  System.out.println(true & false);//false
		  System.out.println(false & true); //false
		  System.out.println(false & false);//false
		  
		  
		  System.out.println(true | false);//true
		  System.out.println(false | false);//false

		  System.out.println(!false);//true
		  System.out.println(!true);//false

		  System.out.println(true ^ false);//true
		  System.out.println(false ^ false);//false
		  System.out.println(true ^ true);//false

		  /*
		  //逻辑与和短路与
		  int x = 10;
		  int y = 8;
  
	      //逻辑与
		   System.out.println(x < y & ++x < y );
		  System.out.println(x);//11 说明执行完了上面的表达式
		  */

		  //逻辑与和短路与
		  int x = 10;
		  int y = 8;
		 
		  //短路与
		  System.out.println(x < y && ++x < y );
		  System.out.println(x);//10 说明没有执行完了上面的表达式
		  //这种现象叫短路现象

		  //从某个角度看短路与更智能。由于后面的表达式可能不执行
		  //所以执行效率较高。这种方式再实际的开发中使用较多。短路与比逻辑与
		  //使用的多，短路与更常用

		  //但是，在某些i特殊的业务逻辑当中，要求运算符两边的算子必须全部执行
		  //此时必须使用逻辑与，不能使用短路与， 使用短路与可能导致右边的表达式不执行。
		 

		 /*
            什么情况下发生短路或？
			   * 第一个表达式执行结果是true，会发生短路或。

			什么情况下发生短路与？
			   * 第一个表达式执行结果是false，会发生短路与。
		 */

     


	}
}