
public class Ex2_2 {

	public static void main(String[] args) {
		// super() - ������ ������
		// **�������� ù �ٿ� �ݵ�� ������(super,this)�� ȣ���ؾ� �Ѵ�.**
		// �׷��� ������ �����Ϸ��� �������� ù �ٿ� super();�� ����.
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
