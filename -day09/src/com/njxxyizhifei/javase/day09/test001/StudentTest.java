package com.njxxyizhifei.javase.day09.test001;
/**
 * ѧ��������
 * @author WeiJiaHui
 *
 */
//main�����Զ���ȫ
//����main,Ȼ��alt+ /,�س�
public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.no);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.addr);
		System.out.println(s.sex);
		s.no = 10;
		s.name = "����";
		System.out.println("ѧ�ţ�"+s.no);
		System.out.println("������"+s.name);
		
		//����ѧ������
		Student Lisi = new Student();
		Lisi.name =  "����";
		System.out.println(Lisi.name);
				
		

	}

}