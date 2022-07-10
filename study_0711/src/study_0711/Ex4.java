package study_0711;

import java.util.*;

//HashSet
public class Ex4 {

	public static void main(String[] args) {
		Set set = new HashSet();

		//set의 크기가 6보다 작은 동안 1~45사이의 난수를 저장
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(new Integer(num));
		}

		//0.set은 정렬불가
		List list = new LinkedList(set); // LinkedList(Collection c) 1.set의 모든 요소를 list에 저장
		Collections.sort(list); // Collections.sort(List list) 2.list를 정렬
		System.out.println(list); //3.list를 출력
	}

}
