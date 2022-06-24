
public class Ex1_2 {

	public static void main(String[] args) {
		// 참조변수 super

		Child2 c = new Child2();
		c.method();
	}

}
class Parent2 { 
	int x = 10;		//super.x와 this.x 둘 다 가능
}

class Child2 extends Parent2 {
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}