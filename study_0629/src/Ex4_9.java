
public class Ex4_9 {

	public static void main(String[] args) {
//		intŸ���� ���� num�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
//		���� ���� num�� ���� 12345���, ��1+2+3+4+5���� ����� 15�� ����϶�.

		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
			
			
			
			
			
			
			
			
			
			
			
	}

}
