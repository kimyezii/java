//  ��������������ȯ
		// ����� �� �ִ� ����� ������ �����ϴ� ��
		// ����, �ڼ� ������ ���������� ���� ����ȯ ����

public class Ex4 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();	//���� �ν��Ͻ��� ���������� �߿�.
		
		FireEngine fe2 = (FireEngine)car;	//���� -> �ڼ� ���� ����ȯ
		Car car2 = (Car)fe2;				//�ڼ� -> ���� ���� ����ȯ
		
//		fe.water();
//		car = fe;	// car = (Car)fe; ���� ����ȯ�� ������
////		car.water();	//����. CarŸ���� ���������δ� water()�� ȣ���� �� ����.
//		fe2 = (FireEngine)car;	//�ڼ�Ÿ�� <- ����Ÿ��. ����ȯ ���� �Ұ�
//		fe2.water();
	}

}
class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("Stop!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("Water!");
	}
}