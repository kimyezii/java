import java.util.Iterator;
import java.util.Scanner;

public class Ex9_2 {

	public static void main(String[] args) {
		//while�� 
		
		int num = 0, sum = 0;
		System.out.print("���ڸ� �Է��ϼ���.(��:123456): ");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	//�Է¹��� ������ tmp�� ����
		num = Integer.parseInt(tmp); //�Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ
		
		while(num!=0) {
			//num�� 10���� ���� �������� sum�� ����
			sum += num%10; 		//sum = sum + num%10;
			System.out.printf("sum=%2d num=%d\n", sum, num);
			
			num /= 10; //num = num/10; num(�Է¹�����)�� 10���� ������
		}
		
		System.out.println("�� �ڸ����� ��:"+sum);
		
		
		
	}

}
