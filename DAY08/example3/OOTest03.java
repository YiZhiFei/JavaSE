public class OOTest03
{
	public static void main(String[] args){
	   
	    User u = new User();
		
		//��һ���汾��д��
		//u.addr = new Address();

		//a������
		//a�Ǿֲ�����
		Address a = new Address();
		u.addr = a;

		System.out.println(u.addr.city);//null

		a.city = "���";

		System.out.println(u.addr.city);//���
		//Ҫ����ڴ�ͼ������
	}
}