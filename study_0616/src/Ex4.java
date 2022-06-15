import java.util.Iterator;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//임의의 정수 만들기
		//Math.random() 0과 1사이(1은 포함x)의 임의의 double값을 반환
		
		int num = 0;
		
//		for(int i=1; i<=5; i++) {
//			num = (int)(Math.random()*6) + 1;
//			System.out.println(num);
//		}
		
		
		
		//괄호안의 내용을 20번 반복한다.
		//1~10사이의 난수를 20개 출력하기
		//1,2,3,4,5,6,7,8,9,10 = 10개
		for(int i=1; i<=20; i++) {
//			System.out.println(Math.random()); 				// 0.0 <= x < 1.0
//			System.out.println(Math.random()*10); 			// 0.0 <= x < 10.0
//			System.out.println((int)(Math.random()*10)); 	// 0 <= x < 10
			System.out.println((int)(Math.random()*10)+1); 	// 1 <= x < 11
		}
		// -5~5사이의 난수를 20개 출력
		//-5,-4,-3,-2,-1,0,1,2,3,4,5 = 11개
		//System.out.println((int)(Math.random()*11)); 		// 0 <= x < 11
		//System.out.println((int)(Math.random()*11)-5); 	// -5 <= x < 6
		
		
		
		
	}

}
