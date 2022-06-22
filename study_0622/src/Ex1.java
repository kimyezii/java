
public class Ex1 {

	public static void main(String[] args) {
		//  return문 - 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다.

		MyMath mm = new MyMath();
		mm.printGugudan(5);
	}

}


class MyMath {
	void printGugudan(int dan) {
		if(!(2<=dan && dan<=9))
			return;		//입력받은 단이 2~9가 아니면 메서드 종료하고 돌아가기
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * i);
		}
		//return;	반환타입이 void이므로 생략가능.
	}
	
}