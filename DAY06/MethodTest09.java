/*
   深入return语句
       * 带有return关键字的java语句只要执行，所在的方法执行结束。
	   
	   * 在同一个作用域当中，return语句下面不能编写任何代码，因为这些代码永远都执行不到。
	   所以编译报错。
*/
public class MethodTest09
{
	public static void main(String[] args){
		int retValue = m();
		System.out.println(retValue);
		//也可以这样 System.out.println(m());
	
	}
	/*
	public static int m(){
	    int a  =10;
		if(a >3){
		    return 1;//没有办法保证这个return100%执行，所以编译报错：缺少返回语句。
		}
	}*/

	//以下程序可以保证return1或者return0执行
	public static int m(){
	   int a = 10;
	   if(a > 3){
	      return 1;
		  //System.out.println("Hello!");
		  //编译错误，不执行，因为无法访问到
	   } 
	      //System.out.println("Hello!");
		  //可以通过（理解）
	    else{		  
	      return 0;
	   }
	}
	/*//和以上方法完全相同
	public static int m(){
	   int a = 10;
	   if(a > 3){
	      return 1;
	   }
	      return 0;
	}*/
	public static int m(){
	   return 10>3 ? 1 : 0;	
	}
}