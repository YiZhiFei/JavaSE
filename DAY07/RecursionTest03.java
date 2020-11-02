
/*
    使用递归计算1~N的求和
	 1 + 2 + 3 + 4.....
	 4 + 2 +3 + 1 ......
*/
public class RecursionTest03
{
	public static void main(String[] args){
	      
		  //1~4的和
		  int n = 4;
		  int retValue = sum(n);
		  System.out.println(retValue);
	}


	public static int sum(int n){
	    
		 //用递归怎么写呢？
         if(n == 1){
		    return 1;
		 }
		 return n + sum(n-1);

	}
}