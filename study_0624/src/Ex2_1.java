
public class Ex2_1 {

	public static void main(String[] args) {
		// super() - 조상의 생성자
		// 조상의 생성자를 호출할 때 사용
		// 조상의 멤버는 조상의 생성자를 호출해서 초기화

	}

}
class Point {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
class Point3D extends Point {
	int z;
	
	Point3D(int x, int y, int z) {
		super(x, y);	// 조상클래스의 생성자Point(int x, int y)를 호출
		this.z = z;		// 자신의 멤버를 초기화
	}
}