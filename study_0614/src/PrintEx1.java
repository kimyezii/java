
public class PrintEx1 {

	public static void main(String[] args) {
//		System.out.println(10.0/3);
//		�Ǽ��� �ڸ��� �����Ұ�
		
		//System.out.printf("%.2f", 10.0/3); //3.33 �Ҽ��� ��°�ڸ�
		System.out.printf("%d\n", 15); 	// 10���� ������ �������� ���
		System.out.printf("%o\n", 15);	//8����
		System.out.printf("%x\n", 15); // 16���� ������ �������� ���
//		8������ 16������ ���λ� ���̴� ��: "%#o", "%#x" -> '#'���̱�
		System.out.printf("%s\n", Integer.toBinaryString(15)); //�������ڿ��� ���
		
		System.out.printf("age:%d year:%d\n", 14, 2017);
		
		double f = 123.456789;
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%g\n", f);
		
		System.out.printf("[%5d]\n", 10); //5�ڸ� ���, 3�ڸ� ����
		System.out.printf("[%-5d]\n", 10); //��������
		System.out.printf("[%05d]\n", 10); // ������ 0���� ä��
		
		double d = 1.23456789;
		System.out.printf("%.6f\n", d);
		
		System.out.printf("[%s]\n", "www.codechobo.com");
		System.out.printf("[%20s]\n", "www.codechobo.com");
		System.out.printf("[%-20s]\n", "www.codechobo.com");
		System.out.printf("[%.10s]\n", "www.codechobo.com"); //10�ڸ�
		
	}

}
