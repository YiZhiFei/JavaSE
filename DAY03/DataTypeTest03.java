
/*
  ����Java���Ե��е�char���ͣ�
     ת���ַ� \
*/
public class DataTypeTest03
{
	public static void main(String[] args){
	    
		//��ͨ��n�ַ�
		char c1 = 'n';
		System.out.println(c1);

		//����ĿĿǰ��ѧ֪ʶ�����³����޷�����ͨ������Ϊ��Ȼ��һ���ֽڴ����������õ�����������
		//���Ǿ������룬���ֱ���ͨ���ˣ���˵�����²�����һ���ַ��������ǡ�һ�����ַ�
		//����һ�������з���������char���͵�����
		//��б����Java���Ե��о���ת�幦��
		char c2 = '\n'

		/*
        System.out.println("Hello");
		System.out.println("World");
		*/

		//System.out.println()��System.out.println���֮���У�print��ʾ��������ǲ�����
		/*
		System.out.print("Hello")
		System.out.println("World!");
		*/

		System.out.print("A");
		System.out.print(c2);
		System.out.println("B");

		//��ͨ��t�ַ�
		char x = 't';
		System.out.println(x);

		//�Ʊ��tab(����ͨ�ո�һ����)
		char y = '\t'
		System.out.print("A");
		System.out.print(y);
		System.out.print("B");

		//Ҫ���ڿ���̨���������б�ܷ���

		//��б�ܽ�����ĵ�����ת��ɲ��߱����⺬�����ͨ�������ַ�
		//��ߵĵ�����ȱ���˽����ĵ������ַ������뱨��
		/*
		char k ='\';
		Systemout.println(k);
		*/

		/*
		
		���ͣ���һ����б�ܾ���ת�ƹ��ܣ�������ķ�б��ת��λ��ͨ�ķ�б���ַ���
		���ۣ���Java����������б�ܴ���һ����ͨ�ķ�б���ַ�
		
		*/
		char k = '\\';
		System.outprintln(k);

		//�ڿ���̨�����һ����ͨ�ĵ������ַ�
		//Java�в�����������д���򣬱��뱨��
		//char a = '';

		//���±��뱨����һ�������ź͵ڶ�����������Զ������ĵ������Ҳ�����һ�����
		//����������ʦ�Ķ�̫�ɰ��ˣ�
        //char a = '''
		//System.out.println(a);

		//��б�ܾ���ת�幦�ܣ����ڶ���������ת������ͨ�ĵ������ַ�����һ�������ź����������Զ���
		char a ='\'';
		System.out.println(a);
		
		char f = '"';
		System.out.ptintln(f);

		System.out.println("HelloWorld!");
		System.out.ptintln("��HelloWorld!��")//������˫���ŵ�����������˫����λ����˫����

		//�������
		//System.out.ptintln(""HelloWorld!"");
		//����
		System.out.println("\"HelloWorld!\"");

		char m = '��'
		System.out.println(m);

		//JDK���Դ���native2ascii.exe������Խ�����ת����unicode������ʽ
		//��ôʹ��������
		//����������native2ascii���س���Ȼ����������֮��س����ɵõ�unicode����

        char g = 'u4e2d';
		//System.System.System.System.System.System.System.
		System.out.println(g);

		//char���͵�Ĭ��ֵ�ǣ�\u0000��
	}
}

/*
  ʮ���ƣ�0 1 2 3 4 5 6 7 8 9 10
  �����ƣ�0 1 10 11 100 101......
  ʮ�����ƣ�0 1 2 3 4 5 6 7 8 9 a b c d e f 10 11 12 13 14 15 16 17 18 19 1a 1b 1c 1d 1e 1f 20......
  �˽��ƣ�0 1 2 3 4 5 6 7 10 11 12 13 14 15 16 17 20......

*/