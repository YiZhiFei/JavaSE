/*
   ����return���
       * ����return�ؼ��ֵ�java���ֻҪִ�У����ڵķ���ִ�н�����
	   
	   * ��ͬһ���������У�return������治�ܱ�д�κδ��룬��Ϊ��Щ������Զ��ִ�в�����
	   ���Ա��뱨��
*/
public class MethodTest09
{
	public static void main(String[] args){
		int retValue = m();
		System.out.println(retValue);
		//Ҳ�������� System.out.println(m());
	
	}
	/*
	public static int m(){
	    int a  =10;
		if(a >3){
		    return 1;//û�а취��֤���return100%ִ�У����Ա��뱨��ȱ�ٷ�����䡣
		}
	}*/

	//���³�����Ա�֤return1����return0ִ��
	public static int m(){
	   int a = 10;
	   if(a > 3){
	      return 1;
		  //System.out.println("Hello!");
		  //������󣬲�ִ�У���Ϊ�޷����ʵ�
	   } 
	      //System.out.println("Hello!");
		  //����ͨ������⣩
	    else{		  
	      return 0;
	   }
	}
	/*//�����Ϸ�����ȫ��ͬ
	public static int m(){
	   int a = 10;
	   if(a > 3){
	      return 1;
	   }
	      return 0;
	}*/
	public static int m(){
	   return 10>3 ? 1 : 0;	
	}
}