/*
    ��ǰһ������Ļ���֮�ϣ�����1~100���������ĺ�

*/
public class ForTest05
{
	public static void main(String[] args){
	   
	   int sum = 0;//��һ��ʼ��Ϊ0
	   for(int i=1;i <=100;i +=2){
	        //iһ��������
			//�ۼ����
			
			//����һ�����������ӡ�
			//int sum = 0;λ�÷Ŵ��ˣ�ÿ�ζ������
			sum += i;
           
			//������ŵ������ʾÿѭ�����������һ������
			//System.out.println("sum = " + sum);

	   }
	   
	   //���ϵ�forѭ������֮�����������͵Ľ��
	   System.out.println("sum = " + sum);

	   //=======================================================================
	   //����
	   sum = 0;

	   for(int i =1;i <=100;i ++){
	       if(i % 2 !=0){//������
		       sum += i;//���ۼ����
		   }
	   }
	    System.out.println(sum);
	}
}