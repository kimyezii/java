public class Ex6 {

	public static void main(String[] args) {
		//	�޼��� ���� ȣ��� ����
		
	}
	
}
// static �޼���� �ν��Ͻ� ����(iv)�� ����� �� ����.
// static �޼���� �ν��Ͻ� �޼���(im)�� ȣ���� �� ����.

class TestClass2 {
	int iv;				//�ν��Ͻ� ����	/ ��ü ���� �� ��밡��
	static int cv;		//Ŭ���� ����	/ ������ ��� ����
	
	void instanceMethod() {			//�ν��Ͻ� �޼���	/ ��ü ���� �� ȣ�� ����
		System.out.println(iv);		//�ν��Ͻ� ������ ����� �� �ִ�.
		System.out.println(cv);		//Ŭ���� ������ ����� �� �ִ�.		/������ ��밡��
	}
	
	static void staticMethid() {	//static�޼���
//		System.out.println(iv);		//����! �ν��Ͻ� ������ ����� �� ����.
		System.out.println(cv);		//Ŭ���� ������ ����� �� �ִ�.		/������ ��밡��
	}
}	//end of class


//static�޼���� static�޼��� ȣ�� ����.
//static�޼���� �ν��Ͻ� ���� ��� �Ұ���.
//static�޼���� �ν��Ͻ� �޼��� ȣ�� �Ұ���. 
//-> static�޼��� ȣ��� ��ü(iv����)�� ���� ���� �־.