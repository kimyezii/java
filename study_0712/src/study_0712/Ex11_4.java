package study_0712;

import java.util.*;

public class Ex11_4 {
//��(ban)�� ��ȣ(no)�� ������������ �����ϱ�(���� ���� ��� ��ȣ�� ������)
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student11("���ڹ�", 2, 1, 70, 90, 70));
		list.add(new Student11("���ڹ�", 2, 2, 60, 100, 80));
		list.add(new Student11("ȫ�浿", 1, 3, 100, 100, 100));
		list.add(new Student11("���ü�", 1, 1, 90, 70, 80));
		list.add(new Student11("���ڹ�", 1, 2, 80, 80, 90));
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}

}

class Student11 {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;

	Student11(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int getTotal() {
		return kor + eng + math;
	}

	float getAverage() {
		return (int) ((getTotal() / 3f) * 10 + 0.5) / 10f;
	}

	public String toString() {
		return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
	}
} 

class BanNoAscending implements Comparator {
//	(1)~
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Student11 && o2 instanceof Student11) {
			Student11 s1 = (Student11) o1;
			Student11 s2 = (Student11) o2;
//			return s1.ban==s2.ban ? s1.no - s2.no : s1.ban - s2.ban;
			int result = s1.ban - s2.ban;
			if (result == 0) { // ���� ������, ��ȣ�� ���Ѵ�. ��(ban)�� ������ ����� '0'�̸�(���� ������), ��ȣ(no)��  �����ؼ� ��ȯ�ϱ�.
				return s1.no - s2.no;
			}
			return result;
		}
		return -1;
	}
//	~(1)
}










