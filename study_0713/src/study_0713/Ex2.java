package study_0713;
//지네릭스  타입 변수
import java.util.ArrayList;

public class Ex2 {

	public static void main(String[] args) {
//		ArrayList<Object> list = new ArrayList<Tv>();	//기본적으로 안됨
//					ㄴ참조변수에 대입된 타입과 ㄴ생성자에 대입된 타입은 같아야함.
		
		ArrayList<Tv> list = new ArrayList<Tv>();	//Tv타입의 객체만 저장가능
		list.add(new Tv());
//		list.add(new Audio());
		
		
		
	}

}
class Tv {}
class Audio {}