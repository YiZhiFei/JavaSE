package com.njxxyizhifei.javase.day10.test006;

public class Test {


		
		//带有static的方法
		public static void method1(){
			//调用doSome
			//使用完整方式调用
			//使用省略方式调用
			Test.doSome();//完整调用
			doSome();//省略调用
			
			//调用doOther
			//使用完整方式调用
			//使用省略方式调用（没有！）
           Test tt = new Test();
           tt.doOther();//完整调用
           			
			//访问i
			//使用完整方式访问
			//使用省略方式访问(没有！)
             System.out.println(tt.i);
			
		}
		
		//没有static的方法
		public void method2(){
			//调用doSome
			//使用完整方式调用
			//使用省略方式调用
			Test.doSome();//完整调用
			//doSome();//省略调用?疑问？可以这么调用吗
			
			//调用doOther
			//使用完整方式调用
			//使用省略方式调用(没有！)
			this.doOther();
			doOther();
			
			//访问i
			//使用完整方式访问
			//使用省略方式访问
	        System.out.println(this.i);
	        System.out.println(i);
			
		}

		//主方法
		public static void main(String[] args) {
			//要求在这里编写程序调用method1
			//使用完整方式调用
			//使用省略方式调用
			Test.method1();
			method1();
			
			//要求在这里编写程序调用method2
			//使用完整方式调用
			//使用省略方式调用(没有！)
			Test t = new Test();
			t.method2();
		}
		
		//没有static的变量
		int i = 10;
		
		//带有static的方法
		public static void doSome(){
			System.out.println("do Some!");
		}
		
		//没有static的方法
		public void doOther(){
			System.out.println("do Other!");
		}

	}

