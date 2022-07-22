package study_0722;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_7 {

	public static void main(String[] args) {
		new Random().ints(1, 46) // 1~45 (46 ) 사이의 정수 은 포함안됨
				.distinct() // 중복제거
				.limit(6) // 6개만
				.sorted() // 정렬
				.forEach(System.out::println); // 화면에 출력

	}

}
