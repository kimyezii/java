
public class PrintEx1 {

	public static void main(String[] args) {
//		System.out.println(10.0/3);
//		실수의 자리수 조절불가
		
		//System.out.printf("%.2f", 10.0/3); //3.33 소수점 둘째자리
		System.out.printf("%d\n", 15); 	// 10진수 정수의 형식으로 출력
		System.out.printf("%o\n", 15);	//8진수
		System.out.printf("%x\n", 15); // 16진수 정수의 형식으로 출력
//		8진수와 16진수의 접두사 붙이는 법: "%#o", "%#x" -> '#'붙이기
		System.out.printf("%s\n", Integer.toBinaryString(15)); //이진문자열로 출력
		
		System.out.printf("age:%d year:%d\n", 14, 2017);
		
		double f = 123.456789;
		System.out.printf("%f\n", f);
		System.out.printf("%e\n", f);
		System.out.printf("%g\n", f);
		
		System.out.printf("[%5d]\n", 10); //5자리 출력, 3자리 공백
		System.out.printf("[%-5d]\n", 10); //왼쪽정렬
		System.out.printf("[%05d]\n", 10); // 공백을 0으로 채움
		
		double d = 1.23456789;
		System.out.printf("%.6f\n", d);
		
		System.out.printf("[%s]\n", "www.codechobo.com");
		System.out.printf("[%20s]\n", "www.codechobo.com");
		System.out.printf("[%-20s]\n", "www.codechobo.com");
		System.out.printf("[%.10s]\n", "www.codechobo.com"); //10자리
		
	}

}
