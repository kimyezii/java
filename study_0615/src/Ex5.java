
public class Ex5 {

	public static void main(String[] args) {
		//������ ������ %
		int x = 10;
		int y = 8;
		
		System.out.printf("%d�� %d�� ������, %n", x, y);
		System.out.printf("���� %d�̰�, �������� %d�Դϴ�.%n", x/y, x%y);
		

		//���ڿ��� ��
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		
	}

}
