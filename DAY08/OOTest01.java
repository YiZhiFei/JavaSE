
/*
     对象的创建和使用
*/
public class OOTest01
{
	public static void main(String[] args){
	
	//int是基本数据类型
	//i是一个变量名
	//10是一个int类型的字面值
	int i = 10;

	//通过一个类可以实例化n个对象
	//实例化对象的语法：new 类名();
	//new是java语言当中的一个运算符
	//new运算符的作用是创建对象，在JVM堆内存当中开辟新的内存空间
	//方法区内存：在类加载的时候，class字节码代码片段被加载到该内存空间当中。
	//栈内存（局部变量）：方法代码片段执行的时候，会给该方法分配内存空间，在栈内存中压栈。
	//堆内存：new的对象在堆内存中存储
	//Student是一个引用数据类型
	//s是一个变量名
	//new Student()是一个学生对象

	Student s = new Student();
	}
}