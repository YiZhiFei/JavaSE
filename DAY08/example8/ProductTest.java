
/*
    每一个类中都可以编写主方法，但是一般情况下，
	一个系统只有一个入口，所以主方法一般写一个
*/
public class ProductTest//商品测试类
{
	//程序入口
	public static void main(String[] args){

	    //创建对象，商品对象
		//iphone7局部变量
		//iphone7引用
		//iphone7变量中保存内存地址指向堆内存当中的商品对象
		Product iphone7 = new product;

		//访问实例变量的语法：引用.变量名
		System.out.println("商品的编号：" + iphone7.productNo);//0
		System.out.println("商品的单价：" + iphone7.price);//0
	}
}