import java.util.Arrays;

public class Ex5_1 {

	public static void main(String[] args) {
		//배열의 활용 - <총합과 평균>
		int sum = 0;		//총합을 저장하기 위한 변수
		float average = 0f; //평균을 저장하기 위한 변수
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i=0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length;	//계산결과를 float타입으로 변환
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + average);
		
		
		//int 478 / int 5 = 95
		//478 / float 5 -> 478 / float 5.0f -> float 478.0f / float 5.0f -> 95.6f
	}

}
