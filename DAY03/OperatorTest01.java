/*
   ����Java�����֮�����������
      +       ���
	  -       ���
	  *       �˻�
	  /       ��
	  %       ������

	  ++      �Լ�1
	  --      �Լ�1

  ע�⣺һ�����ʽ�����ж�������������������ȼ�����ȷ���ļ����ţ�С���ţ����ȼ�������
        û��Ҫר�ż�������������ȼ���
*/
public class OperatorTest01
{
	public satatic void main(String[] args){
	      
		  int i = 10;
		  int j = 3;
		  System.out.println( i + j );//13
		  System.out.println( i - j );//7
		  System.out.println( i * j );//30
		  System.out.println( i / j );//3
     	  System.out.println( i % j );//1

		  //����++��������Լ�1��
		  //������++Ϊ����--�������ѧ��
		  int k = 10;

          k ++;
		  //++��������Գ����ڱ������桾��Ŀ�������

		  System.out.println(k);//11

		  int y = 10;

		  //++��������Գ����ڱ������桾��Ŀ�������
		  ++ y;

		  System.out.ptintln(y);//11

		  //С�᣺
		  //++��������Գ����ڱ���ǰ��Ҳ���Գ����ڱ����������Ǳ���ǰ���Ǳ�����
		  //ֻҪ++����������ñ����е�ֵһ�����Լ�1

		  //++ �����ڱ�����
		  //����������ֵ���㣬�ٶԱ����б����ֵ�����Լ�1
		  int a = 100;
		  int b = a ++;
		  System.out.println(a);//101
		  System.out.ptintln(b);//100

		  //++ �����ڱ���ǰ
		  //�����Ƚ����Լ�1���㣬Ȼ���ٽ��и�ֵ����
		  int m = 20;
		  int n = ++ m;
		  System.out.println(m);//21
		  System.out.println(n);//21

		  int xx = 500;
		  System.out.println(xx);

		  int e = 100;
		  System.out.println(e ++);//100
		  System.out.println(e);//101

		  int s = 100;
		  System.out.println(++ s);//101
		  System.out.println(s);//101

		  System.out.println(--s);//100
		  System.out.println(s++);//100
		  System.out.println(s--);//101
		  System.out.println(s--);//100
		  System.out.println(s--);//99
		  System.out.println(s); //98

	}
}
/*
class A
{
    public void m(int x)//�����൱��int x = i(int���β�)
	{
	}
	main
	{
	     int i = 10;
		 m(i);
	}
}
*/