package study_0705;

import java.util.ArrayList;

public class Ex5 {

	public static void main(String[] args) {
		// 	����ڽ� & ��ڽ�
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(100));		//list���� ��ü�� �߰�����	//��ü <--|
		list.add(100);	// JDK1.5�������� ����.						//�⺻��__|
		
		
//		Integer i = list.get(0);	//list�� ����� ù��° ��ü�� ������.
//		int i = list.get(0).intValue();	//intValue()�� Integer�� int�� ��ȯ
		int i = list.get(0);	//
		
		
		
	}

}
