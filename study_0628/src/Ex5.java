class A {
	public void method(I i) {
		i.method();
	}
}

//B클래스의 선언과 구현을 분리
interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}
public class Ex5 {

	public static void main(String[] args) {
		//인터페이스의장점
		A a = new A();
		a.method(new B()); 		//A가 B를 사용(의존)
		a.method(new C()); 		//A가 B를 사용(의존)
	}

}















