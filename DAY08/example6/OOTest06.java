/*
    需求：

	    定义一个计算机类【电脑/笔记本】，计算机有哪些属性：
		 * 品牌
		 * 型号
		 * 颜色

		定义一个学生类，学生类有哪些属性：
		 * 学号
		 * 姓名
		 * 学生有一台笔记本电脑
		
		请编写程序，来表示以上的类，然后分别将类创建为对象，
		对象数量不限，然后让其中的一个学生去使用其中的一台笔记本电脑。

		然后编译并运行，并且将整个执行过程采用图形的方式描述出来。

*/
public class OOTest06
{
	public static void main(String[] args){
	      
		  Student s = new Student();

		  System.out.println(s.no);//0
		  System.out.println(s.name);//null
		  System.out.println(s.comp);//null		  
		  
		  s.no = 12;		  
		  s.name = "一只肺";		  
		  //学生拥有一台电脑
		  s.comp = new Computer(); 

		  s.comp.brand = "Thinkpad";
		  s.comp.model = "E475";
		  s.comp.color = "black";

		  System.out.println("学生学号" +"\n"+ s.no +"\n"+ "学生姓名" +"\n"+ s.name +"\n"+ "拥有" +"\n"+ s.comp.brand + "型号" +s.comp.model + "颜色" + s.comp.color);
	}
}