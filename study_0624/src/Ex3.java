
public class Ex3 {

	public static void main(String[] args) {
		//  ������ - ���� Ÿ�� ���� ������ �ڼ� Ÿ�� ��ü�� �ٷ�� ��

		Tv t = new SmartTv();
//		�θ�		�ڽ�		= Ÿ�� ����ġ
//		SmartTv s = new Tv();	�ڼ�Ÿ���� ���������� ���� Ÿ���� ��ü�� ����ų �� ����.
	}

}
class Tv {
	boolean power;
	int channer;
	
	void power() {power = !power;}
	void channerUp() {++channer;}
	void channerDown() {--channer;}
}

class SmartTv extends Tv {
	String text;
	void caption() {}
}