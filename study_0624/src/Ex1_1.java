
public class Ex1_1 {

	public static void main(String[] args) {
		// �������� super
		// ��ü �ڽ��� ����Ű�� ��������. �ν��Ͻ� �޼��峻������ ����.
		// ������ ����� �ڽ��� ����� ������ �� ���

		Child c = new Child();
		c.method();
	}

}
class Parent { 
	int x = 10;		//super.x
	
}

class Child extends Parent {
	int x = 20;		//this.x
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}