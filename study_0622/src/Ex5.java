public class Ex5 {

	public static void main(String[] args) {
		//	static�޼���� �ν��Ͻ� �޼���
		
	}
	
}
class MyMath2 {
	long a, b;	//�ν��Ͻ� ����(Ŭ���� ��ü�� ���o)
	
	long add() {	//�ν��Ͻ� �޼���
		return a + b;
	}
	//�ν��Ͻ� ���(iv,im)�� ������� �ʴ� �޼��忡 static�� ���δ�.
	static long add(long a, long b) {		//Ŭ���� �޼���(static�޼���) // ��������
		return a + b;
	}
}

//---------------------------------------------------------------------------------

class MyMathTest2 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L,100L)); //Ŭ�����޼��� ȣ��(��ü�������� ȣ�� ����)
		MyMath2 mm = new MyMath2();		//1.�ν��Ͻ� ����
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add()); 	// 2.�ν��Ͻ��޼��� ȣ��(1~2 ��ü �����ؾ� ȣ�� ����)
	}
}