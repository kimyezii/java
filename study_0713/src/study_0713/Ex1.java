package study_0713;
//���׸���
import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(10);	//list.add(new Integer(10));
		list.add(20);
		list.add("30");	//���׸��� ���п� Ÿ�� üũ�� ��ȭ��. 
		
//		Integer i = (Integer)list.get(2);	//������ OK
//		Integer i = list.get(2);	//����ȯ ���� ����
		
		String i = (String)list.get(2);
		
		System.out.println(list);

	}

}
