/*
     if 语句
*/
public class IfTest04
{
	public static void main(String[] args){
	    
		boolean sex = true;
		if (sex)
		{
			System.out.println("男");
		}else{
		    System.out.println("女");
		}
		
		//也可以这么写
		//if(sex) System.out.println("男");else System.out.println("女");
		
		//----------------------------------------
		if (sex)
			System.out.println("男");
		    System.out.println("呵呵");//不属于if语句的
		//else
		//System.out.println("女");//这是错的，else缺少if语句
		//综上if的else要跟在if后

	}
}