class Data2 { int x;}
public class Ex3 {

	public static void main(String[] args) {
		//	�������Ű�����
		
		//  �⺻���Ű����� - ������ ���� �б⸸ �� �� �ִ�. (read only)
		//	�������Ű����� - ������ ���� �а� ������ �� �ִ�. (read&write) 

		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data2 d) {	//������ �Ű�����
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
