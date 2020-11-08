package com.njxxyizhifei.javase.day09.test004;

/**
 * 
 * 构造方法的作用： 
 *     1.创建对象 
 *     2.创建对象的同时，初始化实例变量的内存空间。【给实例变量赋值】
 *     
 * 成员变量之实例变量，属于对象级别的变量，这种变量必须先有对象才能有实例变量。
 * 实例变量没有手动赋值的时候，系统默认赋值，那么这个系统默认赋值是在什么时候完成的呢？
 *       是在类加载的时候吗？不是，因为类加载的时候只加载了代码片段，还没来得及创建对象。所以此时实例变量并没有初始化。
 *       
 * 实际上，实例变量的内存空间是在构造方法执行过程当中完成开辟的。完成初始化的。
 * 系统在默认赋值的时候，也是在构造方法执行过程当中完成的赋值。
 * 
 * 实例变量默认值：
 * byte,short,int,long 0
 * float,double 0.0
 * boolean false
 * 引用数据类型null
 * 
 * 实例变量是存储在JVM的堆内存java对象内部。
 * 
 */
public class ConstructorTest02 {
	public static void main(String[] args){
		
		//在myeclipse当中怎么查看访问的是哪个属性，查看访问的是哪个方法？
		//按ctrl键，鼠标移动到查看的元素上，出现下划线的时候开始单击。
		//另外，在一个类当中元素过多，想快速查看，在当前类中使用ctrl + o快捷键，然后输入要查找的元素名称，该名称不一定输入全名称
		//创建对象
		Account act1 = new Account();
		
		System.out.println("账号："+act1.getActno());	
		System.out.println("余额："+act1.getBalance());
		
        Account act2 = new Account("110");
		
		System.out.println("账号："+act2.getActno());	//110
		System.out.println("余额："+act2.getBalance());//0.0
		
        Account act3 = new Account(10000);
		
		System.out.println("账号："+act3.getActno());	//null
		System.out.println("余额："+act3.getBalance());//10000
		
	}
}
