class MyPoint {
	int x;
	int y;
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class MyPoint3D extends MyPoint {
	int z;
	
	String getLocation() {
		return "x :" + x + ", y :" + y + ", z :" + z;
	}
}
public class Ex7 {
	public static void main(String[] args) {
		//오버라이딩
		MyPoint3D p = new MyPoint3D();
		p.x = 3;
		p.y = 5;
		p.z = 7;
		System.out.println(p.getLocation());
	}

}



