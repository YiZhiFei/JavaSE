//������
public class OOTest02
{
	public static void main(String[] args){
	     
		 //����User����
		 //u�Ǿֲ�����
		 //u��һ������
		 //u�����ڴ��ַֻ����ڴ��User����
		 User u = new User();

		 //���Sser�����ڲ�ʵ��������ֵ
		 System.out.println(u.no);//0
		 System.out.println(u.name);//null
		 System.out.println(u.addr);//null

		 //�޸�User�����ڲ�ʵ��������ֵ
		 u.no = 110;
		 u.name = "jack";//�ַ����Ǹ���������newҲ���Դ�������
		 u.addr = new Address();

		 //��main��������Ŀǰֻ�ܿ���һ�����á�u��
		 //һ�ж���ֻ��ͨ��u�����з���
		 System.out.println(u.name + "��ס�ĳ���"+ u.addr.city);
		 System.out.println(u.name + "��ס�Ľֵ�"+ u.addr.street);
		 System.out.println(u.name + "��ס���ʱ���"+ u.addr.zipcode);
         
		 //������һ���������������Ǿֲ�����Ҳ������ʵ��������

	}
}