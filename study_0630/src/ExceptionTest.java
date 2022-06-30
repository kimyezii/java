
public class ExceptionTest {

	public static void main(String[] args) {
		// try-catch문의 흐름ch08_4
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	//ArithmeticException 예외발생 -> 첫번째 catch로 감
			System.out.println(4);		//실행되지 않는다.
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) {
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		//	catch문 벗어나서 try-catch의 끝으로 감
		} catch (Exception e) {
			System.out.println("Exception");
		}	//try-catch의 끝
		
		System.out.println(6);

	}

}
   