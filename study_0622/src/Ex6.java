public class Ex6 {

	public static void main(String[] args) {
		//	메서드 간의 호출과 참조
		
	}
	
}
// static 메서드는 인스턴스 변수(iv)를 사용할 수 없다.
// static 메서드는 인스턴스 메서드(im)를 호출할 수 없다.

class TestClass2 {
	int iv;				//인스턴스 변수	/ 객체 생성 후 사용가능
	static int cv;		//클래스 변수	/ 언제나 사용 가능
	
	void instanceMethod() {			//인스턴스 메서드	/ 객체 생성 후 호출 가능
		System.out.println(iv);		//인스턴스 변수를 사용할 수 있다.
		System.out.println(cv);		//클래스 변수를 사용할 수 있다.		/언제든 사용가능
	}
	
	static void staticMethid() {	//static메서드
//		System.out.println(iv);		//에러! 인스턴스 변수를 사용할 수 없다.
		System.out.println(cv);		//클래스 변수는 사용할 수 있다.		/언제든 사용가능
	}
}	//end of class


//static메서드는 static메서드 호출 가능.
//static메서드는 인스턴스 변수 사용 불가능.
//static메서드는 인스턴스 메서드 호출 불가능. 
//-> static메서드 호출시 객체(iv묶음)가 없을 수도 있어서.