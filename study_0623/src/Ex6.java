
public class Ex6 {

	public static void main(String[] args) {
		// �������̵� - ��ӹ��� ������ �޼��带 �ڽſ� �°� �����ϴ� ��.
		// = �����
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
	
	String getLocation() {		//�������̵�
		return "x :" + x + ", y :" + y + ", z :" + z;
		//����δ� ���� ���ϰ� ���븸 ���氡��.
	}
}