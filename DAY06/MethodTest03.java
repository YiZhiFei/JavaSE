/*
   关于java语言中的方法：

     1.方法怎么定义，语法结构：
	    
		[修饰符列表] 返回值类型 方法名（形式参数列表）{
		    方法体;
			}
	 2.对以上的语法结构进行解释说明：

	    2.1.关于修饰符列表
		   *可选项，不是必须的
		   *目前统一写成：public static【以后讲】
		   *方法的修饰符列表当中有static关键字的话，怎么调用这个方法？
		       -类名、方法名（实际参数列表）;

	    2.2.返回值类型
		   
		   *什么是返回值？
		      一个方法是可以完成某个特定功能的，这个功能结束之后大多数都是需要
			  返回最终最终执行结果的，执行结果可能是一个具体存在的数据。而这个具体
			  存在的数据就是返回值。
		  
		   *返回值类型？
		       返回值是一个具体存在的数据，数据都是由类型的，此处需要制定的是返回值
		   
		   *返回值类型都可以执行哪些类型呢？
		        java任意一种类型都可以，包括基本数据类型和所有引用类型。
		  
		   *也可能这个方法执行结束之后不返回任何数据，Java中规定，当一个方法执行结束
		   之后不返回任何数据的话，返回值类型位置必须编写：void关键字。

		   *返回值类型可以是：
		       byte,short,int,long.float,double,boolean,char,String,void...

		   *返回值类型若不是void，表示这个方法执行结束之后必须返回一个具体的数值。
		   当方法执行结束的时候没有返回任何数据的话编译器报错。怎么返回值呢？代码怎么写呢？
		   “return 值;”，并且要求"值"的数据类型必须和“方法的返回值类型”一致。不然
		   编译器报错。

		   *返回值类型是void的时候，在方法体当中不能编写“return 值;”这样的语句。但是要注意
		   可以编写“return;”这样的语句。

		   *只要带有return关键字的语句执行，return所在的方法结束。【不是JVM结束，是方法结束】

		2.3.方法名：
		    *只要是合法的标识符就行
			*方法名最好见名知意
			*方法名最好是动词
			*方法名首字母要求小写，后面每个单词首字母大写，遵守驼峰命名方式

	    2.4.形式参数列表：简称形参
		    *形参是局部变量：int a;double b;float c;String d....
			*形参的个数可以是：0-N个
			*多个形参之间用“逗号”隔开
			*形参中起决定性作用的是形参的数据类型，形参的名字就是局部变量的名字。
			*方法在调用的时候，实际给这个方法传递的真是数据被称为：实际参数，简称实参
			*实参列表和形参列表必须满足：
			   -数量相同
			   -类型对应相同
			例如：
			     方法定义
				 public static int sum(int 变量名,int 合法标识符就行){(int a,int b)是形参列表
				 }
				 //方法的调用
				 sum("abc","def");编译器报错
				 sum(10,20);

		2.5.方法体必须由大括号括起来，方法体当中的代码有顺序，遵循地上而下的顺序依次执行。
		并且方法体由Java语句以“;”结尾
	
	3.方法怎么调用？
	   方法只定义不去调用时不会执行的。只有在调用的时候才会执行。
	   语法规则：方法的修饰符列表当中有 static
	        类名.方法名（实参列表）;<只是一条java语句，表示调用某个类的某个方法，传递这样的实参。>
*/
//public表示公开的
//class表示定义类
//MethodTest03是一个类名
public class MethodTest03//表示定义一个公开的类，起名MethodTest03，由于是公开i的类，所以源文件名必须：MethodTest03

   //类体
   //类体中不能直接编写java语句，除声明变量职位
   //方法出现在类体当中

   //方法
   //public表示公开的
   //static表示静态的
   //void表示方法执行结束之后不返回任何数据
   //main是方法名:主方法
   //(String[] args):形式参数列表，其中String[]是一种引用数据类型，args是一个局部变量的变量名
   //所以以下只有args这个局部变量的变量名是随意的
   //主方法就需要这样固定编写，这是程序的入口，【SUN规定的，必须这样写】
{
	public static void main(String[] args){
		//这里的程序一定会执行的
		//main方法是JVM负责调用的，是一个入口位置
		//从这里作为起点开始执行程序
		//既然是这样，我们就可以在这里编写jaa语句来调用其它方法
		//调用MethodTest03的sum方法，传递两个实参
		MethodTest03.sum(10,20);//这个位置的10和20是实参列表【实际上执行到这里main方法暂停了，进入sum方法执行，sum方法执行结束之后表示main方法的101行结束】
		//第107行的程序执行不结束，无法执行第102行的程序。

		//注意：方法体当中的代码是有顺序的，遵循自上而下的顺序依次执行
		//第107行的程序执行不结束，无法执行第108行的程序。

		//一个方法是可以重复使用，重复调用
		int a = 100;
		MethodTest03.sum(a,500);//(a,500)实参列表

		//再次调用方法
		int k = 90;
		int f = 10;
		MethodTest03.sum(k,f);//(k,f)实参列表
	}

	//自定义方法，不是程序的入口
	//方法作用：计算两个int类型数据的和，不要求返回结果，但是要求将结果直接输出到控制台
	//修饰符列表：public static
	//返回值类型：void
	//方法名:sum
	//形式参数列表：(int x,int y)
	//方法体：主要认为是求和之后输出计算结果
	public static void sum(int i,jint j){
	   System.out.println(i + "+" + j + "=" (i + j));
	}

	//定义一个方法
	//一个车间
	//public static返回值 int sumInt原料(int a,int b){
	}
}