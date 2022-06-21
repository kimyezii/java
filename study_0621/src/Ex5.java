
public class Ex5 {

	public static void main(String args[]) {
		//메서드호출
		
		MyMath mm = new MyMath();	//1.인스턴스 생성
		//2.메서드 호출
		long result1 = mm.add(5L, 3L); //add메서드 호출 long add(long a, long b) 4.값 저장
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		long result = mm.max(5,3);//둘중에 큰 값을 반환하는 메서드
		System.out.println("max(5L, 3L) = " + result);
		//5.출력
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

//메서드는 클래스영역에만 정의 가능.
 class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;	//3.호출을 받고 작업을 마치면 다시 호출한 곳으로 간다
	// return a + b;	// 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}
	
	//두 값을 받아서 둘중에 큰 값을 반환하는 메서드
	long max(long a, long b) {
//		long result = 0;
//		if(a>b) {
//			result = a;
//		}else {
//			result = b;
//		}
//		return result;
		//==
		return a > b ? a : b;
	}
	
	
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
