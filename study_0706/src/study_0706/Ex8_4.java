package study_0706;

public class Ex8_4 {

	public static void main(String[] args) {
		method(true);
		System.out.println("");
		method(false);

	}

	static void method(boolean b) {

		try {
			System.out.println(1);
			if (b)
				throw new ArithmeticException();
			System.out.println(2); // ���ܰ� �߻��ϸ� ������� �ʴ� ����
		} catch (RuntimeException r) {
			System.out.println(3);
			return; // .(finally ) �޼��带 ���������� ���� ������ �Ŀ�
		} catch (Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5); // ���ܹ߻����ο� ������� �׻� ����Ǵ� ����
		}
		System.out.println(6);

	}

}
