class A {
	public void method(I i) {
		i.method();
	}
}

//BŬ������ ����� ������ �и�
interface I {
	public void method();
}

class B implements I {
	public void method() {
		System.out.println("BŬ������ �޼���");
	}
}

class C implements I {
	public void method() {
		System.out.println("CŬ������ �޼���");
	}
}
public class Ex5 {

	public static void main(String[] args) {
		//�������̽�������
		A a = new A();
		a.method(new B()); 		//A�� B�� ���(����)
		a.method(new C()); 		//A�� B�� ���(����)
	}

}















