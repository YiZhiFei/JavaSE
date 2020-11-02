/*
  方法调用
       1.方法的修饰符列表当中有static关键字，完整的调用方式是：类名.方法名（实力列表）;
	   2.但是，有的时候“类名.”可以省略，什么情况下可以省略呢？

  实际开发中一个Java文件中写一个class，不要定义多个class
*/
public class MethodTest06
{
	public static void main(String[] args){
	
	//调用方法
	MethodTest06.m();

	//对于方法的修饰符列表当中有static关键字的："类名."可以省略不写吗？
	m();

	//调用其他类【不是本类中的】中的方法
	A.doOther();

	//省略“类名.”试试
	//doOther();当前类中找不到，编译报错

	}
	public static void m(){
	    System.out.println("m method execute!")

			//完整的编写方式
			MethodTest06.m2();

			//省略的方式
			m2();

			//不想调用当前本类当中的m2方法，这个时候就必须添加“类名”了
			A.m2();

	}

	public static void m2(){
	    System.out.println("m2 ececute!");
	}
}
class A
{
	public static void doOther(){
	     System.out.println("A's doOther method invoke!");
	}
	public static void m2(){
	   System.out.println("A's m2 method execute!")
	}
}