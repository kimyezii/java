import java.util.Arrays;

public class Ex6 {

	public static void main(String[] args) {
		//String배열의 선언과 생성
		
		String[] strArr = {"가위","바위","보"};	
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<1; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println("결과: "+strArr[tmp]);
		}
		
		
	}

}
