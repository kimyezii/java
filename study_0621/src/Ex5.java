
public class Ex5 {

	public static void main(String args[]) {
		//�޼���ȣ��
		
		MyMath mm = new MyMath();	//1.�ν��Ͻ� ����
		//2.�޼��� ȣ��
		long result1 = mm.add(5L, 3L); //add�޼��� ȣ�� long add(long a, long b) 4.�� ����
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		long result = mm.max(5,3);//���߿� ū ���� ��ȯ�ϴ� �޼���
		System.out.println("max(5L, 3L) = " + result);
		//5.���
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

//�޼���� Ŭ������������ ���� ����.
 class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;	//3.ȣ���� �ް� �۾��� ��ġ�� �ٽ� ȣ���� ������ ����
	// return a + b;	// ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
	
	//�� ���� �޾Ƽ� ���߿� ū ���� ��ȯ�ϴ� �޼���
	long max(long a, long b) {
//		long result = 0;
//		if(a>b) {
//			result = a;
//		}else {
//			result = b;
//		}
//		return result;
		//==
		return a > b ? a : b;
	}
	
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
