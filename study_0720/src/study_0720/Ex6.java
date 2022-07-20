package study_0720;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//스트림만들기 - 배열
public class Ex6 {

	public static void main(String[] args) {
		String[] strArr = {"a","b","c"};
		
//		Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		
		strStream.forEach(System.out::println);
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::println);
//		System.out.println("count="+intStream.count());//최종연산
		System.out.println("sum="+intStream.sum());
		System.out.println("average="+intStream.average());
		
//		Integer[] intArr = {1,2,3,4,5};
//		Stream<Integer> intStream = Arrays.stream(intArr);
////		intStream.forEach(System.out::println);
//		System.out.println("count="+intStream.sum());
		
		
		
	}

}
