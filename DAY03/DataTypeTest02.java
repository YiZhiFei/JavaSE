/*
   关于八种基本数据类型的默认值
    数据类型             默认值
---------------------------------------
	 byte,short,int,long   0
	 float,double          0.0
	 boolean               false【在c语言中，true是1，false是0】
	 char                  \u0000

 八种基本数据类型的默认值是一切向0看齐。

*/
public class DataTypeTest02
{
	//这里static必须加,先别问为啥！
	static int k = 1000;

	//成员变量没有手动赋值，系统会默认赋值，局部变量不会，要先赋值，才能访问
	static int f;//成员变量

	public static void main(String[] args){
	      /*
		  int i;//局部变量
		  System.out.println(i);
		  */

		  System.out.println(k);

		  System.out.println(f);//输出为0，是默认值
	}
}