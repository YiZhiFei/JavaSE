/*
  关于浮点型数据类型：
      float 单精度【4个字节】
	  double 双精度【8个字节，精度较高】

   double的精度太低【想读来说的】，不适合做财务软件。
   财务设计到钱的问题，要求精度较高，所以SUN在基础SE类库当中
   为程序员准备了精确度更高的类型，它是：java.math.BigDecimal

   其实Java程序中SUN提供了一套庞大的类库，Java程序员是基于这套
   基础的类库来进行开发的。所以要知道Java的SE类库的字节码在哪儿。
   要知道JavaSE的类库的源码在哪
          *SE类库字节码：C:\Program Files\Java\jre1.8.0_131\lib\rt.jar		  
		  *SE类库源码：C:\Program Files\Java\jdk1.8.0_131\src.zip

   例如：String.java和String.class
   我们的(String[] args)中的String使用的就是String.class字节码文件

   在Java语言当中，所有的浮点型字面值【3.0】，默认被当作double类型来处理。
   要想该字面只当作float类型来处理，需要在字面值后面添加F/f

   注意：
       double和float在计算机内部二进制存储的时候存储的都是近似值。
	   在现实世界中，有些数字是无限循环的，例如：3.3333333...
	   计算机的资源是有限的，用有限的资源存储无限的数据只能存储近似值。
*/
public class DataTypeTest06
{
	public static voin main(String[] args){
	
	      //3.0是double类型的字面值
		  //d是double类型的变量
		  //不存在类型转换
	      double d = 3.0

		 //5.1是double类型的字面值
		 //f是float类型的变量
		 //大容量转换成小容量需要加强制类型转换符，所以以下程序编译错误
		 float f = 5.1;

		 //解决方案 
		 //第一种方式：强制类型抓暖
		 //float f = (float)5.1;

		 //第二种方式：没有类型转换
		 float f = 5.1f;

	}
}