package study_0718;

public class Ex8 {

//람다식
	public static void main(String[] args) {
//		Object obj = (a, b) -> a > b ? a : b;	//람다식. 익명객체
//		MyFunction obj = new MyFunction() {
//			public int max(int a, int b) {	//오버라이딩 - 접근제어자는 좁게 못바꾼다.
//				return a > b? a: b;
//			}
//		};

		// ==
		// 람다식(익명객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		MyFunction f = (a, b) -> a > b ? a : b; // 람다식. 익명객체

		int value = f.max(3, 5); // 함수형 인터페이스
		System.out.println("value=" + value);
	}

}

//함수형인터페이스
@FunctionalInterface // @FunctionalInterface <- 안붙이면 추상 메서드가 2개이상이여도 에러가 안뜸
interface MyFunction {
//	public abstract int max(int a, int b);		//함수형 인터페이스는 단 하나의 추상 메서드만 가져야함.
	int max(int a, int b); // public abstract 생략가능(인터페이스의 모든 메서드는 public과 abstract이여서.
}