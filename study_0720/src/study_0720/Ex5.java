package study_0720;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//��Ʈ�������
public class Ex5 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();	//list�� Stream���� ��ȯ
		intStream.forEach(System.out::print);	//forEach()��������
		
		//stream�� 1ȸ��. stream�� ���� ���������� �����ϸ� stream�� ������.
		intStream = list.stream();	//list�κ��� stream�� ����
		intStream.forEach(System.out::print);

	}

}
