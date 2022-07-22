package study_0722;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_6 {

	public static void main(String[] args) {
		String[] strArr = { "aaa", "bb", "c", "dddd" };
		Stream<String> strStream = Stream.of(strArr);
		strStream.map(String::length) // strStream.map(s-> s.length())
				.sorted(Comparator.reverseOrder()) // ���ڿ� ���̷� ���� ����
				.limit(1).forEach(System.out::println); // ���� �� ���ڿ��� ���� ���
	}

}
