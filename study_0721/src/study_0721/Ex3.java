package study_0721;
import java.util.*;
import java.util.stream.*;

//스트림의 최종연산 - forEach()
public class Ex3 {

	public static void main(String[] args) {
		String[] strArr = { "Inheritance", "Java", "Lambda", "stream", "OptionalDouble", "IntStream", "count", "sum" };

		Stream.of(strArr).forEach(System.out::println);	//직렬
//		Stream.of(strArr).parallel().forEach(System.out::println);	//병렬
//		Stream.of(strArr).parallel().forEachOrdered(System.out::println);	//순서병렬

		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
		Optional<String> sWord = Stream.of(strArr).filter(s -> s.charAt(0) == 's').findFirst();
//		Optional<String> sWord = Stream.of(strArr).parallel().filter(s -> s.charAt(0) == 's').findAny();

		System.out.println("");
		System.out.println("noEmptyStr=" + noEmptyStr);
		System.out.println("sWord=" + sWord.get());

		// Stream<String>을 IntStream으로 변환 IntStream기본형 스트림
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

		int count = intStream1.reduce(0, (a, b) -> a + 1);
		int sum = intStream2.reduce(0, (a, b) -> a + b);

		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
		System.out.println("max=" + max.getAsInt());
		System.out.println("min=" + min.getAsInt());

	}

}
