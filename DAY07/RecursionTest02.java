
/*
   不适用递归，计算1~N的和
*/
public class RecursionTest02
{
	public static void main(String[] args){
	 /* 
		 int n = 4;

		 int sum = 0;

		 for(int i=1;i <=4;i++){
		      sum += i;
		 }
		 System.out.println("sum = "+ sum);
		*/

		//直接调用方法即可
		int n = 4;
		int retValue = sum(n);
		System.out.println(retValue);
	}

	//单独的定义一个方法，这是一个独立的功能，可以完成1~N的求和。
	public static int sum(int n){
	  int result = 0;
	   for(int i =1;i <= n;i++){
	         result += i;
	   }
	   return result;
	}
}