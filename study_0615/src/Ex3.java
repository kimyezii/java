
public class Ex3 {

	public static void main(String[] args) {
		//����ȯ ������
/*	int -> char (char)65	���'A'
 *  char-> int	(int)'A'	��� 65
 *  float->int	(int)1.6f	��� 1	�Ǽ� -> ����
 *  int ->float (float)10	��� 10.0f 
 */
		
		
		//�ڵ� ����ȯ
/*	 byte b = 100;			byte����(-128~127)
 *   byte b = (byte)100; 	ok. byteŸ������ �ڵ� ����ȯ�Ͽ� ����
 *  
 *   int i = 100;
 *   byte b = i; ����. 	intŸ���� byte�� Ÿ�Կ� ����
 *   byte b = (byte)i; 	ok. byteŸ������ ���� ����ȯ�Ͽ� ����
 * */
		
	/* byte b = 1000;	���� byteŸ���� ����(-128~127)�� ��� ���� ����
	 * byte b = (byte)1000; 	ok.�׷��� �� �ս��� �߻��ؼ� ���� b���� -24�� �����
	 * */
		
		//�����ȯ
/*	int a = 1_000_000;	1�鸸
 *  int b = 2_000_000;	2�鸸
 *  
 *  long c = a * b;		2,000,000,000,000?
 *  System.out.println(c)	��� : -1454759936
 *  
 *  long c = (long)a * b;	
 * */		
		
	}

}
