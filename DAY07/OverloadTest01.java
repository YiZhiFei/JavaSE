
/*
   以下代码不使用“方法重载机制”，不适用overload，分析程序存在的缺点？
       1.  sumInt,sumLong,sumDouble方法虽然功能不同，但是功能是相似的，都是求和。
           在以下程序当中功能相似的方法，分别起了三个不同的名字，这对于程序员来说，调用
           方法的时候不方便，程序员需要记忆更多的方法，才能完成调用。

      2. 代码不美观。

	  有没有这样的一种机制：
	  功能虽然不同，但是功能相似的时候，有没有这样的一种机制，可以让程序员使用这些方法的时候
	  就像在使用用一个方法一样这样程序员以后编写代码比较方便，也不需要记忆更多的方法名，代码
	  也会更美观。

	  有这种机制：方法重载/Overload
*/
public class OverloadTest01
{
	public static void main(String[] args){

		//调用方法
		int result1 = sumInt(1,2);
		System.out.println(result1);

		double result2 = sumDouble(1.0,2.0);
        System.out.println(result2);

		long result3 = sumLong(1L,2L);
		System.out.println(result3);
	
	}

	//定义一个方法，可以计算两个int类型数据的和
	public static int sumInt(int a,int b){
	       return a + b;
	}

	//定义一个方法，可以计算两个double类型数据的和
	public static double sumDouble(double a,double b){
	       return a + b;
	}

	//定义一个方法，可以计算两个long类型数据的和
	public static long sumLong(long a,long b){
	       return a + b;
	}
	//最终希望达到的效果是：程序员在使用上面的三个相似的方法的时候，就像在使用一个方法一样。
	//Java支持这种机制【有些语言不支持，例如以后要学习的：javascript】
}