/*
 switchȷʵ����̽��String���ͣ�����java7�������ԡ�
 */
 public class SwitchTest02
 {
	 public static void main(String[] args){
	      
		  java.util.Scanner s = new java.util.Scanner(System.in);

		  System.out.print("���������ڼ���");

		  String dayofWeek = s.next();

		  switch (dayofWeek)
		  {
		  case "����һ":
			  System.out.println("1");
		  break;
		  case "���ڶ�":
			  System.out.println("2");
		  break;
		  }
	 }
 }