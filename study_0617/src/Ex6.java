import java.util.Arrays;

public class Ex6 {

	public static void main(String[] args) {
		//String�迭�� ����� ����
		
		String[] strArr = {"����","����","��"};	
		System.out.println(Arrays.toString(strArr));
		
		for(int i=0; i<1; i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println("���: "+strArr[tmp]);
		}
		
		
	}

}
