package study_0707;
//Iterator

import java.util.ArrayList;
import java.util.Iterator;

public class Ex5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		//한번 더 출력하고 싶을때
//		iterator는 1회용이라 다 쓰고나면 다시 얻어와야 한다.
		
//		it = list.iterator();	//새로운 iterator객체를 얻는다.
//		
//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
		
		
	}

}
