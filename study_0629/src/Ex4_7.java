
public class Ex4_7 {

	public static void main(String[] args) {
//		 ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
//		 ���� ���ڿ��� "12345"���, ��1+2+3+4+5���� ����� 15�� ����� �Ǿ�� �Ѵ�.

			String str = "12345";
			int sum = 0;
			
			for(int i=0; i<str.length(); i++) {
				sum += str.charAt(i) - '0';
//							�����ڿ����� i��° ���ڸ� ��ȯ.
			}
			System.out.println(sum);
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
