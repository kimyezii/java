
public class Ex1 {

	public static void main(String[] args) {
		//  return�� - ���� ���� �޼��带 �����ϰ� ȣ���� ������ �ǵ��ư���.

		MyMath mm = new MyMath();
		mm.printGugudan(5);
	}

}


class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9))
			return;		//�Է¹��� ���� 2~9�� �ƴϸ� �޼��� �����ϰ� ���ư���
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
		//return;	��ȯŸ���� void�̹Ƿ� ��������.
	}
	
}