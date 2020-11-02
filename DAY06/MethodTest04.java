/*
功能
public static ??? 方法名(???){
???
}

方法的调用不一定在main方法当中，可以在其他方法当中。
只要是在程序可以执行到的位置，都可以调用方法
*/
public class MethodTest04
{
	public static void sum(int a, int b){
	    
		System.out.println(a + "+" + b + "=" + (a+b));

		//调用doSome方法
		MethodTest04.doSome();
	}
	//主方法
	public static void main(String[] args){
        

		//调用sum方法
		MethodTest04.sum(1,2);

		System.out.println("Hello World!");
	
	}
	public static void doSome(){
	     System.out.println("do some!")
	}//main方法只是一个起点，方法的调用可以写在它的上面。注意上例的执行顺序
}