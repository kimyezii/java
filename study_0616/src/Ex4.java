import java.util.Iterator;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//������ ���� �����
		//Math.random() 0�� 1����(1�� ����x)�� ������ double���� ��ȯ
		
		int num = 0;
		
//		for(int i=1; i<=5; i++) {
//			num = (int)(Math.random()*6) + 1;
//			System.out.println(num);
//		}
		
		
		
		//��ȣ���� ������ 20�� �ݺ��Ѵ�.
		//1~10������ ������ 20�� ����ϱ�
		//1,2,3,4,5,6,7,8,9,10 = 10��
		for(int i=1; i<=20; i++) {
//			System.out.println(Math.random()); 				// 0.0 <= x < 1.0
//			System.out.println(Math.random()*10); 			// 0.0 <= x < 10.0
//			System.out.println((int)(Math.random()*10)); 	// 0 <= x < 10
			System.out.println((int)(Math.random()*10)+1); 	// 1 <= x < 11
		}
		// -5~5������ ������ 20�� ���
		//-5,-4,-3,-2,-1,0,1,2,3,4,5 = 11��
		//System.out.println((int)(Math.random()*11)); 		// 0 <= x < 11
		//System.out.println((int)(Math.random()*11)-5); 	// -5 <= x < 6
		
		
		
		
	}

}
