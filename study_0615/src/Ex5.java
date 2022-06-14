
public class Ex5 {

	public static void main(String[] args) {
		//나머지 연산자 %
		int x = 10;
		int y = 8;
		
		System.out.printf("%d을 %d로 나누면, %n", x, y);
		System.out.printf("몫은 %d이고, 나머지는 %d입니다.%n", x/y, x%y);
		

		//문자열의 비교
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
		
		
	}

}
