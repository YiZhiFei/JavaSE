//测试类
public class OOTest02
{
	public static void main(String[] args){
	     
		 //创建User对象
		 //u是局部变量
		 //u是一个引用
		 //u保存内存地址只想堆内存的User对象
		 User u = new User();

		 //输出Sser对象内部实例变量的值
		 System.out.println(u.no);//0
		 System.out.println(u.name);//null
		 System.out.println(u.addr);//null

		 //修改User对象内部实例变量的值
		 u.no = 110;
		 u.name = "jack";//字符串是个特例不用new也可以创建出来
		 u.addr = new Address();

		 //在main方法当中目前只能看到一个引用“u”
		 //一切都是只能通过u来进行访问
		 System.out.println(u.name + "居住的城市"+ u.addr.city);
		 System.out.println(u.name + "居住的街道"+ u.addr.street);
		 System.out.println(u.name + "居住的邮编市"+ u.addr.zipcode);
         
		 //引用是一个变量，它可以是局部变量也可以是实例变量。

	}
}