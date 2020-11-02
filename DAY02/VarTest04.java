
/*
    关于变量的分类
       根据变量声明的位置来分类：
	       *局部变量
		       -在方法体当中声明的变量叫做局部变量

		   *成员变量
		       -在方法体外【类体之内】声明的变量叫做成员变量

在不同的作用域中变量名可以相同。
在同一个作用域中变量名不可以重名。
*/
public class VarTest04
{
	 int k = 200;
	   
	   //k是一个成员变量
	   //主方法：程序的入口
		 
		  public static void main(String[] args){
	     //i变量是局部变量
		  int i = 3;

		  //java遵循“就近原则”
		  System.out.println(i);

	  }
       
		//i变量是成员变量
	  int i = 100;//声明变量
	  //因为不在同一个作用域中，所以可以与上面的重名

	  //System.out.println(i);
	  //类体中不能直接编写Java语句【除声明变量之外】

	  //doSome方法
	  public static void doSome(){
	  
	     //局部变量
	     int i = 90;
	  }
}