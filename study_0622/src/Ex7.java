public class Ex7 {

	public static void main(String[] args) {
		//오버로딩 - 한 클래스 안에 같은 이름의 메서드를 여러개 정의하는 것.
		
		//오버로딩 성립 조건
		//1.메서드 이름이 같아야 한다.
		//2.매개변수의 개수 또는 타입이 달라야 한다.
		//3.반환 타입은 영향없다.
		
		MyMath3 mm = new MyMath3();
		System.out.println("mm.add(3,3) 결과: "+mm.add(3,3));
		System.out.println("mm.add(3L,3) 결과: "+mm.add(3L,3));
		System.out.println("mm.add(3,3L) 결과: "+mm.add(3,3L));
		System.out.println("mm.add(3L,3L) 결과: "+mm.add(3L,3L));
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
		
	}
	
}
//오버로딩의 올바른 예 - 매개변수는 다르지만 같은 의미의 기능 수행
class MyMath3 {
	//오버로딩1
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a+b;
	}
	//오버로딩2
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a+b;
	}
	//오버로딩3
	int add(int[] a) {		//배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i<a.length; i++)
			result += a[i];
		
		return result;
	}
}