
/*
    ʹ�õݹ����1~N�����
	 1 + 2 + 3 + 4.....
	 4 + 2 +3 + 1 ......
*/
public class RecursionTest03
{
	public static void main(String[] args){
	      
		  //1~4�ĺ�
		  int n = 4;
		  int retValue = sum(n);
		  System.out.println(retValue);
	}


	public static int sum(int n){
	    
		 //�õݹ���ôд�أ�
         if(n == 1){
		    return 1;
		 }
		 return n + sum(n-1);

	}
}