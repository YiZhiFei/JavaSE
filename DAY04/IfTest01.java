/*
  ����java���Ե��е�if��䣬����ѡ��ṹ��if����ֱ���Ϊ��֧���/�����������
    1.if�����﷨�ṹ�����ֱ�д��ʽ
	     ��һ�֣�
		     if(�������ʽ){
			    java���;
				java���;
				java���;
				java���;
				.....
				}
	     �ڶ��֣�
		     if(�������ʽ){
				 java���;
				 java���;
			}else{
				 java���;
				 java���;
				 ......}
	     �����֣�
		     if(�������ʽ){
                 java���;
				 java���;
				 java���;
				 ....
			 }else if(�������ʽ){
				 java���;
				 java���;
				 ......
			 }else if(�������ʽ){
				 java���;
				 java���;
				 ......
			 }else if(�������ʽ){
				 java���;
				 java���;
				 ......

			 }
				 ......
		 �����֣�
		     if(�������ʽ){
                 java���;
				 java���;
				 java���;
				 ....
			 }else if(�������ʽ){
				 java���;
				 java���;
				 ......
			 }else if(�������ʽ){
				 java���;
				 java���;
				 ......
			 }else if(�������ʽ){
				 java���;
				 java���;
				 ......
			
			 }else{
				 java���;
				 java���;
				 ......
			 }

   2.�ص㣺����java�е�if�����˵��ֻҪ��һ����ִ֧�У�����if ���ȫ��������
   3.ע�⣺���ϵĵڶ��б�д��ʽ�͵����ֱ�д��ʽ������else��֧�������ַ�ʽ����100%�ı�֤
           ���з�ִ֧�С�
   4.���п�����䶼�ǿ���Ƕ��ʹ�õģ�ֻҪ����Ƕ�׾��С�
         ע�⣺ Ƕ��ʹ�õ�ʱ�򣬴����ʽҪ��֤����������������ʱ��Ҫ������
		       ���󲿷������ʹ�ô����Ű�Χ����Ҫ������

   5.if���ķ�֧��ֻ��һ��java���Ļ��������ſ���ʡ�Բ�д��
     ��1�� if(true){
		  һ��java���;
	  }
     ��2�� if(true)һ��java���;���ַ�ʽ���Ƽ���������ôд�������С�

*/
public class IfTest01
{
	public static void main(String[] args){
	      
        //��������λ�õ��幫�ﷶΧ֮�������͵Ļ�,ȥ���ų��緹
		//������
		double distance = 6.0;//��λKM
		//�ж����
		if(distance < 5){
		    System.out.println("ȥ���ųԷ���");
		}
/*
    ����
	      ����ϵͳ����һ�������ĳɼ����ɼ����ܴ���С����
		  ����ѧ���ĳɼ��жϸ�ѧ���ĳɼ��ȼ���
		  [90-100] A
		  [80-90]  B
		  [70-80]  C
		  [60-70]  D
		  [0-60]   E

	 ���ϵ��߼��жϲ���if�����ɣ�Ӧ����ôд��
*/
/*�Լ���Ĵ���
       double grade = 90;
	   if (grade >= 90)
	   {
		   System.out.println('A');
	   }
	   else if (grade >= 80){
		   System.out.println('B');
	   }
	   else if (grade >= 70){
		   System.out.println('C');
	   } 
	   else if (grade >= 60){
		   System.out.println('D');
	   }
	   else{
	       System.out.println('E');
	   }
*/
     //��ʦ��д�Ĵ���
	 if (score < 0 || score > 100){
		 System.out.println ("�Բ������ṩ�Ŀ����ɼ����Ϸ�");
	 }
	 else if ( score >= 90 )
	 {
		 System.out.println("�ÿ����Ŀ��Գɼ��ȼ��ǣ�A�ȼ�");
	 }
	 else if ( score >= 80 )
	 {
		 System.out.println("�ÿ����Ŀ��Գɼ��ȼ��ǣ�B�ȼ�");
	 }
	 else if ( score >= 70 )
	 {
		 System.out.println("�ÿ����Ŀ��Գɼ��ȼ��ǣ�C�ȼ�");
	 }
	 else if ( score >= 60)
	 {
		 System.out.println("�ÿ����Ŀ��Գɼ��ȼ��ǣ�D�ȼ�");
	 }
	 else ( score <60 )
	 {
		 System.out.println("�ÿ����Ŀ��Գɼ��ȼ��ǣ�E�ȼ�");
	 }

	 //�����Ż�
	 String grade = ("�ÿ����Ŀ��Գɼ��ȼ��ǣ�E�ȼ�");
	 if (score < 0 || score > 100){
		 grade = "�Բ������ṩ�Ŀ����ɼ����Ϸ�";
	 }
	 else if ( score >= 90 )
	 {
		  grade ="�ÿ����Ŀ��Գɼ��ȼ��ǣ�A�ȼ�";
	 }
	 else if ( score >= 80 )
	 {
		 grade ="�ÿ����Ŀ��Գɼ��ȼ��ǣ�B�ȼ�";
	 }
	 else if ( score >= 70 )
	 {
		 grade ="�ÿ����Ŀ��Գɼ��ȼ��ǣ�C�ȼ�";
	 }
	 else if ( score >= 60)
	 {
		 grade ="�ÿ����Ŀ��Գɼ��ȼ��ǣ�D�ȼ�";
	 }
	 else ( score <60 )
	 {
		 grade ="�ÿ����Ŀ��Գɼ��ȼ��ǣ�E�ȼ�";
	 }
	 System.out.println(grade);
      
	}
}
	

		      