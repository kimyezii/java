class Point2 {
	int x;
	int y;
}

//class Circle extends Point2{	//상속
//	int r;
//}

class Circle {		//포함-클래스의 멤버로 참조변수를 선언하는 것
	Point2 p = new Point2();		//참조변수 초기화
	int r;
}
public class Ex5_1 {

	public static void main(String[] args) {
		// 상속
//		Circle c = new Circle();
//		c.x = 1;
//		c.y = 2;
//		c.r = 3;
//		System.out.println("c.x="+c.x);
//		System.out.println("c.y="+c.y);
//		System.out.println("c.r="+c.r);
				
		//포함
		Circle c = new Circle();
		c.p.x = 1;
		c.p.y = 2;
		c.r = 3;
		System.out.println("c.p.x="+c.p.x);
		System.out.println("c.p.y="+c.p.y);
		System.out.println("c.r="+c.r);
		
		
		
	}
}
