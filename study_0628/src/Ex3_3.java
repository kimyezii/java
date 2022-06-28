public class Ex3_3 {

	public static void main(String[] args) {
		// �߻�Ŭ�������ۼ�1
		//���� Ŭ������ ���������� ���� �� �ִ� �߻�Ŭ������ �ٷ� �ۼ��ϰų�
		//���� Ŭ������ <���� �κ�>�� �̾Ƽ� �߻�Ŭ������ �����.
		
//		Unit[] group = { new Marine(), new Tank(), new Dropship() };
//		==
		Unit[] group = new Unit[3];		//��ü�迭: �������� ���� ��
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		
		//group�� Ÿ���� Unit[], group[0], group[1], group[2]�� Ÿ���� Unit
		group[0].move(100,200);		//Marine��ü�� move(100,200)�� ȣ��
		group[1].move(100,200);		//Tank��ü�� move(100,200)�� ȣ��
		group[2].move(100,200);		//Dropship��ü�� move(100,200)�� ȣ��
//		��������
		
		for(int i = 0; i <group.length; i++)
			group[i].move(100,200);
	}

}
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {	/* ���� ��ġ�� ���� */}
}
	
class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}

	void stimPack() {	/* �������� ����Ѵ�. */}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}

	void changeMode() {	/* ���ݸ�带 ��ȯ�Ѵ�. */}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	
	void changeMode() {	/* ���ݸ�带 ��ȯ�Ѵ�. */}
}
















