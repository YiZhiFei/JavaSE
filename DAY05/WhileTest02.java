/*
   使用while循环输出1-10
*/
public class WhileTest02
{
	public static void main(String[] args){
	
        int i = 1;
		while (i <= 10)
	    {
			System.out.println(i);
            i ++;
	    }
		System.out.println("end -->" + i);
		System.out.println("------------------------------------------------------------");

		int j = 10;
		while (j>0)
		{
			System.out.println(j --);//10 9 8 7 6 5 4 3 2 1 先做赋值运算，再自减1
			System.out.println("-->"+ j);//9 8 7 6 5 4 3 2 1 0
		}
		System.out.println("end -->" + j);//0

		System.out.println("------------------------------------------------------------");

		int k = 10;

		while (k>=0)
		{
			System.out.println(--k);//9 8 7 6 5 4 3 2 1 0 -1
		}
		
         System.out.println("k-->" + k);//-1
	}
}