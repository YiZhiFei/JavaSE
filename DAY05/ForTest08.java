/*
   ʹ��forѭ������žų˷���:
      
	  1*1=1
	  2*1=2 2*2=4
	  3*1=3 3*2=6 3*3=9
	  4*1=4 4*2=8 4*3=12 4*4=16
	  ...........
*/
public class ForTest08
{
	public static void main(String[] args){
	     
       for(int i =1;i <=9;i++){//���ѭ��9��
      	   
		   //i���к�
		   //System.out.println(i);

		   //ѭ���嵱�еĳ�����Ҫ��������ʲô��
		   //����ǰ�У�����ǰ�������е���Ŀȫ�����
		   for(int j = 1;j <= i;j++){
		      System.out.print( i + "*" + j + "=" + i*j + " ");
		   }		   
           System.out.println();
	   }           
	}
}
