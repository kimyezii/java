import java.util.Iterator;
import java.util.Scanner;

public class Ex9_1 {

	public static void main(String[] args) {
		//while문 반복횟수 모를때
		
//		while (조건식) {
//			조건식의 연산결과가 true인 동안 반복될 문장
//			
//		}
		
//		int i = 5;	//반복할 횟수를 넣는다.
//		while(i!=0) {
//			i--;
//			System.out.println(i);
//		}
		
		
		int sum = 0;
		int i = 0;
		// i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while (sum <= 100) {
			System.out.printf("%d - %d\n", i, sum);
			sum += ++i;
		}
		
		
		
	}

}
