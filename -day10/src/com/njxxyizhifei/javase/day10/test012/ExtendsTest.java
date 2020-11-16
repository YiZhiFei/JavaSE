package com.njxxyizhifei.javase.day10.test012;

public class ExtendsTest {
/**
 * 关于java语言当中的继承
 *    1.继承是面向对象三大特征之一，三大特征分别是：封装、继承、多态
 *    2.继承“基本”的作用是：代码的复用，但是继承最重要的作用是：有了继承才有了以后“方法的覆盖”和“多态机制”。
 *    3.继承的语法格式
 *      [修饰符列表]class 类名 extends 父类名{
 *          类名 = 属性 + 方法
 *      }
 *    4.java语言当中的继承只支持单继承，一个类不能同时继承很多类，只能继承一个类。在C++中支持多继承。
 *    5.关于继承中的一些术语：
 *       B类继承A类，其中：
 *            A类称为：父类、基类、超类、superclass
 *            B类称为：子类、派生类、subclass
 *    6.在java语言当中子类继承父类都继承哪些数据呢？
 *       - 私有的不支持继承
 *       - 构造方法不支持继承
 *       - 其他数据都可以继承
 *    7.虽然java语言当中只支持单继承，但是一个类也可以间接继承其他类，例如：
 *      C extends B{
 *      }
 *      B extends A{
 *      }
 *      A extends T{
 *      }
 *      C直接继承B类，但是C类间接继承T、A类。
 *    8.java语言中假设一个类没有显示的继承任何类，该类默认继承JavaSE库当中提供的java、lang、Object类。
 *    java语言中任何一个语言都有Object特征
 */
	//Myeclipse快捷键：查找类型【open type】 -->ctrl + shift + t 
	//                      【open resource】  ctrl + shift + r
	public static void main(String[] args) {
		ExtendsTest et = new ExtendsTest();
		String s  = et.toString();//这里编译通过了，这说明可以调用toString方法，EctendsTest类中有toString方法，从Object类中继承过来的。
		System.out.println(s);//输出了：com.njxxyizhifei.javase.day10.test012.ExtendsTest@15db9742
		
		CreditAccount act = new CreditAccount();
		act.setNo("act-001");
		act.setBalance(-1000.0);
		act.setCredit(0.99);
	}

}
