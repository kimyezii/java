
public class Ex2 {

	public static void main(String[] args) {
		// String클래스
		
					//	 01234
		String str = "ABCDE";
		char ch = str.charAt(4);	//charAt() 해당 위치 문자를 반환
//		System.out.println(ch);
		
		String str2 = str.substring(1,4);//substring(from,to) to는 포함X
		String str3 = str.substring(1);	//(시작위치)~끝까지
		String str4 = str.substring(1, str.length());
		
		
		System.out.println(str3);
		
		
		
		
		
		
		
		
		
		
		
	}

}
