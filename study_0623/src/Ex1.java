
public class Ex1 {

	public static void main(String[] args) {
		// 생성자 this()
		//생성자에서 다른 생성자 호출할 때 사용
		//다른 생성자 호출시 첫 줄에서만 사용가능
		
	}

}
class Car {
	String color;		//색상
	String gearType;	//변속기 종류 - auto(자동),manual(수동)
	int door;			//문의 개수
	
	Car() {
//		door = 5;		//에러
		this("white", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
//		Car(color, "auto", 4);		//에러
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}