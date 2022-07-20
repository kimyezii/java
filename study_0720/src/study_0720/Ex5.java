package study_0720;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//스트림만들기
public class Ex5 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();	//list를 Stream으로 변환
		intStream.forEach(System.out::print);	//forEach()최종연산
		
		//stream은 1회용. stream에 대해 최종연산을 수행하면 stream이 닫힌다.
		intStream = list.stream();	//list로부터 stream을 생성
		intStream.forEach(System.out::print);

	}

}
