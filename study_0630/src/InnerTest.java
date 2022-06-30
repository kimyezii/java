// 내부클래스_ch07

class AAA {		//AAA는 BBB의 외부 클래스
	int i = 100;
	BBB b = new BBB();
	
	
	class BBB {		//BBB는 AAA의 내부클래스
		void method() {
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i);	//객체 생성없이 외부 클래스의 멤버에 접근가능.
		}
	}
	
}


//class CCC {
//	BBB b = new BBB();
//}




public class InnerTest {

	public static void main(String[] args) {
//		BBB b = new BBB();	//외부 클래스의 객체를 먼저 생성해야함.
//		b.method();
		
		AAA a = new AAA();
		a.b.method();
		
	}

}
