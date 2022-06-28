abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() { System.out.println("멈춥니다.");}
}

interface Fightable {		//인터페이스의 모든 메서드는 public abstract. 예외없이
	void move(int x, int y);	//public abstract가 생략됨
	void attack(Fightable f);	//public abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable {
	//오버라이딩 규칙 : 조상(public)보다 접근제어자의 범위가 좁으면 안됨.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	public void attack(Fightable f) {
		System.out.println(f + "를 공격");
	}
	
	//싸울 수 있는 상대를 불러온다.
	Fightable getFightable() {
		Fighter f = new Fighter();	//Fighter를 생성해서 반환
		return f;
	}
}

public class Ex4 {

	public static void main(String[] args) {
		// 인터페이스
		// 추상 메서드의 집합!! - 결론
		// 구현된 것이 전혀 없는 설계도. 껍데기(모든 멤버가 public) - 핵심
		
//		interface 인터페이스이름 {
//			public static final 타입 상수이름 = 값;
//			public abstract 메서드이름(매개변수목록);
//		} 모든 인터페이스의 멤버는 public, 메서드는 추상메서드.
		
		Fighter f = new Fighter();	//Fighter를 생성해서 반환
		Fightable f2 = f.getFightable();
		
//		Fighter u = new Fighter();
//		Fightable f = new Fighter();
//		u.move(100, 200);
//		u.attack(new Fighter());	//Unit2에는 attack()이 없어서 호출불가
//		u.stop();
//		
//		f.move(100, 200);
//		f.attack(new Fighter());
////		f.stop();	//Fightable에는 stop이 없어서 호출불가
		
	}

}















