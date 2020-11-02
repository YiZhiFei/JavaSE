
/*
   方法的返回值类型不是void的时候

     1.返回值类型不是void的时候：
	     要求方法必须保证百分百的执行“return 值;”的语句来完成值的返回。
	     没有这个语句，编译器会报错。

	 2.一个方法有返回值的时候，当我们调用这个方法的时候，方法返回了一个值。
	   对于调用者来说，这个返回值可以选择接收，也可以选择不接受。
	   但是大部分情况下我们都是选择接受的。
*/
public class MethodTest08
{
	public static void main(String[] args){
		//调用方法
		//divide(10,3);//这里没有接收这个方法的返回数据

		//这里接收一下方法执行结束之后的返回值
		//采用变量接收
		//变量的数据类型需要和返回值的数据类型相同，或者可以自动类型转换。
		//boolean b = divide(10,3);
		
		//赋值运算符的右边先执行，将执行结果赋值左边的变量
		int i = divide(10,3);
		System.out.println(i);

		long x = divide(10,3);
		System.out.println(x);
		//也可以System.out.println(divide(10,3))
	
	}
	/*
	  需求：
	       请定义并实现一个方法，该方法可以计算两个int类型数据的商
		   要求将最终的计算结构返回给调用者
	*/

	//编译报错：缺少返回语句
	//public static int divide(int a,int b){}
	
	
	//编译报错：缺少返回值
	/*public static int divide(int a,int b){
	      return;
		  }*/

	//返回值类型不兼容也不行~

	//可以，但是具体的方法体中编写的代码无法满足当前的需求。
	/*
	 public static int divide(int a,int b){
	    return 1;
	 }
	 */

	/*
	public static int divide(int a,int b){
	     int c =a/b;
		 return c;
	 }
	*/
	
	public static int divide(int a,int b){
	     return  a/b ;
	 }
}