package study_0722;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_5 {

	public static void main(String[] args) {
		String[] strArr = { "aaa", "bb", "c", "dddd" };
		Stream<String> strStream = Stream.of(strArr);
		// int sum = strStream.mapToInt(s-> s.length()).sum();
		int sum = strStream.mapToInt(String::length).sum();
		System.out.println("sum=" + sum);

	}

}
