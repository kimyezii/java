
public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100;
//		ㄴ final : 수정할 수 없는. 초기화 필수
		
		boolean power = true;
		
		byte b = 127; /*-128~127*/
		
		int oct = 010; /*8진수(0), 10진수로 8*/
		int hex = 0x10;/*16진수(0x), 10진수로 16*/
		
		long I = 10000000000L; 
		
		float f = 3.14f;
		double d = 3.14f;
		
		char ch = 'A';
		int i = 'A'; /*문자코드가 저장이 됨*/
		
		String str = "";
		String str2 = "ABCD";
		String str3 = "123";
		String str4 = str2 + str3;
//		System.out.println(score);
//		System.out.println(power);
//		System.out.println(oct);
//		System.out.print(hex);
		
//		System.out.println(10.);
//		System.out.println(.10);
//		System.out.println(10f);
//		System.out.println(1e3);
		
//		System.out.println(i);
		
		System.out.println(""+7+7);
		System.out.println(7+7+"");
		
	}

}
