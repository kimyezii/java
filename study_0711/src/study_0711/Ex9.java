package study_0711;

import java.util.*;

//TreeSet
public class Ex9 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100};

		for(int i=0; i < score.length; i++)
			set.add(new Integer(score[i]));

//		System.out.println("50보다 작은 값 :" + set.headSet(new Integer(50)));
//		System.out.println("50보다 큰 값 :"  + set.tailSet(new Integer(50)));
		System.out.println("50보다 작은 값 :" + set.headSet(50));
		System.out.println("50보다 큰 값 :"  + set.tailSet(50));
		System.out.println("50과 80사이의 값 :"  + set.subSet(40,80));
	}

}
