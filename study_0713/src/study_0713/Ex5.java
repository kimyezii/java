package study_0713;

import java.util.*;

//Iterator, HashMap과 지네릭스
public class Ex5 {

	public static void main(String[] args) {
		HashMap<String, Student5> map = new HashMap<>(); // JDK1.7부터 생성자에 타입지정 생략가능.
		map.put("자바왕", new Student5("자바왕", 1, 1, 100, 100, 100));
		
		Student5 s = map.get("자바왕");
		
		System.out.println(map);
	} // main
}

class Student5 {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student5(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}