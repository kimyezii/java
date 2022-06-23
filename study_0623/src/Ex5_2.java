class Point3 extends Object {
	int x;
	int y;
}

class Circle3 extends Object {	
	Point3 p;		
	int r;
	
	Circle3() {
		p = new Point3();
	}
}

public class Ex5_2 {

	public static void main(String[] args) {
		Circle3 c = new Circle3();
		System.out.println(c.toString());
		System.out.println(c);
		
		
	}
}
