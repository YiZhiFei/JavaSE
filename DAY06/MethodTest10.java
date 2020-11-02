
/*
  在返回值类型是void的方法当中使用"return;"语句.
  "return;"语句出现在返回值为void的方法中，主要是终止方法的执行
*/
public class MethodTest10
{
	public static void main(String[] args){
	      m();

		  for(int i=10;i>0;i--){
		     if(i == 2){
			    return;//结束的是main方法
			 }
			 System.out.println("date -->" + i);
		  }
		  System.out.println("Execute Here!");
	}

	/*编译错误，类型为空
	public static void m(){
	return 10;
	}
	*/
	public static void m()
		{
	   for(int i = 0;i<10;i++){
	       if(i == 5){
		   return;//不是终止for循环，终止的是m()方法。
		   //break;//终止的是for循环
	   }
	   System.out.println ("i -->" + i);
	}
	System.out.println ("Hello World!");
 }
}