import java.util.Iterator;
import java.util.Scanner;

public class Ex9_1 {

	public static void main(String[] args) {
		//while�� �ݺ�Ƚ�� �𸦶�
		
//		while (���ǽ�) {
//			���ǽ��� �������� true�� ���� �ݺ��� ����
//			
//		}
		
//		int i = 5;	//�ݺ��� Ƚ���� �ִ´�.
//		while(i!=0) {
//			i--;
//			System.out.println(i);
//		}
		
		
		int sum = 0;
		int i = 0;
		// i�� 1�� �������Ѽ� sum�� ��� ���س�����.
		while (sum <= 100) {
			System.out.printf("%d - %d\n", i, sum);
			sum += ++i;
		}
		
		
		
	}

}
