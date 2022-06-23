
public class Ex3 {

	public static void main(String[] args) {
		// 변수의 초기화
		//지역변수는 수동 초기화 해야함
		//멤버변수(iv,cv)는 자동 초기화됨
	}

}
class InitTest {
	int x;		//인스턴스변수
	int y = x;		//인스턴스변수
	
	void method1() {
		int i;			//지역변수
		int j = i;		//에러. 지역변수를 초기화하지 않고 사용
	}
}
