package study_0718;

public class Ex8 {

//���ٽ�
	public static void main(String[] args) {
//		Object obj = (a, b) -> a > b ? a : b;	//���ٽ�. �͸�ü
//		MyFunction obj = new MyFunction() {
//			public int max(int a, int b) {	//�������̵� - ���������ڴ� ���� ���ٲ۴�.
//				return a > b? a: b;
//			}
//		};

		// ==
		// ���ٽ�(�͸�ü)�� �ٷ�� ���� ���������� Ÿ���� �Լ��� �������̽��� �Ѵ�.
		MyFunction f = (a, b) -> a > b ? a : b; // ���ٽ�. �͸�ü

		int value = f.max(3, 5); // �Լ��� �������̽�
		System.out.println("value=" + value);
	}

}

//�Լ����������̽�
@FunctionalInterface // @FunctionalInterface <- �Ⱥ��̸� �߻� �޼��尡 2���̻��̿��� ������ �ȶ�
interface MyFunction {
//	public abstract int max(int a, int b);		//�Լ��� �������̽��� �� �ϳ��� �߻� �޼��常 ��������.
	int max(int a, int b); // public abstract ��������(�������̽��� ��� �޼���� public�� abstract�̿���.
}