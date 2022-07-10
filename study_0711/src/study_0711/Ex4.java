package study_0711;

import java.util.*;

//HashSet
public class Ex4 {

	public static void main(String[] args) {
		Set set = new HashSet();

		//set�� ũ�Ⱑ 6���� ���� ���� 1~45������ ������ ����
		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(new Integer(num));
		}

		//0.set�� ���ĺҰ�
		List list = new LinkedList(set); // LinkedList(Collection c) 1.set�� ��� ��Ҹ� list�� ����
		Collections.sort(list); // Collections.sort(List list) 2.list�� ����
		System.out.println(list); //3.list�� ���
	}

}
