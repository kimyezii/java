
//  예외발생시키기
public class Ex3 {

	public static void main(String[] args) {
//		throw new RuntimeException();		//Exception을 고의로 발생시킨다.
		try {	//Exception과 그 자손은 반드시 예외처리를 해줘야 한다.(필수)
			throw new RuntimeException();		
			
		} catch(Exception e) {
			
		}
		
		throw new RuntimeException();	//RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 된다.(선택)
	}

}