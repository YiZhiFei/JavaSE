
/*
  关于Java语言当中的char类型：
     转义字符 \
*/
public class DataTypeTest03
{
	public static void main(String[] args){
	    
		//普通的n字符
		char c1 = 'n';
		System.out.println(c1);

		//依题目目前所学知识，以下程序无法编译通过，因为显然是一个字节串，不能是用单引号括起来
		//但是经过编译，发现编译通过了，这说明以下并不是一个字符串，而是“一个”字符
		//这是一个“换行符”，属于char类型的数据
		//反斜杠在Java语言当中具有转义功能
		char c2 = '\n'

		/*
        System.out.println("Hello");
		System.out.println("World");
		*/

		//System.out.println()和System.out.println输出之后换行，print表示输出，但是不换行
		/*
		System.out.print("Hello")
		System.out.println("World!");
		*/

		System.out.print("A");
		System.out.print(c2);
		System.out.println("B");

		//普通的t字符
		char x = 't';
		System.out.println(x);

		//制表符tab(与普通空格不一样的)
		char y = '\t'
		System.out.print("A");
		System.out.print(y);
		System.out.print("B");

		//要求在控制台上输出“反斜杠符”

		//反斜杠将后面的单引号转义成不具备特殊含义的普通单引号字符
		//左边的单引号缺少了结束的单引号字符，编译报错
		/*
		char k ='\';
		Systemout.println(k);
		*/

		/*
		
		解释：第一个反斜杠具有转移功能，将后面的反斜杠转义位普通的反斜杠字符。
		结论：在Java当中两个反斜杠代表一份普通的反斜杠字符
		
		*/
		char k = '\\';
		System.outprintln(k);

		//在控制台上输出一个普通的单引号字符
		//Java中不允许这样编写程序，编译报错
		//char a = '';

		//以下编译报错：第一个单引号和第二个单引号配对儿，最后的单引号找不到另一半儿！
		//（哈哈哈老师的儿太可爱了）
        //char a = '''
		//System.out.println(a);

		//反斜杠具有转义功能，将第二个单引号转换成普通的单引号字符，第一个单引号和最后单引号配对儿。
		char a ='\'';
		System.out.println(a);
		
		char f = '"';
		System.out.ptintln(f);

		System.out.println("HelloWorld!");
		System.out.ptintln("“HelloWorld!”")//可以用双引号的情况，里面的双引号位中文双引号

		//编译错误
		//System.out.ptintln(""HelloWorld!"");
		//纠正
		System.out.println("\"HelloWorld!\"");

		char m = '中'
		System.out.println(m);

		//JDK中自带的native2ascii.exe命令，可以将文字转换成unicode编码形式
		//怎么使用这个命令：
		//在命令输入native2ascii，回车，然后输入文字之后回车即可得到unicode编码

        char g = 'u4e2d';
		//System.System.System.System.System.System.System.
		System.out.println(g);

		//char类型的默认值是（\u0000）
	}
}

/*
  十进制：0 1 2 3 4 5 6 7 8 9 10
  二进制：0 1 10 11 100 101......
  十六进制：0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20......
  八进制：0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20......

*/