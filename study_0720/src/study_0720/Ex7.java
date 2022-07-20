package study_0720;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//��Ʈ������� - ������ ��
public class Ex7 {

	public static void main(String[] args) {
////		IntStream intStream = new Random().ints();	//���ѽ�Ʈ��
//		IntStream intStream = new Random().ints(5,10);	//���ѽ�Ʈ��
//		intStream
//		.limit(5)//5���� �ڸ���
//		.forEach(System.out::println);

		//iterate(T seed, UnaryOperator f) ���� ������
		Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);
		intStream.limit(10).forEach(System.out::println);
		
		//generate(Supplier s) : �ֱ⸸ �ϴ� ��. �Է�X, ���O
		Stream<Integer> ontStream = Stream.generate(()->1);
		ontStream.limit(10).forEach(System.out::println);

	}

}
