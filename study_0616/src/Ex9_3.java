import java.util.Iterator;
import java.util.Scanner;

public class Ex9_3 {

	public static void main(String[] args) {
		// do while�� 
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;		//1~100������ ������ �� ����
//		System.out.println("��:"+answer);
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է��Ͻÿ�: ");
			input = scanner.nextInt();
			
			if(input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ��غ�����.");
			} else if(input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ��غ�����.");
			}
		}while(input!=answer);
		
		System.out.println("����");
		
		
		
		
	}

}
