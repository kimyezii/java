import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//��ø if��
		int score = 0;
		char grade = ' ', opt= ' ';
		
		System.out.print("������ �Է����ּ���: ");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	//�Է¹��� ������ score����
		
		System.out.printf("����� ������ %d�Դϴ�.\n", score);
		
		if(score >= 90) {				//score�� 90�� ���� ���ų� ũ�� A����
			grade = 'A';
			if(score >= 98) {			//90�� �̻� �߿����� 98�� �̻��� A+
				opt = '+';
			} else if(score < 94) {		//90�� �̻� 94�� �̸��� A-
				opt = '-';
			}
		}else if(score >= 80) {			//score�� 80�� ���� ���ų� ũ�� B����
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {		
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		System.out.printf("����� ������ %c%c�Դϴ�.\n", grade, opt);
	}

}
