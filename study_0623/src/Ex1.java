
public class Ex1 {

	public static void main(String[] args) {
		// ������ this()
		//�����ڿ��� �ٸ� ������ ȣ���� �� ���
		//�ٸ� ������ ȣ��� ù �ٿ����� ��밡��
		
	}

}
class Car {
	String color;		//����
	String gearType;	//���ӱ� ���� - auto(�ڵ�),manual(����)
	int door;			//���� ����
	
	Car() {
//		door = 5;		//����
		this("white", "auto", 4);
	}
	
	Car(String color) {
		this(color, "auto", 4);
//		Car(color, "auto", 4);		//����
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}