/*
   ����ϵͳ���������ɼ������жϸÿ����ĳɼ��ȼ�
     
	 1.��Ч�ɼ���Χ��0-100��
	 
	 2.���Գɼ����ܴ���С��
	 
	 3.���Գɼ��͵ȼ�֮��Ķ��չ�ϵ��
	      [90-100]   A
		  [80-90)    B
		  [70-80)    C
		  [60-70)    D
		  [0-60)     E
   
	 4.��������������switch�����ɣ����ܲ���if

*/
public class SwitchTest05
{
	public static void main(String[] args){
	
	System.out.println("��ӭʹ�óɼ��ȼ�ϵͳ��");
	
	//�����ɼ�
	double score = 95.5;

	//ת����int
	int grade = (int)(score / 10);

	switch (grade)
	{
	case 9:case 10:
		System.out.println("A");
	case 8:
		System.out.println("B");
	case 7:
		System.out.println("C");
    case 6:
		System.out.println("D");
    default :
		System.out.println("E");
	
	}

	}
}
