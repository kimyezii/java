abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("����ϴ�.");}
}

interface Fightable {		//�������̽��� ��� �޼���� public abstract. ���ܾ���
	void move(int x, int y);	//public abstract�� ������
	void attack(Fightable f);	//public abstract�� ������
}

class Fighter extends Unit2 implements Fightable {
	//�������̵� ��Ģ : ����(public)���� ������������ ������ ������ �ȵ�.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]�� �̵�");
	}
	public void attack(Fightable f) {
		System.out.println(f + "�� ����");
	}
	
	//�ο� �� �ִ� ��븦 �ҷ��´�.
	Fightable getFightable() {
		Fighter f = new Fighter();	//Fighter�� �����ؼ� ��ȯ
		return f;
	}
}

public class Ex4 {

	public static void main(String[] args) {
		// �������̽�
		// �߻� �޼����� ����!! - ���
		// ������ ���� ���� ���� ���赵. ������(��� ����� public) - �ٽ�
		
//		interface �������̽��̸� {
//			public static final Ÿ�� ����̸� = ��;
//			public abstract �޼����̸�(�Ű��������);
//		} ��� �������̽��� ����� public, �޼���� �߻�޼���.
		
		Fighter f = new Fighter();	//Fighter�� �����ؼ� ��ȯ
		Fightable f2 = f.getFightable();
		
//		Fighter u = new Fighter();
//		Fightable f = new Fighter();
//		u.move(100, 200);
//		u.attack(new Fighter());	//Unit2���� attack()�� ��� ȣ��Ұ�
//		u.stop();
//		
//		f.move(100, 200);
//		f.attack(new Fighter());
////		f.stop();	//Fightable���� stop�� ��� ȣ��Ұ�
		
	}

}















