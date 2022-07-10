package study_0711;
//Comparator,Comparable
import java.util.Arrays;
import java.util.Comparator;

public class Ex2 {

	public static void main(String[] args) {
		String[] strArr = { "cat", "Dog", "lion", "tiger" };

		Arrays.sort(strArr); // String의 Comparable구현에 의한 정렬(기본정렬)
		System.out.println("1.strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분안함
//					 ㄴ정렬대상		ㄴ정렬기준
		System.out.println("2.strArr=" + Arrays.toString(strArr));

		Arrays.sort(strArr, new Descending()); // 역순 정렬
//		 			ㄴ정렬대상		ㄴ정렬기준
		System.out.println("3.strArr=" + Arrays.toString(strArr));

	}

}

//Descending 정렬기준
class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if (o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			return c1.compareTo(c2) * -1; //기본정렬기준에 -1을 곱해서 역으로 변경(양수->음수/음수->양수)
			//return c2.compareTo(c1)	  // 또는 순서를 바꿔도 된다.
		}
		return -1;
	}
}