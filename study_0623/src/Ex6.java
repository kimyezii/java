
public class Ex6 {

	public static void main(String[] args) {
		// 오버라이딩 - 상속받은 조상의 메서드를 자신에 맞게 변경하는 것.
		// = 덮어쓰다
	}

}
class Point {
	int x;
	int y;
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}


class Point3D extends Point {
	int z;
	
	String getLocation() {		//오버라이딩
		return "x :" + x + ", y :" + y + ", z :" + z;
		//선언부는 변경 못하고 내용만 변경가능.
	}
}