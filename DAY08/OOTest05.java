//������
public class OOTest05
{
	public static void main(String[] args){
	      
		  Customer c = new Customer;
		  System.out.println(c.id);//0

		  //����ָ����ڴ��Customer
		  c = null;
		  //�����÷��ʡ�ʵ������ص�����һ������ֿ�ָ���쳣
		  //java.lang.NullPointerException
		  System.out.println(c.id);//�ᷢ��ɶ�������޴������쳣��
	}
}
//��ʵ������ص����ݱ�ʾ��������ݷ��ʵ�ʱ������ж���Ĳ��롣�������ݾ���ʵ����ص����ݡ�