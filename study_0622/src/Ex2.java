class Data { int x;}
public class Ex2 {

	public static void main(String[] args) {
		//	�⺻���Ű�����
		
		//  �⺻���Ű����� - ������ ���� �б⸸ �� �� �ִ�. (read only)
		//	�������Ű����� - ������ ���� �а� ������ �� �ִ�. (read&write) 

		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
	}
	
	static void change(int x) {	//�⺻�� �Ű�����
		x = 1000;		//��������
		System.out.println("change() : x " + x);
	}

}
