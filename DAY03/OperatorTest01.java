/*
   关于Java运算符之：算术运算符
      +       求和
	  -       相减
	  *       乘积
	  /       商
	  %       求余数

	  ++      自加1
	  --      自减1

  注意：一个表达式当中有多个运算符，运算符有优先级，不确定的加括号，小括号，优先级提升。
        没必要专门记忆运算符的优先级。
*/
public class OperatorTest01
{
	public satatic void main(String[] args){
	      
		  int i = 10;
		  int j = 3;
		  System.out.println( i + j );//13
		  System.out.println( i - j );//7
		  System.out.println( i * j );//30
		  System.out.println( i / j );//3
     	  System.out.println( i % j );//1

		  //关于++运算符【自加1】
		  //以下以++为例，--运算符自学！
		  int k = 10;

          k ++;
		  //++运算符可以出现在变量后面【单目运算符】

		  System.out.println(k);//11

		  int y = 10;

		  //++运算符可以出现在变量后面【单目运算符】
		  ++ y;

		  System.out.ptintln(y);//11

		  //小结：
		  //++运算符可以出现在变量前，也可以出现在变量后，无论是变量前还是变量后
		  //只要++运算结束，该变量中的值一定会自加1

		  //++ 出现在变量后
		  //规则：先做赋值运算，再对变量中保存的值进行自加1
		  int a = 100;
		  int b = a ++;
		  System.out.println(a);//101
		  System.out.ptintln(b);//100

		  //++ 出现在变量前
		  //规则：先进行自加1运算，然后再进行赋值操作
		  int m = 20;
		  int n = ++ m;
		  System.out.println(m);//21
		  System.out.println(n);//21

		  int xx = 500;
		  System.out.println(xx);

		  int e = 100;
		  System.out.println(e ++);//100
		  System.out.println(e);//101

		  int s = 100;
		  System.out.println(++ s);//101
		  System.out.println(s);//101

		  System.out.println(--s);//100
		  System.out.println(s++);//100
		  System.out.println(s--);//101
		  System.out.println(s--);//100
		  System.out.println(s--);//99
		  System.out.println(s); //98

	}
}
/*
class A
{
    public void m(int x)//这里相当与int x = i(int是形参)
	{
	}
	main
	{
	     int i = 10;
		 m(i);
	}
}
*/