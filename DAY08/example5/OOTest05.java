//测试类
public class OOTest05
{
	public static void main(String[] args){
	      
		  Customer c = new Customer;
		  System.out.println(c.id);//0

		  //不再指向堆内存的Customer
		  c = null;
		  //空引用访问“实例”相关的数据一定会出现空指针异常
		  //java.lang.NullPointerException
		  System.out.println(c.id);//会发生啥【编译无错，运行异常】
	}
}
//“实例”相关的数据表示：这个数据访问的时候必须有对象的参与。这种数据就是实例相关的数据。