import java.util.Scanner;

public class Ex4_10 {

	public static void main(String[] args) {
//		������ ���ڸ��߱� ������ �ۼ��� ���̴� 1�� 100������ ���� �ݺ������� �Է��ؼ� 
//		��ǻ�Ͱ� ������ ���� ���߸� ������ ������. ����ڰ� ���� �Է��ϸ� ��ǻ�ʹ� �ڽ��� ������ ���� 
//		���ؼ� ����� �˷��ش�. ����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ 
//		�� �� ���� ���ڸ� ������� �˷��ش�. 
		
		
//		1~100������ ������ ���� �� answer�� �����Ѵ�.
		int answer = (int)(Math.random()*100)+1;
		int input = 0;				//������Է��� ������ ����
		int count = 0;				//�õ�Ƚ���� �������� ����
		
		//ȭ�����κ��� ������Է��� �ޱ� ���ؼ� ScannerŬ���� ���
		Scanner sc = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1�� 100������ ���� �Է��ϼ��� : ");
			input = sc.nextInt();		//�Է¹��� ���� ���� input�� �����Ѵ�.
			
			if(answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else if(answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}else {
				System.out.println("�����Դϴ�.");
				System.out.println("�õ�Ƚ���� "+ count + "�� �Դϴ�.");
				break;			//do-while���� �����.
			}
			
		}
		while(true);	//���ѹݺ���
		
		
			
			
			
			
//		//1.�� ���� 100�� ���Ѵ�.
//		0.0 * 100 <= 	Math.random() * 100 < 1.0 * 100
//			0.0<= Math.random() * 100 < 100.0
//		
		
//		//2.�� ���� int������ ��ȯ�Ѵ�.
//		(int)0.0 <= (int)(Math.random()*100) < (int)100.0
//			  0 <= (int)(Math.random()*100) < 100
//		
		
//		//3.�� ���� 1�� ���Ѵ�.
//		0 + 1 <= (int)(Math.random()*100) + 1 < 100 + 1
//		   1  <= (int)(Math.random()*100) + 1 < 101
			
			
			
	}

}
