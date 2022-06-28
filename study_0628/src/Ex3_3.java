public class Ex3_3 {

	public static void main(String[] args) {
		// 추상클래스의작성1
		//여러 클래스에 공통적으로 사용될 수 있는 추상클래스를 바로 작성하거나
		//기존 클래스의 <공통 부분>을 뽑아서 추상클래스를 만든다.
		
//		Unit[] group = { new Marine(), new Tank(), new Dropship() };
//		==
		Unit[] group = new Unit[3];		//객체배열: 참조변수 묶은 것
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		
		//group의 타입은 Unit[], group[0], group[1], group[2]의 타입은 Unit
		group[0].move(100,200);		//Marine객체의 move(100,200)을 호출
		group[1].move(100,200);		//Tank객체의 move(100,200)을 호출
		group[2].move(100,200);		//Dropship객체의 move(100,200)을 호출
//		참조변수
		
		for(int i = 0; i <group.length; i++)
			group[i].move(100,200);
	}

}
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {	/* 현재 위치에 정지 */}
}
	
class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ", y=" + y + "]");
	}

	void stimPack() {	/* 스팀팩을 사용한다. */}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}

	void changeMode() {	/* 공격모드를 변환한다. */}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	
	void changeMode() {	/* 공격모드를 변환한다. */}
}
















