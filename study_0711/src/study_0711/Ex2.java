package study_0711;
//Comparator,Comparable
import java.util.Arrays;
import java.util.Comparator;

public class Ex2 {

	public static void main(String[] args) {
		String[] strArr = { "cat", "Dog", "lion", "tiger" };

		Arrays.sort(strArr); // String�� Comparable������ ���� ����(�⺻����)
		System.out.println("1.strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // ��ҹ��� ���о���
//					 �����Ĵ��		�����ı���
		System.out.println("2.strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); // ���� ����
//		 			�����Ĵ��		�����ı���
		System.out.println("3.strArr=" + Arrays.toString(strArr));

	}

}

//Descending ���ı���
class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; //�⺻���ı��ؿ� -1�� ���ؼ� ������ ����(���->����/����->���)
			//return c2.compareTo(c1)	  // �Ǵ� ������ �ٲ㵵 �ȴ�.
		}
		return -1;
	}
}