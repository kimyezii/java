
public class Ex3 {

	public static void main(String[] args) {
		//  다형성 - 조상 타입 참조 변수로 자손 타입 객체를 다루는 것

		Tv t = new SmartTv();
//		부모		자식		= 타입 불일치
//		SmartTv s = new Tv();	자손타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
	}

}
class Tv {
	boolean power;
	int channer;
	
	void power() {power = !power;}
	void channerUp() {++channer;}
	void channerDown() {--channer;}
}

class SmartTv extends Tv {
	String text;
	void caption() {}
}