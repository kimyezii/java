package study_0713;

import java.util.*;

//Iterator, HashMap�� ���׸���
public class Ex5 {

	public static void main(String[] args) {
		HashMap<String, Student5> map = new HashMap<>(); // JDK1.7���� �����ڿ� Ÿ������ ��������.
		map.put("�ڹٿ�", new Student5("�ڹٿ�", 1, 1, 100, 100, 100));
		
		Student5 s = map.get("�ڹٿ�");
		
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