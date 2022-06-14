
public class PrintfEx2 {

	public static void main(String[] args) {

		System.out.printf("%d%n", 15); // 10 ���� 
		System.out.printf("%o%n", 15); // 8 ���� 
		System.out.printf("%x%n", 15); // 16 ����
		System.out.printf("%s%n", Integer.toBinaryString(15)); // 2���� ���ڿ�
		
		//�Ǽ�
		double f = 123.456789; // float & double
		System.out.printf("%f%n", f); //�Ǽ�
		System.out.printf("%e%n", f); //����
		System.out.printf("%g%n", f); //�Ҽ����� ������ 7�ڸ��� ǥ��
		
		//��°� ����
		System.out.printf("[%5d]%n",10);  // 5�ڸ� ���� ǥ��
		System.out.printf("[%-5d]%n",10); // ���� ����
		System.out.printf("[%05d]%n",10); // ���鿡 '0'���� ä��
		
		double d = 1.23456789;
		System.out.printf("%f%n", d);
		System.out.printf("%14.10f%n", d);
		
		//���ڿ� ������
		System.out.printf("[%s]%n","www.codechobo.com");
		System.out.printf("[%20s]%n","www.codechobo.com");
		System.out.printf("[%-20s]%n","www.codechobo.com");
		System.out.printf("[%-10s]%n","www.codechobo.com");

	}

}
