import java.util.Arrays;

public class Ex5_3 {

	public static void main(String[] args) {
		//배열의 활용 - <섞기> 배열의 요소의 순서를 반복해서 바꿈
		
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10);	//0~9중의 한 값을 임의로 얻음
			
			int tmp = numArr[0];	//numArr[0]과
			numArr[0] = numArr[n];	//numArr[n]의 값을
			numArr[n] = tmp;		//서로 바꾼다.
		}
		System.out.println(Arrays.toString(numArr));
		//중복된 값은 나올 수 없음.
		//단순히 자리만 바꾸었기 때문.
		
		
		
	}

}
