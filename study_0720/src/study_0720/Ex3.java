package study_0720;

import java.util.function.Function;

//�޼��� ����
public class Ex3 {

	public static void main(String[] args) {
//		Function<String,Integer> f = (String s) -> Integer.parseInt(s);
//		Function<String,Integer> f = Ŭ�����̸�::�޼����̸�;
		Function<String,Integer> f = Integer::parseInt;//�޼��� ����
		System.out.println(f.apply("100")+200);
	}

}
