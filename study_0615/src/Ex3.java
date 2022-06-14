
public class Ex3 {

	public static void main(String[] args) {
		//형변환 연산자
/*	int -> char (char)65	결과'A'
 *  char-> int	(int)'A'	결과 65
 *  float->int	(int)1.6f	결과 1	실수 -> 정수
 *  int ->float (float)10	결과 10.0f 
 */
		
		
		//자동 형변환
/*	 byte b = 100;			byte범위(-128~127)
 *   byte b = (byte)100; 	ok. byte타입으로 자동 형변환하여 대입
 *  
 *   int i = 100;
 *   byte b = i; 에러. 	int타입을 byte의 타입에 대입
 *   byte b = (byte)i; 	ok. byte타입으로 수동 형변환하여 대입
 * */
		
	/* byte b = 1000;	에러 byte타입의 범위(-128~127)를 벗어난 값의 대입
	 * byte b = (byte)1000; 	ok.그러나 값 손실이 발생해서 변수 b에는 -24가 저장됨
	 * */
		
		//산술변환
/*	int a = 1_000_000;	1백만
 *  int b = 2_000_000;	2백만
 *  
 *  long c = a * b;		2,000,000,000,000?
 *  System.out.println(c)	결과 : -1454759936
 *  
 *  long c = (long)a * b;	
 * */		
		
	}

}
