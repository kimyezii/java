import java.util.Scanner;

public class Ex5_6 {

	public static void main(String[] args) {
//		 단어의 글자위치를 섞어서 보여주고 원래의 단어를 맞추는 예제이다 실행결과와
//		 같이 동작하도록 예제의 빈 곳을 채우시오.

		String[] words = { "television", "computer", "mouse", "phone" };
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < words.length; i++) {
			char[] question = words[i].toCharArray(); // String을 char[]로 변환.

			for (int j = 0; j < question.length; j++) {
				int idx = (int) (Math.random() * question.length);

				char tmp = question[i];
				question[i] = question[idx];
				question[idx] = tmp;
			}

			System.out.printf("Q%d. %s의 정답을 입력하세요 : ", i + 1, new String(question));

			String answer = sc.nextLine();

			// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if (words[i].equals(answer.trim())) {
				System.out.printf("맞았습니다.%n%n");
			} else {
				System.out.printf("틀렸습니다.%n%n");
			}
		}

	}

}
//toCharArray() : 문자열을 한 글자씩 쪼개서 char타입의 배열에 집어 넣어주는 메소드.
//trim() : 문자열을 입력받거나 문자열을 합칠경우 쓸데없는 공백을 제거하는 Trim함수.