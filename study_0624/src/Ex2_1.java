
public class Ex2_1 {

	public static void main(String[] args) {
		// super() - ������ ������
		// ������ �����ڸ� ȣ���� �� ���
		// ������ ����� ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ

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
		super(x, y);	// ����Ŭ������ ������Point(int x, int y)�� ȣ��
		this.z = z;		// �ڽ��� ����� �ʱ�ȭ
	}
}