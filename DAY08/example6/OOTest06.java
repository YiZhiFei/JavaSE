/*
    ����

	    ����һ��������ࡾ����/�ʼǱ��������������Щ���ԣ�
		 * Ʒ��
		 * �ͺ�
		 * ��ɫ

		����һ��ѧ���࣬ѧ��������Щ���ԣ�
		 * ѧ��
		 * ����
		 * ѧ����һ̨�ʼǱ�����
		
		���д��������ʾ���ϵ��࣬Ȼ��ֱ��ഴ��Ϊ����
		�����������ޣ�Ȼ�������е�һ��ѧ��ȥʹ�����е�һ̨�ʼǱ����ԡ�

		Ȼ����벢���У����ҽ�����ִ�й��̲���ͼ�εķ�ʽ����������

*/
public class OOTest06
{
	public static void main(String[] args){
	      
		  Student s = new Student();

		  System.out.println(s.no);//0
		  System.out.println(s.name);//null
		  System.out.println(s.comp);//null		  
		  
		  s.no = 12;		  
		  s.name = "һֻ��";		  
		  //ѧ��ӵ��һ̨����
		  s.comp = new Computer(); 

		  s.comp.brand = "Thinkpad";
		  s.comp.model = "E475";
		  s.comp.color = "black";

		  System.out.println("ѧ��ѧ��" +"\n"+ s.no +"\n"+ "ѧ������" +"\n"+ s.name +"\n"+ "ӵ��" +"\n"+ s.comp.brand + "�ͺ�" +s.comp.model + "��ɫ" + s.comp.color);
	}
}