
/*
  ʵ�ּ������еļӼ��˳��������ļ���
  + - * / %
  ʵ��˼·��
     1.ѡ���������ݴӼ�������
	 2.ʹ��switch�������ж�
	 3.��Ҫ�ӿ���̨��������
	     *��һ������
		 *�����
		 *�ڶ�������

  �����ڿ���̨��������һ��������
      ��ӭʹ�ü򵥼�����ϵͳ��
	  �������һ�����֣�10
	  �������������+ - * / %
	  ������ڶ������֣�20
	  ��������10 + 20 = 30
*/
public class SwitchTest04
{
	public static void main(String[] args){
	
	     System.out.println("��ӭʹ�ü򵥼�����ϵͳ");
		 java.util.Scanner s = new java.util.Scanner(System.in);
		 System.out.print("�������һ�����֣�");
		 int a = s.nextInt();
		 System.out.print("��������Ҫ���ļ��㣺");
		 String operator = s.next();
		 System.out.print("������ڶ������֣�");
		 int b = s.nextInt();		 
		 switch (operator)
		 {
		 case "+":
			 System.out.println(a+ "+"+ b + "=" +(a + b));
		 break;
		 case "-":
			 System.out.println(a+ "-"+ b + "=" +(a - b));
		 break;
		 case "*":
			 System.out.println(a+ "*"+ b + "=" +(a * b));
		 break;
		 case "/":
			 System.out.println(a+ "/"+ b + "=" +(a / b));
		 break;
		 case "%":
			 System.out.println(a+ "%"+ b + "=" +(a % b));
		 break;
		 default :
			 System.out.println("����������ֿ��ܲ��Ϸ�");
		 }//�ɸ�������int rusult = 0;
		  // ����ӡ����ʽ �����if�ĵ�һ����

	}
}

		 