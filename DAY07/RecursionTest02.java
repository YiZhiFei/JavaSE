
/*
   �����õݹ飬����1~N�ĺ�
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

		//ֱ�ӵ��÷�������
		int n = 4;
		int retValue = sum(n);
		System.out.println(retValue);
	}

	//�����Ķ���һ������������һ�������Ĺ��ܣ��������1~N����͡�
	public static int sum(int n){
	  int result = 0;
	   for(int i =1;i <= n;i++){
	         result += i;
	   }
	   return result;
	}
}