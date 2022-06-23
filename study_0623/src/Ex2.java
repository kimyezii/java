
public class Ex2 {

	public static void main(String[] args) {
		// 참조변수 this
		//인스턴스 자신을 가리키는 참조변수
		//인스턴스 메서드(생성자 포함)에서 사용 가능 (클래스메서드X)
		//지역변수와 인스턴스변수를 구별할 때 사용
	}

}
class Car2 {
	String color;		
	String gearType;	
	int door;			
	
	Car2(String color, String gearType, int door) {
//			iv					  lv
		this.color 		= 		color;
		this.gearType 	= 		gearType;
		this.door	    = 		door;
	}
}