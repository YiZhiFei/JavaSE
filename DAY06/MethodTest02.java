/*
  以下直接只用方法这种机制【这个例子不讲方法的语法】，分析程序的优点？
     *代码得到了重复使用

  方法本质是什么？

	 *方法就是一段代码片段，并且这段代码片段
	 可以完成某个特定的功能，并且可以被重复使用。

  方法，对应的英语单词：Method
  方法在c语言中叫做函数/Function

  方法定义在类体当中  方法体之外，可以编写多个，位置没有先后顺序。

  注意：方法体中不能再定义方法！！！！

  方法体中的代码依照自上而下的顺序依次执行。
*/
public class MethodTest02
{
	public static void main(String[] args){
	
	  MethodTest02.sumInt(10,20);
	 
	  MethodTest02.sumInt(111,222);
	  
	  MethodTest02.sumInt(333,444);	
	}

	//单独的定义一个方法
	//该方法完成计算两个Int类型数据的和，并且将结果输出
	public static void sumInt(int a,int b){
	    int c = a + b;
		System.out.println(a +  "+" + b = c)

	
	}
}