package study_0711;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HashSet1
public class Ex3 {

	public static void main(String[] args) {
		Object[] objArr = { "1", new Integer(1), "2", "2", "3", "3", "4", "4", "4" };
		Set set = new HashSet();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]); // HashSet�� objArr�� ��ҵ��� �����Ѵ�.
//			System.out.println(objArr[i]+"="+set.add(objArr[i]));

		}
		// HashSe�� ����� ��ҵ��� ����Ѵ�.
		System.out.println(set);

		System.out.println();
		System.out.println();
		System.out.println();

		// HashSet�� ����� ��ҵ��� ����Ѵ�.(Iterator�̿�)
		Iterator it = set.iterator();

		while (it.hasNext()) {// �о�� ��Ұ� �ִ��� Ȯ��
			System.out.println(it.next());// ��� �ϳ� ��������
		}
	}

}
