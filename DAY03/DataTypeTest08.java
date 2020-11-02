/*
  关于基本数据类型之间的互相转换：转换规则
      
	  1、八种基本数据类型当中除布尔类型之外剩下的7种类型之间都可以互相转换
	  
	  2.小容量向大容量转换，称为自动类型转换，容量从小到大排序：
	     byte < short < int < long < float < double < char 
		   
		   注：任何浮点类型不管占用多少个字节，都比整数型容量大。
		        char和short可表示的种类数量相同，但是char可以取更大的正整数。
	  
	  3.char c = 97;(这里是int字面值)
	    大容量转换成小容量，叫做强制类型转换，需要加强制类型转换符，程序才能编译通过，
		但是在运行阶段可能会损失精度，所以谨慎使用。

	  4.当整数字面值没有超出byte,short,char的取值范围，可以直接赋值给byte,short,char类型的变量

	  5.byte,short,char混合运算的时候，各自先转换成int类型再做运算。

	  6.多种数据类型混合运算，先转换成容量最大的那种类型再做运算。
	       
*/
public class DataTypeTest08
{
	publi static void main(String[] args){
	   
	    //出现错误，1000超出了byte的范围
	    //byte a = 1000
		//正确，因为20没有超出byte的范围
		//所以赋值
		byte a = 20
	    //错误，变量不能重名
		//short a = 1000;
		//正确，1000没有超出short的取值范围
		short b = 1000;
		//正确，默认值为int,没有超出int的范围
		int c = 1000;
		//正确，可以自动转换
		long d = c;
		//错误，出现精度丢失问题，大类型-->小类型会出现的问题
		//int e = d;
		//因为Java中的运算会转成最大类型
		//而10和3默认为int，所以运算后的最大类型也是int
		//所以是正确的
		int f = 10/3;
		//如果是double dd = =10/3 结果3.0 是先算出结果再转换的
		//dd = 10.0/3 结果是3.3333333333335
		
		//声明10为long类型
		long g = 10;
		//出现错误，多个数值在运算过程中，会转化成容量最大的类型
		//以下示例最大的类型为double，而h为int，所以就会出现大类型（long）到小类型（int）
		//的转换，将会出现精度丢失的问题
		//int h = g/3;
		//可以轻质转换，因为运算结果没有超出int范围
		//long h =(int)g/3;
		//可以采用long类型来接收运算结果
		//long h = g/3;
		//出现精度损失问题，以下问题主要是优先级的问题
		//将g转换成int，然后又将int类型的g转换成byte，最后byte类型的g和3运算，那么
		//它的运算结果类型就是int,所以int赋值给byte就出现了精度损失问题
		//byte h = (byte)(int)g/3;//编译时只检查语法，不进行运算，如果byte h = 3这是对的。

		//正确
		//byte h = (byte)(int)(g/3);
		//不能转换，还有因为优先级的问题
		//byte h = (byte)g/3;
		//可以转换，因为运算结果没有超出byte范围
		//byte h = (byte)(g/3);
		//可以转换，因为运算结果没有超出short范围
		//short h = (short)(g/3);
		short i = 10;
		byte j = 5;
		//错误，short和byte运算，首先会转换成int再运算
		//所以运算结果为int,int赋值给short就会出现精度丢失问题
		//short k = i+j;
		//可以将运算结果强制转换成short
		//short k =(short)(i+j);
		//因为运算结果为int,所以可以采用int类型接收
		int k = i + j;
		char 1 ='a';
		System.out.println(1);//a
		//输出结果为97，也就是a的ascii值
		System.out.println((byte)1);//97
        int m = 1 + 100;
		//输出结果为197，取得a的ascii码值，然后与100进行相加运算
		System.out.println(m);//197

    
	}
};
