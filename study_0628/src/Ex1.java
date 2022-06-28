
public class Ex1 {

	public static void main(String[] args) {
		// �Ű����������� ch07_8
		// ������ �Ű������� �޼��� ȣ���, �ڽŰ� ���� Ÿ�� �Ǵ� �ڼ�Ÿ���� �ν��Ͻ��� �Ѱ��� �� �ִ�.

		Buyer b = new Buyer();

		Product p = new Tv1();
		b.buy(p);
//		== ���� �� ���� �Ʒ��ٰ� ����
//		b.buy(new Tv1());		//buy(Product p)
		
		b.buy(new Computer());	//buy(Product p)

		System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
		System.out.println("���� ���ʽ������� " + b.bonusPoint + "���Դϴ�.");
	}

}


class Product {
	int price;		// ��ǰ�� ����
	int bonusPoint;	// ��ǰ���� �� �����ϴ� ���ʽ�����

	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);	// ���ʽ������� ��ǰ������ 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		// ����Ŭ������ ������ Product(int price)�� ȣ���Ѵ�.
		super(100);		// Tv�� ������ 100�������� �Ѵ�.
	}

	// ObjectŬ������ toString()�� �������̵��Ѵ�.
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { super(200); }

	public String toString() { return "Computer"; }
}

class Buyer {				// ��, ������ ��� ���
	int money = 1000;	  	// �����ݾ�
	int bonusPoint = 0; 	// ���ʽ�����

	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

		money -= p.price;            // ���� ������ ������ ��ǰ�� ������ ����.
		bonusPoint += p.bonusPoint;  // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
//		System.out.println(p.toString() + "��/�� �����ϼ̽��ϴ�.");
	}
}


