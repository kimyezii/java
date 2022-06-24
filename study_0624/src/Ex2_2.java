
public class Ex2_2 {

	public static void main(String[] args) {
		// super() - 조상의 생성자
		// **생성자의 첫 줄에 반드시 생성자(super,this)를 호출해야 한다.**
		// 그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 삽입.
	}

}
class Point2 extends Object {
	int x;
	int y;
	
	Point2() {
		this(0,0);	//ok
	}
	
	Point2(int x, int y) {
		super();	//Object();  ok
		this.x = x;
		this.y = y;
	}
}
