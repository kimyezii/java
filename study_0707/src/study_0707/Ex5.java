package study_0707;
//Iterator

import java.util.ArrayList;
import java.util.Iterator;

public class Ex5 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator it = list.iterator();

		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
		
		
		//�ѹ� �� ����ϰ� ������
//		iterator�� 1ȸ���̶� �� ������ �ٽ� ���;� �Ѵ�.
		
//		it = list.iterator();	//���ο� iterator��ü�� ��´�.
//		
//		while(it.hasNext()) {
//			Object obj = it.next();
//			System.out.println(obj);
//		}
		
		
	}

}
