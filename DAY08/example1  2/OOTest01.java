
/*
     ����Ĵ�����ʹ��
*/
public class OOTest01
{
	public static void main(String[] args){
	
	//int�ǻ�����������
	//i��һ��������
	//10��һ��int���͵�����ֵ
	int i = 10;

	//ͨ��һ�������ʵ����n������
	//ʵ����������﷨��new ����();
	//new��java���Ե��е�һ�������
	//new������������Ǵ���������JVM���ڴ浱�п����µ��ڴ�ռ�
	//�������ڴ棺������ص�ʱ��class�ֽ������Ƭ�α����ص����ڴ�ռ䵱�С�
	//ջ�ڴ棨�ֲ�����������������Ƭ��ִ�е�ʱ�򣬻���÷��������ڴ�ռ䣬��ջ�ڴ���ѹջ��
	//���ڴ棺new�Ķ����ڶ��ڴ��д洢
	//Student��һ��������������
	//s��һ��������
	//new Student()��һ��ѧ������
	//s��һ���ֲ���������ջ�ڴ��д洢��
	//ʲô�Ƕ���new������ڶ��ڴ��п��ٵ��ڴ�ռ��Ϊ����
	//ʲô�����ã�������һ��������ֻ�������������������һ��java������ڴ��ַ��
	//Java���Ե��У�����Ա����ֱ�Ӳ������ڴ棬java��û��ָ�롣����c���ԡ�
	//Java���Ե��У�����Աֻ��ͨ�������á�ȥ���ʶ��ڴ浱�ж����ڲ���ʵ��������
   Student s = new Student();

   //����ʵ���������﷨��ʽ
   // ��ȡ���ݣ� ����.������
   // �޸����ݣ� ����.������ = ֵ
   int stuNo = s.no;
   String stuName = s.name;
   int stuAge = s.sex;
   boolean stuSex = s.sex;
   String stuAddr = s.addr;

   System.out.println("ѧ�� =" + stuNo);//0
   System.out.println("���� =" + stuName);//null
   System.out.println("���� =" + stuAge);//0
   System.out.println("�Ա� =" + stuSex);//false
   System.out.println("סַ =" + stuAddr);//null
   
   s.no = 10;
   s.name = "jack";
   s.age = 20;
   s.addr = "����";

    //��ͨ����ʵ����һ��ȫ�µĶ���
   //stu��һ������
   //stuͬʱҲ��һ���ֲ�����
   //Student�Ǳ�������������
   Student stu = new Student();

   System.out.println(stu.no);//0
   System.out.println(stu.name);//null
   System.out.println(stu.sex);//0
   System.out.println(stu.age);//false
   System.out.println(stu.addr);//null

   //���뱨��no���ʵ����������ֱ�Ӳ��á��������ķ�ʽ���ʡ����� ����.ʵ��������
   //��Ϊno��ʵ�����������󼶱�ı����������洢��java������ڲ����������ж���
   //System.out.println(Student.no);
	}
}
/*
   �ֲ�������ջ�ڴ��д洢
   ��Ա�����е�ʵ�������ڶ��ڴ��java�����ڲ��洢����ͼ��

   ʵ��������һ������һ�ݣ�100��������100�ݡ�

*/