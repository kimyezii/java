public class Ex5 {

	public static void main(String[] args) {
		//	static메서드와 인스턴스 메서드
		
	}
	
}
class MyMath2 {
	long a, b;	//인스턴스 변수(클래스 전체에 사용o)
	
	long add() {	//인스턴스 메서드
		return a + b;
	}
	//인스턴스 멤버(iv,im)을 사용하지 않는 메서드에 static을 붙인다.
	static long add(long a, long b) {		//클래스 메서드(static메서드) // 지역변수
		return a + b;
	}
}

//---------------------------------------------------------------------------------

class MyMathTest2 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L,100L)); //클래스메서드 호출(객체생성없이 호출 가능)
		MyMath2 mm = new MyMath2();		//1.인스턴스 생성
		mm.a = 200L;
		mm.b = 100L;
		System.out.println(mm.add()); 	// 2.인스턴스메서드 호출(1~2 객체 생성해야 호출 가능)
	}
}