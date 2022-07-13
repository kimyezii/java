package study_0713;
//지네릭스
import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);	//list.add(new Integer(10));
		list.add(20);
		list.add("30");	//지네릭스 덕분에 타입 체크가 강화됨. 
		
//		Integer i = (Integer)list.get(2);	//컴파일 OK
//		Integer i = list.get(2);	//형변환 생략 가능
		
		String i = (String)list.get(2);
		
		System.out.println(list);

	}

}
