
public class ExceptionTest {

	public static void main(String[] args) {
		// try-catch���� �帧ch08_4
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	//ArithmeticException ���ܹ߻� -> ù��° catch�� ��
			System.out.println(4);		//������� �ʴ´�.
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		//	catch�� ����� try-catch�� ������ ��
		} catch (Exception e) {
			System.out.println("Exception");
		}	//try-catch�� ��
		
		System.out.println(6);

	}

}
   