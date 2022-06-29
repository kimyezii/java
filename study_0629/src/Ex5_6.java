import java.util.Scanner;

public class Ex5_6 {

	public static void main(String[] args) {
//		 �ܾ��� ������ġ�� ��� �����ְ� ������ �ܾ ���ߴ� �����̴� ��������
//		 ���� �����ϵ��� ������ �� ���� ä��ÿ�.

		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String�� char[]�� ��ȯ.

			for (int j = 0; j < question.length; j++) {
				int idx = (int) (Math.random() * question.length);

				char tmp = question[i];
				question[i] = question[idx];
				question[idx] = tmp;
			}

			System.out.printf("Q%d. %s�� ������ �Է��ϼ��� : ", i + 1, new String(question));

			String answer = sc.nextLine();

			// trim()���� answer�� �¿� ������ ������ ��, equals�� word[i]�� ��
			if (words[i].equals(answer.trim())) {
				System.out.printf("�¾ҽ��ϴ�.%n%n");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�.%n%n");
			}
		}

	}

}
//toCharArray() : ���ڿ��� �� ���ھ� �ɰ��� charŸ���� �迭�� ���� �־��ִ� �޼ҵ�.
//trim() : ���ڿ��� �Է¹ްų� ���ڿ��� ��ĥ��� �������� ������ �����ϴ� Trim�Լ�.