//  참조변수의형변환
		// 사용할 수 있는 멤버의 갯수를 조절하는 것
		// 조상, 자손 관계의 참조변수는 서로 형변환 가능

public class Ex4 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();	//실제 인스턴스가 무엇인지가 중요.
		
		FireEngine fe2 = (FireEngine)car;	//조상 -> 자손 으로 형변환
		Car car2 = (Car)fe2;				//자손 -> 조상 으로 형변환
		
//		fe.water();
//		car = fe;	// car = (Car)fe; 에서 형변환이 생략됨
////		car.water();	//에러. Car타입의 참조변수로는 water()를 호출할 수 없다.
//		fe2 = (FireEngine)car;	//자손타입 <- 조상타입. 형변환 생략 불가
//		fe2.water();
	}

}
class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("Stop!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("Water!");
	}
}