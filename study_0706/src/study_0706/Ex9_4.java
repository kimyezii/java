package study_0706;

public class Ex9_4 {

	public static void main(String[] args) {
		System.out.println(contains("12345", "23"));
		System.out.println(contains("12345", "67"));

	}

	public static boolean contains(String src, String target) {
		return src.indexOf(target) != -1;
		//indexOf()�� ������ ���ڿ�(src)���� Ư�� ���ڿ�(target)�� ã�Ƽ� �� ��ġ�� �˷��ش�.
		//���� ã�� ���Ѵٸ� -1�� ��ȯ�ϹǷ� indexOf()�� ����� -1������ Ȯ���ؼ� �� ����� �����ָ� �ȴ�.
	}

}
