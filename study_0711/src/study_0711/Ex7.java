package study_0711;

import java.util.*;

//TreeSet
public class Ex7 {

	public static void main(String[] args) {
		Set set = new TreeSet();	//범위검색, 정렬. 정렬 해줄 필요없음
//		Set set = new HashSet();	//정렬 필요

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num); // set.add(new Integer(num));
		}

		System.out.println(set);
	}

}
