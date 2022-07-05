package study_0705;

public class Ex4 {

	public static void main(String[] args) {
		// 문자열과 숫자변환
		
//		int i = Integer.parseInt("100");
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100",10));	//위와 동일
		System.out.println("i="+Integer.parseInt("100",2));		//2진수
		System.out.println("i="+Integer.parseInt("FF",16));		
		System.out.println("i="+Integer.parseInt("FF"));		
		
		
	}

}
