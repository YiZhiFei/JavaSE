package com.njxxyizhifei.javase.day09.test001;
/**
 * 学生测试类
 * @author WeiJiaHui
 *
 */
//main方法自动补全
//输入main,然后alt+ /,回车
public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.addr);
		System.out.println(s.sex);
		s.no = 10;
		s.name = "张三";
		System.out.println("学号："+s.no);
		System.out.println("姓名："+s.name);
		
		//创建学生对象
		Student Lisi = new Student();
		Lisi.name =  "李四";
		System.out.println(Lisi.name);
				
		

	}

}
