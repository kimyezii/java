package study_0711;

import java.util.*;

//TreeSet
public class Ex7 {

	public static void main(String[] args) {
		Set set = new TreeSet();	//�����˻�, ����. ���� ���� �ʿ����
//		Set set = new HashSet();	//���� �ʿ�

		for (int i = 0; set.size() < 6; i++) {
			int num = (int) (Math.random() * 45) + 1;
			set.add(num); // set.add(new Integer(num));
		}

		System.out.println(set);
	}

}
